package com.phealy1982.controllers;

import com.phealy1982.util.URIConstant;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by peterhealy on 30/06/2017.
 */
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
