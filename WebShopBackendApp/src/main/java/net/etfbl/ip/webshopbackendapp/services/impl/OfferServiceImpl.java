package net.etfbl.ip.webshopbackendapp.services.impl;

import jakarta.transaction.Transactional;
import net.etfbl.ip.webshopbackendapp.base.CrudJpaService;
import net.etfbl.ip.webshopbackendapp.models.dto.Offer;
import net.etfbl.ip.webshopbackendapp.models.entities.OfferEntity;
import net.etfbl.ip.webshopbackendapp.repositories.OfferRepository;
import net.etfbl.ip.webshopbackendapp.services.OfferService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class OfferServiceImpl extends CrudJpaService<OfferEntity, Integer> implements OfferService {

    private final OfferRepository repository;

    private final ModelMapper modelMapper;

    public OfferServiceImpl(OfferRepository repository, ModelMapper modelMapper) {
        super(repository, OfferEntity.class, modelMapper);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Offer searchByOfferId(Integer id) {
        return modelMapper.map(repository.searchById(id), Offer.class);
    }

    @Override
    public List<Offer> searchByProductName(String content) {
        return repository.selectByProductName(content).stream().map(e -> modelMapper.map(e, Offer.class)).collect(Collectors.toList());
    }

    @Override
    public List<Offer> searchByCategory(Integer id) {
        return repository.selectByProductCategoryId(id).stream().map(e -> modelMapper.map(e, Offer.class)).collect(Collectors.toList());
    }

    @Override
    public List<Offer> searchByProductAndCategory(String name, Integer id) {
        return repository.selectByProductNameAndCategoryId(name, id).stream().map(e -> modelMapper.map(e, Offer.class)).collect(Collectors.toList());
    }

    @Override
    public List<Offer> searchByUser(Integer id) {
        return repository.selectByUserId(id).stream().map(e -> modelMapper.map(e, Offer.class)).collect(Collectors.toList());
    }

    @Override
    public List<Offer> searchActiveOffers() {
        return repository.selectActiveOffers().stream().map(e -> modelMapper.map(e, Offer.class)).collect(Collectors.toList());
    }
}
