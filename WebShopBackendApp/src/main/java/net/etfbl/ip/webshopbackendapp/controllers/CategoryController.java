package net.etfbl.ip.webshopbackendapp.controllers;

import net.etfbl.ip.webshopbackendapp.base.CrudController;
import net.etfbl.ip.webshopbackendapp.models.dto.Category;
import net.etfbl.ip.webshopbackendapp.models.entities.CategoryEntity;
import net.etfbl.ip.webshopbackendapp.services.CategoryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
@CrossOrigin(origins = "http://localhost:4200/")
public class CategoryController extends CrudController<Integer, CategoryEntity, Category> {

    protected CategoryController(CategoryService service) {
        super(Category.class, service);
    }
}
