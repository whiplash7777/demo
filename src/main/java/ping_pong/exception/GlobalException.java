package ping_pong.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import ping_pong.payLoads.ApiResponse;

@RestControllerAdvice
public class GlobalException {


    @ExceptionHandler(HttpClientErrorException.BadRequest.class)
    public ResponseEntity<ApiResponse> badRequestExceptionHandler(HttpClientErrorException.BadRequest exception){
        String message = exception.getMessage().toString();
        ApiResponse apiResponse= new ApiResponse(message,false);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.BAD_REQUEST);
    }



}
