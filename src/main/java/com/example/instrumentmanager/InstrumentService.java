package com.example.instrumentmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrumentService {
    InstrumentRepository repo;

    @Autowired
    public InstrumentService(InstrumentRepository repo) {
        this.repo = repo;
    }

    public void addInstrument(Instrument i) { //TODO: prevent duplicates (serial number/brand)
        repo.save(i);
    }

    public List<Instrument> getInstruments() {
        return repo.findAll();
    }
    public Instrument getInstrument(int id) {
        return repo.findById(id).orElse(null);
    }

    public void updateInstrument(Instrument updatedInstrument) {
        repo.save(updatedInstrument);
    }

    public void deleteInstrument(int id) {
        repo.deleteById(id);
    }
}
