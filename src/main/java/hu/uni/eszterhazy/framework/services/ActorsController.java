package hu.uni.eszterhazy.framework.services;

import hu.uni.eszterhazy.frameworks.model.Actor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping(value = {"/actor"})
@RequiredArgsConstructor
public class ActorsController {


    private final ActorService actorService;


    @RequestMapping(value = {"/all"}, method = RequestMethod.GET)
    public Collection<Actor> fetchAllActors() {
        return actorService.listActors();
    }

}
