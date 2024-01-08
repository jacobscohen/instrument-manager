package com.example.instrumentmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class InstrumentController {
    InstrumentService service;

    @Autowired
    public InstrumentController(InstrumentService service) {
        this.service = service;
    }

    @GetMapping
    public String home() {
        return "Welcome!";
    }

    @PostMapping("/instruments")
    public void addInstrument(@RequestBody Instrument i) {
        service.addInstrument(i);
    }

    @GetMapping("/instruments")
    public List<Instrument> getInstruments() {
        return service.getInstruments();
    }
    @GetMapping("/instruments/{id}")
    public Instrument getInstrument(@PathVariable int id) {
        return service.getInstrument(id);
    }

    @PutMapping("/instruments/{id}")
    public void updateInstrument(@PathVariable int id, @RequestBody Instrument updatedInstrument) {
//        updatedInstrument.setId(id); //comment in if request body doesn't include ID
        service.updateInstrument(updatedInstrument);
    }

    @DeleteMapping("/instruments/{id}")
    public void deleteInstrument(@PathVariable int id) {
        service.deleteInstrument(id);
    }
}
