package net.etfbl.ip.webshopbackendapp.services;

import net.etfbl.ip.webshopbackendapp.models.dto.Mail;

public interface MailService {

    String sendMail(Mail mail);

}
