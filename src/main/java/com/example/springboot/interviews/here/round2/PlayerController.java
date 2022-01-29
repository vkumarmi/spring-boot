package com.example.springboot.interviews.here.round2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/get/player/{query}")
    public List<Player> getPlayers(@PathVariable String query){
      return  playerService.getPlayerByQuery(query);
    }

    @PostMapping("create/player")
    public Player createPlayer(@RequestBody Player player){
        return player;
    }
}
