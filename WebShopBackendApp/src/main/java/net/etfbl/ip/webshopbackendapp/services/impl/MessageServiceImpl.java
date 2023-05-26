package net.etfbl.ip.webshopbackendapp.services.impl;

import jakarta.transaction.Transactional;
import net.etfbl.ip.webshopbackendapp.base.CrudJpaService;
import net.etfbl.ip.webshopbackendapp.models.entities.MessageEntity;
import net.etfbl.ip.webshopbackendapp.repositories.MessageRepository;
import net.etfbl.ip.webshopbackendapp.services.MessageService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MessageServiceImpl extends CrudJpaService<MessageEntity, Integer> implements MessageService {

    private final MessageRepository repository;

    private final ModelMapper modelMapper;

    public MessageServiceImpl(MessageRepository repository, ModelMapper modelMapper) {
        super(repository, MessageEntity.class, modelMapper);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }
}
