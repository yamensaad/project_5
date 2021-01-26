package hu.uni.eszterhazy.framework.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category", schema = "sakila")

public class CategoryEntity {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "category_id ")
    private int category_id;
    @Column
  private  String name;

    @Column
   Timestamp last_update;




}
