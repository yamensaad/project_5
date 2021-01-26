package hu.uni.eszterhazy.framework.dao;

import hu.uni.eszterhazy.framework.dao.entity.ActorEntity;
import hu.uni.eszterhazy.framework.model.Actor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class ActorDaoimpl implements ActorDao {

    private  final ActorRepository repository;


    public void printActor() {
        System.out.println("repository:" +repository);
        StreamSupport.stream(repository.findAll().spliterator(),false).forEach(actorEntity -> {
            System.out.println(actorEntity);
        });
    }


    @Override
    public Collection<Actor> readAll() {
        return StreamSupport.stream(repository.findAll().spliterator(), false).map((actorEntity -> {
            return new Actor(


            );


        })).collect(Collectors.toList());


    }
}
