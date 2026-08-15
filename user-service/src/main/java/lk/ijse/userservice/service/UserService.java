package lk.ijse.userservice.service;

import lk.ijse.userservice.dto.UserCreateRequest;
import lk.ijse.userservice.dto.UserResponse;
import lk.ijse.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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

    public UserResponse createUser(UserCreateRequest request);

}
