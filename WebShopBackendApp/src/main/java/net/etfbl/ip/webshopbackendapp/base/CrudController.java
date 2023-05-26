package net.etfbl.ip.webshopbackendapp.base;

import lombok.Getter;
import net.etfbl.ip.webshopbackendapp.exceptions.NotFoundException;
import net.etfbl.ip.webshopbackendapp.models.entities.LogEntity;
import net.etfbl.ip.webshopbackendapp.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Getter
public abstract class CrudController<ID extends Serializable, REQ, RESP> {

    private final Class<RESP> respClass;
    private final CrudService<ID> crudService;

    @Autowired
    LogService logService;

    protected CrudController(Class<RESP> respClass, CrudService<ID> crudService) {
        this.respClass = respClass;
        this.crudService = crudService;
    }

    @GetMapping
    List<RESP> findAll() {
        return crudService.findAll(respClass);
    }

    @GetMapping("/{id}")
    public RESP findById(@PathVariable ID id) throws NotFoundException {
        return crudService.findById(id, respClass);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id) {

        logService.log(new LogEntity(null, "Object " + respClass.getSimpleName() + " deleted.", getDateAndTime()));
        crudService.delete(id);

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RESP insert(@RequestBody REQ object) throws NotFoundException {

        logService.log(new LogEntity(null, "Object " + respClass.getSimpleName() + " created.", getDateAndTime()));
        return crudService.insert(object, respClass);

    }

    @PutMapping("/{id}")
    public RESP update(@PathVariable ID id, @RequestBody REQ object) throws NotFoundException {

        logService.log(new LogEntity(null, "Object " + respClass.getSimpleName() + " updated.", getDateAndTime()));
        return crudService.update(id, object, respClass);

    }


    private String getDateAndTime() {

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return simpleDateFormat.format(date);

    }
}
