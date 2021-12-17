package com.michon.travelchecklist.user;

import com.michon.travelchecklist.checklist.Checklist;
import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@Table(name = "users")
public class Traveller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Traveller() {

    }

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Checklist> checklists;

}