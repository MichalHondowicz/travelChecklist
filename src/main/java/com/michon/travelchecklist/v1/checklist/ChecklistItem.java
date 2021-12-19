package com.michon.travelchecklist.v1.checklist;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "checklist_items")
public class ChecklistItem {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "quantity")
    private Integer quantity;

    @ManyToOne
    private Checklist checklist;
}
