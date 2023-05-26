package net.etfbl.ip.webshopbackendapp.controllers;

import net.etfbl.ip.webshopbackendapp.base.CrudController;
import net.etfbl.ip.webshopbackendapp.models.dto.AttributeValue;
import net.etfbl.ip.webshopbackendapp.models.dto.Product;
import net.etfbl.ip.webshopbackendapp.models.entities.ProductEntity;
import net.etfbl.ip.webshopbackendapp.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController extends CrudController<Integer, ProductEntity, Product> {

    ProductService productService;

    protected ProductController(ProductService productService) {
        super(Product.class, productService);
        this.productService = productService;
    }

    @GetMapping("/attributesAndValues/{id}")
    public List<AttributeValue> getAttributesAndValues(@PathVariable Integer id) {

        return productService.getAttributesAndValues(id);

    }

}
