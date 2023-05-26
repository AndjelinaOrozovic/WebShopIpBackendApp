package net.etfbl.ip.webshopbackendapp.controllers;

import net.etfbl.ip.webshopbackendapp.base.CrudController;
import net.etfbl.ip.webshopbackendapp.models.dto.Comment;
import net.etfbl.ip.webshopbackendapp.models.entities.CommentEntity;
import net.etfbl.ip.webshopbackendapp.services.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
@CrossOrigin(origins = "http://localhost:4200/")
public class CommentController extends CrudController<Integer, CommentEntity, Comment> {

    private final CommentService service;

    protected CommentController(CommentService service) {

        super(Comment.class, service);
        this.service = service;

    }

    @GetMapping("/idOffer/{id}")
    public List<Comment> findByOfferId(@PathVariable Integer id) {
        return service.findByOfferId(id);
    }



}
