/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package retodos_web.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;
import retodos_web.modelo.Chocolate;

/**
 *
 * @author ELKIN
 */
public interface ChocolateInterface extends MongoRepository<Chocolate, String>{
    
}
