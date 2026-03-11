package org.example.lab31.data;

import org.example.lab31.logic.Cliente;
import org.example.lab31.logic.Poliza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolizaRepository extends CrudRepository<Poliza, Integer> {
    Iterable<Poliza> findByCliente(Cliente cliente);
}