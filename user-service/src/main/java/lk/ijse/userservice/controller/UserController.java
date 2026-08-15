package lk.ijse.userservice.controller;

import lk.ijse.userservice.dto.UserCreateRequest;
import lk.ijse.userservice.dto.UserResponse;
import lk.ijse.userservice.service.UserService;
import lk.ijse.userservice.util.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * ============================================================
 * Project      : Smart-Parking-Management-System
 * Author      : Adeepa Bimsara
 * GitHub      : https://github.com/AdeepaBimsara
 * Created     : 8/15/26 1:08 PM
 * ============================================================
 * ============================================================
 */
@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ApiResponse<UserResponse>> createUser(@RequestBody UserCreateRequest request){

        UserResponse response = userService.createUser(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(
                        201,
                        "User create successfully",
                        response
                ));
    }
}
