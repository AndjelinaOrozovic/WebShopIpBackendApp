package net.etfbl.ip.webshopbackendapp.exceptions;

import org.springframework.http.HttpStatus;

public class UnauthorizedException extends HttpException {

    public UnauthorizedException() {

        super(HttpStatus.UNAUTHORIZED, null); //Status code is 401 (Not authenticated user)

    }

    public UnauthorizedException(Object data) {

        super(HttpStatus.UNAUTHORIZED, data);

    }

}
