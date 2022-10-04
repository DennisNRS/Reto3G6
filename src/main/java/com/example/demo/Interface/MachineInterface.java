
package com.example.demo.Interface;

import com.example.demo.Modelo.Machine;
import org.springframework.data.repository.CrudRepository;


public interface MachineInterface extends CrudRepository <Machine, Integer> {
    
}
