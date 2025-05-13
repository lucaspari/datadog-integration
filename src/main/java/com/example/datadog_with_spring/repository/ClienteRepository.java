package com.example.datadog_with_spring.repository;

import com.example.datadog_with_spring.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,UUID> {
}
