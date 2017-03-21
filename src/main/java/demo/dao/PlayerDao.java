package demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import demo.domain.Player;
import demo.domain.Team;

@RestResource(path="players", rel="players")
public interface PlayerDao extends CrudRepository<Player, Long>{
	
}
