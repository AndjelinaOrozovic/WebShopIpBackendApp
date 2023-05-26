package net.etfbl.ip.webshopbackendapp.exceptions;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@ToString
public class HttpException extends RuntimeException {

    private HttpStatus status;
    private Object data;

    public HttpException() {

        this.status = HttpStatus.INTERNAL_SERVER_ERROR; // Default status code is 500
        this.data = null;

    }

    public HttpException(Object data) {

        this(HttpStatus.INTERNAL_SERVER_ERROR, data);

    }

    public HttpException(HttpStatus httpStatus, Object data) {

        this.status = httpStatus;
        this.data = data;

    }
}
