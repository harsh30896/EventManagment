package com.EventManagement.repo;

import com.EventManagement.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ProviderRepo extends JpaRepository<Provider, UUID> {
}
