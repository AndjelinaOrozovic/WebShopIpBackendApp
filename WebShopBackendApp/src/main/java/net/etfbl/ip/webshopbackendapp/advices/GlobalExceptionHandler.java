package net.etfbl.ip.webshopbackendapp.advices;

import net.etfbl.ip.webshopbackendapp.exceptions.HttpException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public final ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException e, HandlerMethod handlerMethod) { //Status code is 400 (not formatted JSON)

        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); //Response entity is model for http response

    }

    @ExceptionHandler(HttpException.class)
    public final ResponseEntity<Object> handleHttpException(HttpException e, HandlerMethod handlerMethod) {  //HttpException method

        Log log = getLog(handlerMethod);
        log.error(e);
        if(e.getStatus() == null) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(e.getData(), e.getStatus());

    }

    @ExceptionHandler(Exception.class) // For exceptions from controllers which are not HttpMessageNotReadable or HttpException
    public final ResponseEntity<Object> handleException(Exception e, HandlerMethod handlerMethod) {

        LoggingUtil.logException(e, getLog(handlerMethod));
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

    }

    private Log getLog(HandlerMethod handlerMethod) {

        return LogFactory.getLog(handlerMethod.getMethod().getDeclaringClass());

    }

}
