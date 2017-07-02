package com.phealy1982.controllers;

import com.phealy1982.models.Match;
import com.phealy1982.repository.MatchRepository;
import com.phealy1982.util.URIConstant;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by peterhealy on 30/06/2017.
 */
@Api(value = "match", description = "Manage players")
@RestController
public class MatchController {

    @Autowired
    private MatchRepository repository;

    @ApiOperation(
            value = "Get All Matches",
            notes = "returns all matches, previous and upcoming")
    @RequestMapping(value = URIConstant.MATCH_GET_URI, method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    ResponseEntity get() {
        return ResponseEntity.ok(repository.findAll());
    }
}
