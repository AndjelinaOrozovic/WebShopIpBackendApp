package net.etfbl.ip.webshopbackendapp.exceptions;

import org.springframework.http.HttpStatus;

public class ForbiddenException extends HttpException {

    public ForbiddenException() {

        super(HttpStatus.FORBIDDEN, null); // Status code is 403 (unauthorized user)

    }

    public ForbiddenException(Object data) {

        super(HttpStatus.FORBIDDEN, data);

    }
}
