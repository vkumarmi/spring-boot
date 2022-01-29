package com.example.springboot.interviews.here.round2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService {
    private List<Player> playerList=new ArrayList<>();

    public List<Player> getPlayerByQuery(String query){
      return  playerList.stream().filter(player -> player.getName().toLowerCase().startsWith(query.toLowerCase())).collect(Collectors.toList());
    }
}
