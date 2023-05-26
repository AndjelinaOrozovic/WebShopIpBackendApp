package net.etfbl.ip.webshopbackendapp.services.impl;

import jakarta.transaction.Transactional;
import net.etfbl.ip.webshopbackendapp.base.CrudJpaService;
import net.etfbl.ip.webshopbackendapp.models.entities.CategoryEntity;
import net.etfbl.ip.webshopbackendapp.repositories.CategoryRepository;
import net.etfbl.ip.webshopbackendapp.services.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CategoryServiceImpl extends CrudJpaService<CategoryEntity, Integer> implements CategoryService {

    private final ModelMapper modelMapper;

    private final CategoryRepository repository;

    public CategoryServiceImpl(CategoryRepository repository, ModelMapper modelMapper) {
        super(repository, CategoryEntity.class, modelMapper);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

}
