package hu.uni.eszterhazy.framework.services;
import hu.uni.eszterhazy.framework.dao.ActorRepository;
import hu.uni.eszterhazy.frameworks.dao.ActorRepository;
import hu.uni.eszterhazy.frameworks.service.ActorSearchService;
import hu.uni.eszterhazy.frameworks.service.ActorSearchServiceImpl;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
@SpringBootConfiguration
public class Web {



    @Bean
    public ActorService actorService(ActorRepository actorRepository){
        return new ActorServiceImpl(ActorRepository);
}
