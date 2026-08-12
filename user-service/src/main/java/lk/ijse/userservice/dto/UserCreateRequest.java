package lk.ijse.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lk.ijse.userservice.entity.Role;
import lombok.*;

/**
 * ============================================================
 * Project      : Smart-Parking-Management-System
 * Author      : Adeepa Bimsara
 * GitHub      : https://github.com/AdeepaBimsara
 * Created     : 8/12/26 6:43 PM
 * ============================================================
 * ============================================================
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class UserCreateRequest {

    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "email is required")
    @Email(message = "Invalid email")
    private String email;

    @NotBlank
    @Size(min = 4,message = "password must contain at least 4 characters")
    private String password;

    private String phone;

    @NotNull(message = "role is required")
    private Role role;
}
