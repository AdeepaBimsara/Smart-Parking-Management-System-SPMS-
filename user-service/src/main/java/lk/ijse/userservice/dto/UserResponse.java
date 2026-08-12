package lk.ijse.userservice.dto;

import lk.ijse.userservice.entity.Role;
import lombok.*;

/**
 * ============================================================
 * Project      : Smart-Parking-Management-System
 * Author      : Adeepa Bimsara
 * GitHub      : https://github.com/AdeepaBimsara
 * Created     : 8/12/26 6:53 PM
 * ============================================================
 * ============================================================
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class UserResponse {

    private Long id;

    private String name;

    private String email;

    private String phone;

    private Role role;
}
