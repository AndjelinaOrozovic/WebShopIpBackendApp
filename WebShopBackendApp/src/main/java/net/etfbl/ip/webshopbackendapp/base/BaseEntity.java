package net.etfbl.ip.webshopbackendapp.base;

import java.io.Serializable;

public interface BaseEntity<ID extends Serializable> { //Generic entity -> every entity has unique ID with getters and setters

    void setId(ID id);

    ID getId();

}
