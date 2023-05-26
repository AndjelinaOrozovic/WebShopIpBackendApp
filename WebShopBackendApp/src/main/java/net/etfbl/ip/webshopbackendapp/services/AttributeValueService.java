package net.etfbl.ip.webshopbackendapp.services;

import net.etfbl.ip.webshopbackendapp.models.entities.AttributeValueEntity;

public interface AttributeValueService {

    AttributeValueEntity findByIdProductAndIdAttribute(Integer idProduct, Integer idAttribute);

    AttributeValueEntity add(AttributeValueEntity attributeValue);

}
