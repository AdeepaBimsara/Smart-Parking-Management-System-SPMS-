package lk.ijse.userservice.repository;

import lk.ijse.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * ============================================================
 * Project      : Smart-Parking-Management-System
 * Author      : Adeepa Bimsara
 * GitHub      : https://github.com/AdeepaBimsara
 * Created     : 8/12/26 6:23 PM
 * ============================================================
 * ============================================================
 */
public interface UserRepository extends JpaRepository<User,Long> {

    public boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}
