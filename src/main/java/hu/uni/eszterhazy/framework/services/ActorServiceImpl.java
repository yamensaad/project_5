package hu.uni.eszterhazy.framework.services;

import hu.uni.eszterhazy.framework.dao.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
@RequiredArgsConstructor
@Service
public class ActorServiceImpl implements ActorService {


    private final  ActorRepository actorRepository;


    @Override
    public Collection<hu.uni.eszterhazy.frameworks.model.Actor> listActors() {
        return  actorRepository.findAll();
    }
}
