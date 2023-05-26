package net.etfbl.ip.webshopbackendapp.controllers;

import net.etfbl.ip.webshopbackendapp.base.CrudController;
import net.etfbl.ip.webshopbackendapp.models.dto.Image;
import net.etfbl.ip.webshopbackendapp.models.entities.ImageEntity;
import net.etfbl.ip.webshopbackendapp.services.ImageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/images")
@CrossOrigin(origins = "http://localhost:4200/")
public class ImageController extends CrudController<Integer, ImageEntity, Image> {

    private final ImageService service;

    protected ImageController(ImageService service) {
        super(Image.class, service);
        this.service = service;
    }

}
