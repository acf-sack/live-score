package lk.sack.livescore.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class UnauthorizedUserException extends Exception{
    public UnauthorizedUserException() {
        super();
    }

    public UnauthorizedUserException(String message){
        super(message);
    }

    public UnauthorizedUserException(String message, Throwable throwable){
        super(message, throwable);
    }
}
