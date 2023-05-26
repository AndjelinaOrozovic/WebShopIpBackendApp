package net.etfbl.ip.webshopbackendapp.services.impl;

import jakarta.transaction.Transactional;
import net.etfbl.ip.webshopbackendapp.base.CrudJpaService;
import net.etfbl.ip.webshopbackendapp.exceptions.ConflictException;
import net.etfbl.ip.webshopbackendapp.exceptions.NotFoundException;
import net.etfbl.ip.webshopbackendapp.models.dto.User;
import net.etfbl.ip.webshopbackendapp.models.entities.UserAccountEntity;
import net.etfbl.ip.webshopbackendapp.repositories.UserAccountRepository;
import net.etfbl.ip.webshopbackendapp.services.UserAccountService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserAccountServiceImpl extends CrudJpaService<UserAccountEntity, Integer> implements UserAccountService {

    private final UserAccountRepository repository;

    private final ModelMapper modelMapper;

    protected UserAccountServiceImpl(UserAccountRepository repository, ModelMapper modelMapper) {
        super(repository, UserAccountEntity.class, modelMapper);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public <T, U> T insert(U object, Class<T> resultDtoClass) {
        if(repository.existsByUsername(getModelMapper().map(object, getEntityClass()).getUsername())) {
            throw new ConflictException();
        }
        return super.insert(object, resultDtoClass);
    }

    @Override
    public <T, U> T update(Integer id, U object, Class<T> resultDtoClass) {
        if(repository.existsByUsernameAndIdNot(getModelMapper().map(object, getEntityClass()).getUsername(), id)) {
            throw new ConflictException();
        }

        return super.update(id, object, resultDtoClass);
    }

    @Override
    public User findByUsername(String username) throws NotFoundException {
        return modelMapper.map(repository.findByUsername(username).orElseThrow(NotFoundException::new),
                User.class);
    }
}
