package net.etfbl.ip.webshopbackendapp.services;

import net.etfbl.ip.webshopbackendapp.base.CrudService;
import net.etfbl.ip.webshopbackendapp.models.dto.Purchase;

import java.util.List;

public interface PurchaseService extends CrudService<Integer> {

    List<Purchase> searchByIdUser(Integer id);

}
