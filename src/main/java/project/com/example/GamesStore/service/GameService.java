package project.com.example.GamesStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import project.com.example.GamesStore.model.Game;
import project.com.example.GamesStore.repository.GameRepository;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;


    public List<Game> findAll() {
        return repository.findAll();
    }

    public Game findById(Long id) {
        Optional<Game> game = repository.findById(id);

        if (game.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Entidade nao encontrada");
        }

        return game.get();
    }

    public Game create(Game game) {
        return repository.save(game);
    }

    public Game update(Long id, Game game) {
        Optional<Game> existing = repository.findById(id);

        if (existing.isPresent()) {
            game.setId(id);
            return repository.save(game);
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Entidade nao encontrada");
    }

    public void deleteById(Long id) {
        if (repository.findById(id).isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Entidade nao encontrada");
        }

        repository.deleteById(id);
    }
}
