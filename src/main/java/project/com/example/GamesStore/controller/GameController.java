package project.com.example.GamesStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import project.com.example.GamesStore.model.Game;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.com.example.GamesStore.service.GameService;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService service;


    @GetMapping
    public ResponseEntity<List<Game>> getAll(){
        List<Game> games = service.findAll();
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Game> getById(@PathVariable Long id){
        Game game = service.findById(id);
        return null;
    }

    @PostMapping
    public ResponseEntity<Game> post(@RequestBody Game game){
        Game createdGame = service.create(game);
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Game> put(@PathVariable Long id, @RequestBody Game game){
        Game updatedGame = service.update(id, game);
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Game> delete(@PathVariable Long id){
        service.deleteById(id);
        return null;
    }
}
