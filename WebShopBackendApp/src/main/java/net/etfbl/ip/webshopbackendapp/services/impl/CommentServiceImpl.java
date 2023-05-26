package net.etfbl.ip.webshopbackendapp.services.impl;

import jakarta.transaction.Transactional;
import net.etfbl.ip.webshopbackendapp.base.CrudJpaService;
import net.etfbl.ip.webshopbackendapp.models.dto.Comment;
import net.etfbl.ip.webshopbackendapp.models.entities.CommentEntity;
import net.etfbl.ip.webshopbackendapp.repositories.CommentRepository;
import net.etfbl.ip.webshopbackendapp.services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CommentServiceImpl extends CrudJpaService<CommentEntity, Integer> implements CommentService {

    private final CommentRepository repository;

    private final ModelMapper modelMapper;

    public CommentServiceImpl(CommentRepository repository, ModelMapper modelMapper) {
        super(repository, CommentEntity.class, modelMapper);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Comment> findByOfferId(Integer id) {
        return repository.findByOfferId(id).stream().map(e -> modelMapper.map(e, Comment.class)).collect(Collectors.toList());
    }

}
