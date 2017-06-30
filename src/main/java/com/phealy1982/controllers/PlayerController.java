package com.phealy1982.controllers;

import com.phealy1982.models.Player;
import com.phealy1982.util.URIConstant;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(value = "player", description = "Manage players") @RestController
public class PlayerController {

    @ApiOperation(
        value = "Add a player",
        notes = "Add information for a new player")
    @RequestMapping(value = URIConstant.PLAYER_ADD_URI, method = RequestMethod.POST) void add() {

    }

    @ApiOperation(
        value = "Get a player",
        notes = "Get information for specified player",
        response = Player.class)
    @RequestMapping(value = URIConstant.PLAYER_GET_URI, method = RequestMethod.GET)
    ResponseEntity<String> get(
        @PathVariable(value = "id") String id) {
        return ResponseEntity.ok(getBody());
    }


    public String getBody() {
        return "{\"name\":\"Dummy\"}";
    }
}
