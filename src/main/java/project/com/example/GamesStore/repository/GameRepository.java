package project.com.example.GamesStore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.com.example.GamesStore.model.Game;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {
    List<Game> findAll();

    Optional<Game> findById(Long aLong);

    Game save(Game game);

    void deleteById(Long aLong);
}
