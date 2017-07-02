package com.phealy1982.repository;

import com.phealy1982.models.Match;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 * Created by peterhealy on 02/07/2017.
 */

public interface MatchRepository extends MongoRepository<Match, String> {

}
