package hu.uni.eszterhazy.framework.dao;


import hu.uni.eszterhazy.framework.dao.entity.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface ActorRepository extends JpaRepository<ActorEntity,Integer> {

}
