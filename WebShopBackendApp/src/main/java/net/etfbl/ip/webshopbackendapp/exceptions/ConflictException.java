package net.etfbl.ip.webshopbackendapp.exceptions;

import org.springframework.http.HttpStatus;

public class ConflictException extends HttpException{

    public ConflictException() {

        super(HttpStatus.CONFLICT, null); //Status code is 409 (duplicated unique entity)

    }

    public ConflictException(Object data) {

        super(HttpStatus.CONFLICT, data);

    }


}
