package net.etfbl.ip.webshopbackendapp.services.impl;

import jakarta.transaction.Transactional;
import net.etfbl.ip.webshopbackendapp.models.entities.AttributeValueEntity;
import net.etfbl.ip.webshopbackendapp.repositories.AttributeValueRepository;
import net.etfbl.ip.webshopbackendapp.services.AttributeValueService;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AttributeValueServiceImpl implements AttributeValueService {

    private final AttributeValueRepository repository;

    public AttributeValueServiceImpl(AttributeValueRepository repository) {

        this.repository = repository;

    }


    @Override
    public AttributeValueEntity findByIdProductAndIdAttribute(Integer idProduct, Integer idAttribute) {

        return repository.findByIdProductAndIdAttribute(idProduct, idAttribute);

    }

    @Override
    public AttributeValueEntity add(AttributeValueEntity attributeValue) {
        return repository.saveAndFlush(attributeValue);
    }
}
