package net.etfbl.ip.webshopbackendapp.services;

import net.etfbl.ip.webshopbackendapp.base.CrudService;
import net.etfbl.ip.webshopbackendapp.models.dto.AttributeValue;

import java.util.List;

public interface ProductService extends CrudService<Integer> {

    List<AttributeValue> getAttributesAndValues(Integer id);

}
