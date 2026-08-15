package lk.ijse.userservice.service;

import lk.ijse.userservice.dto.LoginRequest;
import lk.ijse.userservice.dto.UserCreateRequest;
import lk.ijse.userservice.dto.UserResponse;
import lk.ijse.userservice.dto.UserUpdateRequest;
import lk.ijse.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ============================================================
 * Project      : Smart-Parking-Management-System
 * Author      : Adeepa Bimsara
 * GitHub      : https://github.com/AdeepaBimsara
 * Created     : 8/12/26 6:30 PM
 * ============================================================
 * ============================================================
 */
@Service
public interface UserService {

     UserResponse createUser(UserCreateRequest request);

     UserResponse getUserById(Long id);

     List<UserResponse> getAllUsers();

     UserResponse updateUser(Long id, UserUpdateRequest request);

     void deleteUser(Long id);

     UserResponse login(LoginRequest request);
}
