package net.etfbl.ip.webshopbackendapp.services;

import net.etfbl.ip.webshopbackendapp.base.CrudService;
import net.etfbl.ip.webshopbackendapp.models.dto.Comment;

import java.util.List;

public interface CommentService extends CrudService<Integer>{

    List<Comment> findByOfferId(Integer id);

}
