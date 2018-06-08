package com.tourist.controller;

import javassist.NotFoundException;
import org.springframework.boot.autoconfigure.web.AbstractErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Ngoc Quy on 5/22/2018.
 */
@Controller
public class CustomErrorController  extends AbstractErrorController {

    private static final String ERROR_PATH=  "/error";

    public  CustomErrorController(ErrorAttributes errorAttributes){
        super(errorAttributes);
    }

    @ExceptionHandler(NotFoundException.class)
    public String notFound() {
        return "404";
    }

    @RequestMapping(ERROR_PATH)
    public ResponseEntity<?> handleErrors(HttpServletRequest request) throws NotFoundException {
        HttpStatus status = getStatus(request);

        if (status.equals(HttpStatus.NOT_FOUND))
                throw new NotFoundException("error 404");

        return ResponseEntity.status(status).body(getErrorAttributes(request, false));
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
