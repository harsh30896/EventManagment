package com.EventManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ProviderRepo extends JpaRepository<ProviderRepo, UUID> {
}
