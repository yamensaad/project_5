
package hu.uni.eszterhazy.framework.dao;

import hu.uni.eszterhazy.framework.dao.entity.ActorEntity;
import hu.uni.eszterhazy.framework.model.Actor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class ActorDaoimpl implements ActorDao {

    private  final ActorRepository repository;


    @Override
    public Collection<Actor> readAll() {
        return StreamSupport.stream(repository.findAll().spliterator(),false).map((actorEntity -> new Actor(
                actorEntity.getFirst_name(),
                actorEntity.getLast_name(),
                actorEntity.getActor_id()

        ))).collect(Collectors.toList());



    }

    @Override
    public void createActor(Actor actor) {
       repository.save(ActorEntity.builder()
               .actor(get.getId);

    }
}

