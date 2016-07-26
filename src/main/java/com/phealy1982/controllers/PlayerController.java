package com.phealy1982.controllers;

import com.phealy1982.models.Player;
import com.phealy1982.util.URIConstant;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayerController {

    @RequestMapping(value = URIConstant.PLAYER_ADD_URI, method = RequestMethod.POST)
    void add() {


    }

    @RequestMapping(value = URIConstant.PLAYER_GET_URI, method = RequestMethod.GET)
    Player get(@PathVariable(value="id")  String id){

        Player resp = new Player();
        resp.setName("Dummy");

        return resp;

    }


}