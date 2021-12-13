/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package retodos_web.interfaces;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import retodos_web.modelo.User;

/**
 *
 * @author ELKIN
 */
public interface UserInterface extends MongoRepository<User, Integer>{
    
    Optional<User> findByEmail (String email);
    Optional<User> findByEmailAndPassword (String email, String password);
    Optional<User> findTopByOrderByIdDesc();
}
