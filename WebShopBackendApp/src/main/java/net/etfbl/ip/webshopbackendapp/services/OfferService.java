package net.etfbl.ip.webshopbackendapp.services;

import net.etfbl.ip.webshopbackendapp.base.CrudService;
import net.etfbl.ip.webshopbackendapp.models.dto.Offer;

import java.util.List;

public interface OfferService extends CrudService<Integer> {

    Offer searchByOfferId(Integer id);

    List<Offer> searchByProductName(String content);

    List<Offer> searchByCategory(Integer id);

    List<Offer> searchByProductAndCategory(String name, Integer id);

    List<Offer> searchByUser(Integer id);

    List<Offer> searchActiveOffers();
}
