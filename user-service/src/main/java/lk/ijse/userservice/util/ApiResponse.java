package lk.ijse.userservice.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ============================================================
 * Project      : Smart-Parking-Management-System
 * Author      : Adeepa Bimsara
 * GitHub      : https://github.com/AdeepaBimsara
 * Created     : 8/15/26 1:30 PM
 * ============================================================
 * ============================================================
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse <T>{

    private int code;
    private String message;
    private T data;
}
