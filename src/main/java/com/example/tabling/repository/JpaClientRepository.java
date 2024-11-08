package com.example.tabling.repository;

import com.example.tabling.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaClientRepository extends JpaRepository<Client, Long> {
}
