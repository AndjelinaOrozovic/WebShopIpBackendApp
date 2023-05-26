package net.etfbl.ip.webshopbackendapp.services.impl;

import jakarta.transaction.Transactional;
import net.etfbl.ip.webshopbackendapp.base.CrudJpaService;
import net.etfbl.ip.webshopbackendapp.models.dto.Purchase;
import net.etfbl.ip.webshopbackendapp.models.entities.PurchaseEntity;
import net.etfbl.ip.webshopbackendapp.repositories.PurchaseRepository;
import net.etfbl.ip.webshopbackendapp.services.PurchaseService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class PurchaseServiceImpl extends CrudJpaService<PurchaseEntity, Integer> implements PurchaseService {

    private final PurchaseRepository repository;

    private final ModelMapper modelMapper;

    public PurchaseServiceImpl(PurchaseRepository repository, ModelMapper modelMapper) {
        super(repository, PurchaseEntity.class, modelMapper);
        this.repository = repository;
        this.modelMapper = modelMapper;
    }


    @Override
    public List<Purchase> searchByIdUser(Integer id) {
        return repository.searchByUserAccountId(id).stream().map(e -> modelMapper.map(e, Purchase.class)).collect(Collectors.toList());
    }
}
