package ping_pong.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ping_pong.payLoads.UserNameDto;
import ping_pong.services.CallerService;

@RestController
@RequestMapping("/pingPong")
public class PongController {
    private CallerService callerService;

    @GetMapping("/")
    public ResponseEntity<UserNameDto> getCaller(){
        UserNameDto caller = this.callerService.getCaller();
        return new ResponseEntity<UserNameDto>(caller, HttpStatus.OK);
    }
}
