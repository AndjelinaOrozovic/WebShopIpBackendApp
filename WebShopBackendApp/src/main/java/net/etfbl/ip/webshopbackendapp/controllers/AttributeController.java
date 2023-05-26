package net.etfbl.ip.webshopbackendapp.controllers;

import net.etfbl.ip.webshopbackendapp.models.entities.AttributeEntity;
import net.etfbl.ip.webshopbackendapp.services.AttributeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attributes")
@CrossOrigin(origins = "http://localhost:4200/")
public class AttributeController {

    AttributeService service;

    protected AttributeController(AttributeService service) {
        this.service = service;
    }


    @GetMapping("/idCategory/{idCategory}")
    public List<AttributeEntity> getAttributesOfCategory(@PathVariable Integer idCategory) {
        return service.findAllByIdCategory(idCategory);
    }
}

