package net.etfbl.ip.webshopbackendapp.services.impl;

import jakarta.transaction.Transactional;
import net.etfbl.ip.webshopbackendapp.models.entities.AttributeEntity;
import net.etfbl.ip.webshopbackendapp.repositories.AttributeRepository;
import net.etfbl.ip.webshopbackendapp.services.AttributeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AttributeServiceImpl implements AttributeService {

    private final AttributeRepository repository;

    private final ModelMapper modelMapper;

    public AttributeServiceImpl(AttributeRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<AttributeEntity> findAllByIdCategory(Integer idCategory) {
        return repository.findByIdCategory(idCategory);
    }

}
