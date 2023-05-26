package net.etfbl.ip.webshopbackendapp.controllers;

import net.etfbl.ip.webshopbackendapp.base.CrudController;
import net.etfbl.ip.webshopbackendapp.exceptions.NotFoundException;
import net.etfbl.ip.webshopbackendapp.models.dto.User;
import net.etfbl.ip.webshopbackendapp.models.entities.UserAccountEntity;
import net.etfbl.ip.webshopbackendapp.services.UserAccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("userAccounts")
@CrossOrigin(origins = "http://localhost:4200/")
public class UserAccountController extends CrudController<Integer, UserAccountEntity, User> {

    private final UserAccountService userAccountService;


    public UserAccountController(UserAccountService userAccountService) {
        super(User.class, userAccountService);
        this.userAccountService = userAccountService;
    }

    @GetMapping("/username/{username}")
    public User findByUsername(@PathVariable String username) throws NotFoundException {
        return userAccountService.findByUsername(username);
    }

}
