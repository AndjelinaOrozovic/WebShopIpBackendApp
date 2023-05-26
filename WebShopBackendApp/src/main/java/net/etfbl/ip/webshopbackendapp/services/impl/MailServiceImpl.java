package net.etfbl.ip.webshopbackendapp.services.impl;

import net.etfbl.ip.webshopbackendapp.models.dto.Mail;
import net.etfbl.ip.webshopbackendapp.services.MailService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

    private static final String SENDER_NAME = "WebShopApp";

    private static final String TITLE = "PIN for registration";

    private final JavaMailSender javaMailSender;

    public MailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public String sendMail(Mail mail) {

        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();

            mailMessage.setFrom(SENDER_NAME);
            mailMessage.setTo(mail.getReceiver());
            mailMessage.setText(mail.getContent());
            mailMessage.setSubject(TITLE);

            javaMailSender.send(mailMessage);

            return "Mail sent!";

        } catch(Exception e) {

            return "Error while sending mail!";

        }

    }
}
