package net.etfbl.ip.webshopbackendapp.base;

import net.etfbl.ip.webshopbackendapp.exceptions.NotFoundException;

import java.io.Serializable;
import java.util.List;

public interface CrudService<ID extends Serializable> {

    <T> List<T> findAll(Class<T> resultDTOClass);

    <T> T findById(ID id, Class<T> resultDTOClass) throws NotFoundException;

    <T, U> T insert(U object, Class<T> resultDTOClass);

    <T, U> T update(ID id, U object, Class<T> resultDTOClass);

    void delete(ID id) throws NotFoundException;

}
