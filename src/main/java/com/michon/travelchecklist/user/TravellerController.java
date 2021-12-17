package com.michon.travelchecklist.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/users")
public class TravellerController {

    private final TravellerService travellerService;

    public TravellerController(TravellerService travellerService) {
        this.travellerService = travellerService;
    }

    @GetMapping
    public List<Traveller> getTravellers(){
        return travellerService.getUsers();
    }

    @PostMapping
    public Traveller addTraveller(@RequestBody Traveller traveller){
        return travellerService.saveTraveller(traveller);
    }
}
