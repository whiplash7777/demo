package ping_pong.payLoads;


import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.annotations.SecondaryRow;

@Getter
@Setter
@NoArgsConstructor

public class UserNameDto {
    @NotBlank(message = "please provide name")
    private String callerUser;
}
