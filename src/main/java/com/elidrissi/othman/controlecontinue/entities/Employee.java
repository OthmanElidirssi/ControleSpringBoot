package com.elidrissi.othman.controlecontinue.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String prenom;

    private String photo;

    @Temporal(TemporalType.DATE)
    private LocalDate dateNaissance;

    @ManyToOne
    private Service service;

    @ManyToOne
    private Employee chef;


}
