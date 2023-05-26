package net.etfbl.ip.webshopbackendapp.services.impl;

import jakarta.transaction.Transactional;
import net.etfbl.ip.webshopbackendapp.models.entities.LogEntity;
import net.etfbl.ip.webshopbackendapp.repositories.LogRepository;
import net.etfbl.ip.webshopbackendapp.services.LogService;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LogServiceImpl implements LogService {

    private final LogRepository repository;

    public LogServiceImpl(LogRepository logRepository) {
        this.repository = logRepository;
    }

    @Override
    public void log(LogEntity log) {

        repository.saveAndFlush(log);

    }

}
