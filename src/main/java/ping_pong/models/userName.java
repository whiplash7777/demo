package ping_pong.models;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@AllArgsConstructor
public class userName {
    @NotBlank(message = "please provide name")
    private String callerName;

    //public String callerUser(String cname){
        //return "hello" + cname;
    }

