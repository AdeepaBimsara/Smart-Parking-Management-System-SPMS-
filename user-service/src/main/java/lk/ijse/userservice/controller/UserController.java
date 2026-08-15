package lk.ijse.userservice.controller;

import jakarta.validation.Valid;
import lk.ijse.userservice.dto.*;
import lk.ijse.userservice.service.UserService;
import lk.ijse.userservice.util.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<ApiResponse<UserResponse>> createUser(@Valid @RequestBody UserCreateRequest request){

        UserResponse response = userService.createUser(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(
                        201,
                        "User create successfully",
                        response
                ));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<UserResponse>> getUserById(@PathVariable Long id){

        return ResponseEntity.ok(
                new ApiResponse<>(
                        200,
                        "User retrieved successfully",
                        userService.getUserById(id)
                )
        );
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<UserResponse>>> getAllUsers(){

        return ResponseEntity.ok(
                new ApiResponse<>(
                        200,
                        "User retrieved successfully",
                        userService.getAllUsers()
                )
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<UserResponse>> updateUser(
            @PathVariable Long id, @Valid @RequestBody UserUpdateRequest request){

        return ResponseEntity.ok(
                new ApiResponse<>(
                        200,
                        "User update successfully",
                        userService.updateUser(id, request)
                )
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteUser(@PathVariable Long id){

        userService.deleteUser(id);

        return ResponseEntity.ok(
                new ApiResponse<>(
                        200,
                        "User delete successfully",
                        null
                )
        );

    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<LoginResponse>> login(@RequestBody LoginRequest request){

        return ResponseEntity.ok(
                new ApiResponse<>(
                        200,
                        "User login successfully",
                        userService.login(request)
                )
        );
    }
}
