package ping_pong.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ping_pong.payLoads.UserNameDto;
import ping_pong.services.CallerService;

@RestController
@RequestMapping("/pingPong/name")
public class PingController {
    @Autowired
    public CallerService callerService;

    @PostMapping("/")
    public ResponseEntity<UserNameDto> createCaller(@Valid @RequestBody UserNameDto userNameDto){
        UserNameDto caller = this.callerService.getCaller();
        return new ResponseEntity<UserNameDto>(caller, HttpStatus.CREATED);

    }
}
