package net.etfbl.ip.webshopbackendapp.controllers;

import net.etfbl.ip.webshopbackendapp.base.CrudController;
import net.etfbl.ip.webshopbackendapp.models.dto.Offer;
import net.etfbl.ip.webshopbackendapp.models.entities.OfferEntity;
import net.etfbl.ip.webshopbackendapp.services.OfferService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offers")
@CrossOrigin(origins = "http://localhost:4200")
public class OfferController extends CrudController<Integer, OfferEntity, Offer> {

    private final OfferService service;

    public OfferController(OfferService service) {
        super(Offer.class, service);
        this.service = service;
    }

    @GetMapping("{id}")
    public Offer findById(@PathVariable Integer id) {

        return service.searchByOfferId(id);

    }

    @GetMapping("/product/{name}")
    public List<Offer> findByProductName(@PathVariable String name) {

        return service.searchByProductName(name);

    }

    @GetMapping("/idCategory/{id}")
    public List<Offer> findByCategory(@PathVariable Integer id) {

        return service.searchByCategory(id);

    }

    @GetMapping("/product/{name}/idCategory/{id}")
    public List<Offer> findByProductAndCategory(@PathVariable String name, @PathVariable Integer id) {
        return service.searchByProductAndCategory(name, id);
    }

    @GetMapping("/idUser/{id}")
    public List<Offer> findByUser(@PathVariable Integer id) {

        return service.searchByUser(id);

    }

    @GetMapping("/active")
    public List<Offer> findActiveOffers() {

        return service.searchActiveOffers();

    }

}
