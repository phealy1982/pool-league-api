package com.phealy1982.controllers;

import com.phealy1982.models.Player;
import com.phealy1982.repository.PlayerRepository;
import com.phealy1982.util.URIConstant;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "player", description = "Manage players")
@RestController
public class PlayerController {

    @Autowired
    PlayerRepository repository;

    @ApiOperation(
            value = "Get a player",
            notes = "Get information for specified player",
            response = Player.class)
    @RequestMapping(value = URIConstant.PLAYER_GET_URI, method = RequestMethod.GET)
    ResponseEntity get() {
        return ResponseEntity.ok(repository.findAll());
    }
}
