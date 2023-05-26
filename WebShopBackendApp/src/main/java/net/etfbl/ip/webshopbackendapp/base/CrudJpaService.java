package net.etfbl.ip.webshopbackendapp.base;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.Getter;
import net.etfbl.ip.webshopbackendapp.exceptions.NotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Getter
public class CrudJpaService<E extends BaseEntity<ID>, ID extends Serializable> implements CrudService<ID> {

    private final JpaRepository<E, ID> repository;
    private final Class<E> entityClass;
    private final ModelMapper modelMapper;
    @PersistenceContext
    private EntityManager entityManager;

    public CrudJpaService(JpaRepository<E, ID> repository, Class<E> entityClass, ModelMapper modelMapper) {

        this.repository = repository;
        this.entityClass = entityClass;
        this.modelMapper = modelMapper;

    }

    @Override
    public <T> List<T> findAll(Class<T> resultDTOClass) {
        return repository.findAll().stream().map(e -> modelMapper.map(e, resultDTOClass)).collect(Collectors.toList());
    }

    @Override
    public <T> T findById(ID id, Class<T> resultDTOClass) throws NotFoundException {
        return modelMapper.map(repository.findById(id).orElseThrow(NotFoundException::new), resultDTOClass);
    }

    @Override
    public <T, U> T insert(U object, Class<T> resultDTOClass) {

        E entity = modelMapper.map(object, entityClass);
        entity.setId(null);
        entity = repository.saveAndFlush(entity);
        entityManager.refresh(entity);

        return modelMapper.map(entity, resultDTOClass);

    }

    @Override
    public <T, U> T update(ID id, U object, Class<T> resultDTOClass) {

        if(!repository.existsById(id)) {
            throw new NotFoundException();
        }

        E entity = modelMapper.map(object, entityClass);
        entity.setId(id);
        entity = repository.saveAndFlush(entity);
        entityManager.refresh(entity);

        return modelMapper.map(entity, resultDTOClass);

    }

    @Override
    public void delete(ID id) throws NotFoundException {

        if(!repository.existsById(id)) {
            throw new NotFoundException();
        }

        repository.deleteById(id);

    }
}
