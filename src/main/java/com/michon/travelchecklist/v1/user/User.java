package com.michon.travelchecklist.v1.user;

import com.michon.travelchecklist.v1.checklist.Checklist;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;


    @OneToMany(cascade = CascadeType.ALL)
    private Set<Checklist> checklists;

}