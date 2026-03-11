package org.example.lab31.data;

import org.example.lab31.logic.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ClienteRepository extends CrudRepository<Cliente, String>{

}
