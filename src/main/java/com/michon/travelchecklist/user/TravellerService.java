package com.michon.travelchecklist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravellerService {

    private final TravellerRepository userRepository;

    @Autowired
    public TravellerService(TravellerRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Traveller> getUsers(){
        return userRepository.findAll();
    }

    public Traveller getUserById(Long id){
        return userRepository.getById(id);
    }

    public Traveller saveTraveller(Traveller traveller){
        return userRepository.save(traveller);
    }

}
