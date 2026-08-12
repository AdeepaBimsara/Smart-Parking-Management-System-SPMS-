package lk.ijse.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lk.ijse.userservice.entity.Role;
import lombok.*;

/**
 * ============================================================
 * Project      : Smart-Parking-Management-System
 * Author      : Adeepa Bimsara
 * GitHub      : https://github.com/AdeepaBimsara
 * Created     : 8/12/26 6:49 PM
 * ============================================================
 * ============================================================
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class UserUpdateRequest {

    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    private String phone;

    @NotNull
    private Role role;

}
