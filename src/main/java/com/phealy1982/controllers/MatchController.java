package com.phealy1982.controllers;

import com.phealy1982.util.URIConstant;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by peterhealy on 30/06/2017.
 */
@Api(value = "match", description = "Manage players") @RestController
public class MatchController {
    @ApiOperation(
            value = "Get All Matches",
            notes = "returns all matches, previous and upcoming")
    @RequestMapping(value = URIConstant.MATCH_GET_URI, method = RequestMethod.GET)
    @ResponseBody
    ResponseEntity get() {

        return ResponseEntity.ok("{}");
    }
}
