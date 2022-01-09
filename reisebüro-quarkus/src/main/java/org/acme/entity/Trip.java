package org.acme.entity;

import javax.persistence.*;

@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @ManyToOne
    Office office;
    @ManyToOne
    Destination destination;
}
