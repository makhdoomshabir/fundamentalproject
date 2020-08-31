package com.qa.fundamentalproject.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;

@ResponseStatus(code= HttpStatus.NOT_FOUND, reason = "The blog with this ID does not exist")
public class BlogNotFoundException extends EntityNotFoundException {
}
