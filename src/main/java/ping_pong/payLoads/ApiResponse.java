package ping_pong.payLoads;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
     private String message;
     private boolean success;
}
