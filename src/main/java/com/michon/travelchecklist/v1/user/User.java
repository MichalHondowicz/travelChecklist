package com.michon.travelchecklist.v1.user;

import com.michon.travelchecklist.v1.checklist.Checklist;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;


    @OneToMany(cascade = CascadeType.ALL)
    private Set<Checklist> checklists;

}