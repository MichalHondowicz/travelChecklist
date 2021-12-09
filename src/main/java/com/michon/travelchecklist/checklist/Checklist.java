package com.michon.travelchecklist.checklist;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

//@Entity
@Data
public class Checklist {

    private Long id;
    private String name;
    private Set<ChecklistItem> items;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }
}
