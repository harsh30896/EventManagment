package com.EventManagement.serviceImpl;

import com.EventManagement.entity.Client;
import com.EventManagement.repo.ClientRepo;
import com.EventManagement.service.ClinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClinetService {

    @Autowired
    ClientRepo clientRepo;

    @Override
    public Boolean registerClient(Client client) {
        if(clientRepo.existsByUsername(client.getUsername())){
            return false;
        }
        clientRepo.save(client);
        return true;
    }
}
// factory design pattern for client and provider by get username
// auditing of an api and storing in database
// log4j
// ELK stack
// Kafka implementation
// Junit, Mockito