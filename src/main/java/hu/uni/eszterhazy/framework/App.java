package hu.uni.eszterhazy.framework;

import hu.uni.eszterhazy.framework.dao.ActorDao;
import hu.uni.eszterhazy.framework.dao.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.util.stream.StreamSupport;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
    @Autowired
    private ApplicationContext context;

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);



    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello world");

        ActorDao dao = context.getBean(ActorDao.class);







    }
}
