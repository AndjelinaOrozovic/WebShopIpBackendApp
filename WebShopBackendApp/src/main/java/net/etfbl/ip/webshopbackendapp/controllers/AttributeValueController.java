package net.etfbl.ip.webshopbackendapp.controllers;

import net.etfbl.ip.webshopbackendapp.models.entities.AttributeValueEntity;
import net.etfbl.ip.webshopbackendapp.services.AttributeValueService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/attributeValues")
@CrossOrigin(origins = "http://localhost:4200/")
public class AttributeValueController {

    private final AttributeValueService service;

    protected AttributeValueController(AttributeValueService service) {

        this.service = service;

    }

    @GetMapping("/idProduct/{idProduct}/idAttribute/{idAttribute}")
    public AttributeValueEntity getAttributeValueForProduct(@PathVariable Integer idProduct, @PathVariable Integer idAttribute) {

        return service.findByIdProductAndIdAttribute(idProduct, idAttribute);

    }

    @PostMapping
    public AttributeValueEntity add(@RequestBody AttributeValueEntity attributeValue) {

        return service.add(attributeValue);

    }

}
