package lk.ijse.userservice.service;

import lk.ijse.userservice.dto.*;
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

     LoginResponse login(LoginRequest request);
}
