package com.EventManagement.repo;

import com.EventManagement.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ClientRepo extends JpaRepository<Client, UUID> {
}
