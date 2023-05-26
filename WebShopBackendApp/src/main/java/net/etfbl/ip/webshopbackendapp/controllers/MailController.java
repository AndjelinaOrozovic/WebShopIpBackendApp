package net.etfbl.ip.webshopbackendapp.controllers;

import net.etfbl.ip.webshopbackendapp.models.dto.Mail;
import net.etfbl.ip.webshopbackendapp.services.impl.MailServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
@CrossOrigin(origins = "http://localhost:4200/")
public class MailController {

    private final MailServiceImpl mailService;

    public MailController(MailServiceImpl mailService) {
        this.mailService = mailService;
    }

    @PostMapping
    public String insert(@RequestBody Mail mail) {
        return mailService.sendMail(mail);
    }

}
