package net.etfbl.ip.webshopbackendapp.exceptions;

import org.springframework.http.HttpStatus;

public class BadRequestException extends HttpException {

    public BadRequestException() {

        super(HttpStatus.BAD_REQUEST, null); //Status code is 400 (for user invalid data)

    }

    public BadRequestException(Object data) {

        super(HttpStatus.BAD_REQUEST, data);

    }

}
