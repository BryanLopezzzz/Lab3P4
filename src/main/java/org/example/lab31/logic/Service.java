package org.example.lab31.logic;

import org.example.lab31.data.ClienteRepository;
import org.example.lab31.data.PolizaRepository;
import org.springframework.beans.factory.annotation.*;

@org.springframework.stereotype.Service("service")
public class Service {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private PolizaRepository polizaRepository;

    public Iterable<Cliente> clienteFindAll() {
        return clienteRepository.findAll();
    }

    public Iterable<Poliza> polizaFindByCliente(String identificacion) {
        Cliente cliente = new Cliente();
        cliente.setIdentificacion(identificacion);
        return polizaRepository.findByCliente(cliente);
    }
}
