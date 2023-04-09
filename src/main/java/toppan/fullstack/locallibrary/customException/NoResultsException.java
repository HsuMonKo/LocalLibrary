package toppan.fullstack.locallibrary.customException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoResultsException extends RuntimeException {
	public NoResultsException(String message) {
        super(message);
    }
}
