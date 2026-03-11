package org.example.lab31.logic;

import org.example.lab31.data.ClienteRepository;
import org.springframework.beans.factory.annotation.*;

@org.springframework.stereotype.Service("service")
public class Service {

    @Autowired
    private ClienteRepository clienteRepository;

    public Iterable<Cliente> clienteFindAll() {
        return clienteRepository.findAll();
    }
}
