package net.etfbl.ip.webshopbackendapp.services;

import net.etfbl.ip.webshopbackendapp.models.entities.AttributeEntity;

import java.util.List;

public interface AttributeService {

    List<AttributeEntity> findAllByIdCategory(Integer idCategory);

}
