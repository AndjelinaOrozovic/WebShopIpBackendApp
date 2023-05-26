package net.etfbl.ip.webshopbackendapp.models.dto;

import lombok.Data;

@Data
public class AttributeValue {

    private Integer idProduct;
    private Integer idAttribute;
    private String attributeName;
    private String attributeValue;

    public AttributeValue() {

    }

    public AttributeValue(Integer idProduct, Integer idAttribute, String attributeName, String attributeValue) {
        this.idProduct = idProduct;
        this.idAttribute = idAttribute;
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }
}
