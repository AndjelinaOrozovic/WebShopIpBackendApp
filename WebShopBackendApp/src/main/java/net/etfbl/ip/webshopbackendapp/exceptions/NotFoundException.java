package net.etfbl.ip.webshopbackendapp.exceptions;

import org.springframework.http.HttpStatus;

public class NotFoundException extends HttpException {

    public NotFoundException() {

        super(HttpStatus.NOT_FOUND, null); // Status code is 404 (not found some resource)

    }

    public NotFoundException(Object data) {

        super(HttpStatus.NOT_FOUND, data);

    }

}
