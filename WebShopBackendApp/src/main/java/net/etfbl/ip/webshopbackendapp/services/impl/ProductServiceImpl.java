package net.etfbl.ip.webshopbackendapp.services.impl;

import jakarta.transaction.Transactional;
import net.etfbl.ip.webshopbackendapp.base.CrudJpaService;
import net.etfbl.ip.webshopbackendapp.models.dto.AttributeValue;
import net.etfbl.ip.webshopbackendapp.models.entities.ProductEntity;
import net.etfbl.ip.webshopbackendapp.repositories.ProductRepository;
import net.etfbl.ip.webshopbackendapp.services.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl extends CrudJpaService<ProductEntity, Integer> implements ProductService {

    private final ProductRepository repository;

    private final ModelMapper modelMapper;

    public ProductServiceImpl(ProductRepository repository, ModelMapper modelMapper) {

        super(repository, ProductEntity.class, new ModelMapper());
        this.repository = repository;
        this.modelMapper = modelMapper;

    }

    @Override
    public List<AttributeValue> getAttributesAndValues(Integer id) {
        return repository.getAttributesAndValues(id);
    }
}
