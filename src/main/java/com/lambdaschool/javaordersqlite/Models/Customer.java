package com.lambdaschool.javaordersqlite.Models;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long custcode;

    @Column(nullable = false)
    private String custname;


    private String custcity, workingarea, custcountry, grade, phone;
    private double openingamt, receiveamt, paymentamt, oustandingamt;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "customer")
    private Set<Order> orders;

    @ManyToOne
    @JoinColumn(name = "agentcode", nullable = false)
    @JsonIgnore
    private Agent agent;

    public Customer() {
    }
}

