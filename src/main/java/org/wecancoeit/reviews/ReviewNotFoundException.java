package org.wecancoeit.reviews;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code= HttpStatus.NOT_FOUND, reason="THIS IS NOT THE PAGE YOU ARE LOOKING FOR")
public class ReviewNotFoundException extends Exception {
}
