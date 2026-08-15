package lk.ijse.userservice.service.impl;

import lk.ijse.userservice.dto.UserCreateRequest;
import lk.ijse.userservice.dto.UserResponse;
import lk.ijse.userservice.entity.User;
import lk.ijse.userservice.repository.UserRepository;
import lk.ijse.userservice.service.UserService;
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
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponse createUser(UserCreateRequest request) {

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setPhone(request.getPassword());
        user.setRole(request.getRole());

        User saveUser = userRepository.save(user);

        UserResponse response = new UserResponse();

        response.setId(saveUser.getId());
        response.setName(saveUser.getName());
        response.setEmail(saveUser.getEmail());
        response.setPhone(saveUser.getPhone());
        response.setRole(saveUser.getRole());

        return response;

    }
}
