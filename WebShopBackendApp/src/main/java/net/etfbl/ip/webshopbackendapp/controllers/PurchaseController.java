package net.etfbl.ip.webshopbackendapp.controllers;

import net.etfbl.ip.webshopbackendapp.base.CrudController;
import net.etfbl.ip.webshopbackendapp.models.dto.Purchase;
import net.etfbl.ip.webshopbackendapp.models.entities.PurchaseEntity;
import net.etfbl.ip.webshopbackendapp.services.PurchaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
@CrossOrigin(origins = "http://localhost:4200/")
public class PurchaseController extends CrudController<Integer, PurchaseEntity, Purchase> {

    private final PurchaseService service;

    public PurchaseController(PurchaseService service) {

        super(Purchase.class, service);
        this.service = service;

    }

    @GetMapping("/idUser/{id}")
    public List<Purchase> findByIdUser(@PathVariable Integer id) {
        return service.searchByIdUser(id);
    }

}
