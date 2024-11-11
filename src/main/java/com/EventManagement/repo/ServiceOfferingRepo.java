package com.EventManagement.repo;

import com.EventManagement.entity.ServiceOffering;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ServiceOfferingRepo extends JpaRepository<ServiceOffering, UUID> {
}
