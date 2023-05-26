package net.etfbl.ip.webshopbackendapp.controllers;

import net.etfbl.ip.webshopbackendapp.base.CrudController;
import net.etfbl.ip.webshopbackendapp.models.dto.Message;
import net.etfbl.ip.webshopbackendapp.models.entities.MessageEntity;
import net.etfbl.ip.webshopbackendapp.services.MessageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
@CrossOrigin(origins = "httep://localhost:4200/")
public class MessageController extends CrudController<Integer, MessageEntity, Message> {

    protected MessageController(MessageService messageService) {
        super(Message.class, messageService);
    }

}
