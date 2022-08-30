package controller;

import model.Game;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/games")
public class GameController {


    @GetMapping
    public ResponseEntity<Game> getAll(){

    }

    @GetMapping("/{id}")
    public ResponseEntity<Game> getById(@PathVariable int id){

    }

    @PostMapping
    public ResponseEntity<Game> post(@RequestBody Game game){

    }

    @PutMapping("/{id}")
    public ResponseEntity<Game> put(@PathVariable int id){

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Game> delete(@PathVariable int id){

    }
}
