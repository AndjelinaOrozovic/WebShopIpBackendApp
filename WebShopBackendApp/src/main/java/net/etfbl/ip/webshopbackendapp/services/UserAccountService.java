package net.etfbl.ip.webshopbackendapp.services;

import net.etfbl.ip.webshopbackendapp.base.CrudService;
import net.etfbl.ip.webshopbackendapp.exceptions.NotFoundException;
import net.etfbl.ip.webshopbackendapp.models.dto.User;

public interface UserAccountService extends CrudService<Integer> {

    User findByUsername(String username) throws NotFoundException;

}
