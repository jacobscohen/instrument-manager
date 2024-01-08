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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getBrandAndModel() {
        return brandAndModel;
    }

    public void setBrandAndModel(String brandAndModel) {
        this.brandAndModel = brandAndModel;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCurrentOwner() {
        return currentOwner;
    }

    public void setCurrentOwner(String currentOwner) {
        this.currentOwner = currentOwner;
    }

    public LocalDate getLastRepair() {
        return lastRepair;
    }

    public void setLastRepair(LocalDate lastRepair) {
        this.lastRepair = lastRepair;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "id=" + id +
                ", instrument='" + instrument + '\'' +
                ", brandAndModel='" + brandAndModel + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", currentOwner='" + currentOwner + '\'' +
                ", lastRepair=" + lastRepair +
                ", condition=" + condition +
                ", notes='" + notes + '\'' +
                '}';
    }
}
