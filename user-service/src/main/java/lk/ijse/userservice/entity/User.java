package lk.ijse.userservice.entity;

import jakarta.persistence.*;

/**
 * ============================================================
 * Project      : Smart-Parking-Management-System
 * Author      : Adeepa Bimsara
 * GitHub      : https://github.com/AdeepaBimsara
 * Created     : 8/12/26 12:28 PM
 * ============================================================
 * ============================================================
 */

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

}
