package com.devsuperior.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameMiniDto;
import com.devsuperior.dslist.service.GameService;

@RestController
@RequestMapping("/games")
public class GameController {
    
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMiniDto> findAll() {
        return gameService.findAll();
    }
}
