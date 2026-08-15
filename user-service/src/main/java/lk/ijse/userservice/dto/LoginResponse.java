package lk.ijse.userservice.dto;

import lombok.*;

/**
 * ============================================================
 * Project      : Smart-Parking-Management-System
 * Author      : Adeepa Bimsara
 * GitHub      : https://github.com/AdeepaBimsara
 * Created     : 8/15/26 5:58 PM
 * ============================================================
 * ============================================================
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class LoginResponse {

    private String token;

    private UserResponse user;
}
