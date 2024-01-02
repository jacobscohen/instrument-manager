package com.example.instrumentmanager;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="instruments")
public class Instrument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String instrument;
    private String brandAndModel;
    private String serialNumber;
    private String currentOwner;
    private LocalDate lastRepair;
    @Enumerated(EnumType.STRING)
    @Column(name = "`condition`")
    private Condition condition;
    private String notes;

    enum Condition {
        AWFUL, POOR, FAIR, GOOD, EXCELLENT
    }
}
