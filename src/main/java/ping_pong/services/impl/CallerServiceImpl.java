package ping_pong.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ping_pong.models.userName;
import ping_pong.payLoads.UserNameDto;
import ping_pong.services.CallerService;

@Service
public class CallerServiceImpl implements CallerService {

    @Autowired
    public ping_pong.models.userName userName;


    @Override
    public UserNameDto getCaller() {
        this.userName.getCallerName();
        return null;
    }
}
