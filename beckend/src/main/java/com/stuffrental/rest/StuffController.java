package com.stuffrental.rest;

import com.stuffrental.model.Stuff;
import com.stuffrental.repository.StuffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/stuff", produces = MediaType.APPLICATION_JSON_VALUE)

public class StuffController {

    private final StuffRepository stuffRepository;

    @Autowired
    public StuffController(StuffRepository stuffRepository) {
        this.stuffRepository = stuffRepository;
    }

    @RequestMapping(value = "/")
    public Iterable<Stuff> getAll() {
        return stuffRepository.findAll();
    }

}
