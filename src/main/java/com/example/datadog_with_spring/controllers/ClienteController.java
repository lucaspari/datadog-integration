package com.example.datadog_with_spring.controllers;

import com.example.datadog_with_spring.models.Cliente;
import com.example.datadog_with_spring.repository.ClienteRepository;
import io.micrometer.core.annotation.Timed;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/clientes")
@AllArgsConstructor
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @Timed(value = "listClients",description = "list all clients")
    @GetMapping
    public ResponseEntity<List<Cliente>> listClientes() {
        var clients = clienteRepository.findAll();
        return ResponseEntity.ok(clients);
    }
    @GetMapping("/slow")
    @Timed(value = "slowApiCall",description = "this is a slow api Call")
    public ResponseEntity apiSleepCall() throws InterruptedException {
        Thread.sleep(4000);
        return ResponseEntity.status(200).build();
    }

    @PostMapping
    public Cliente saveCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable UUID id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
