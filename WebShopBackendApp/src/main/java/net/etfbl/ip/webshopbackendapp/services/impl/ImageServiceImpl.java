package net.etfbl.ip.webshopbackendapp.services.impl;

import jakarta.transaction.Transactional;
import net.etfbl.ip.webshopbackendapp.base.CrudJpaService;
import net.etfbl.ip.webshopbackendapp.models.entities.ImageEntity;
import net.etfbl.ip.webshopbackendapp.repositories.ImageRepository;
import net.etfbl.ip.webshopbackendapp.services.ImageService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImageServiceImpl extends CrudJpaService<ImageEntity, Integer> implements ImageService {

    private final ImageRepository repository;

    private final ModelMapper modelMapper;

    public ImageServiceImpl(ImageRepository repository, ModelMapper modelMapper) {
        super(repository, ImageEntity.class, modelMapper);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

}
