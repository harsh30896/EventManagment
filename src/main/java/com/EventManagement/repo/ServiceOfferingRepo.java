package com.EventManagement.repo;

import com.EventManagement.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ServiceRepo extends JpaRepository<Service, UUID> {
}
