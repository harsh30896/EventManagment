package com.EventManagement.repo;

import com.EventManagement.entity.Enquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface EnquiryRepo extends JpaRepository<Enquiry, UUID> {
}
