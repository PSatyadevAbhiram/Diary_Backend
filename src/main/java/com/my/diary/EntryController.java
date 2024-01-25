package com.my.diary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/entries")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EntryController {
    @Autowired
    private EntryRepository entryRepository;

    @GetMapping
    public List<Entry> getEntries() {
        return entryRepository.findAll();
    }

    @GetMapping("/{id}")
    public Entry getEntry(@PathVariable int id) {
        return entryRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Entry addEntry(@RequestBody Entry entry) {
        return entryRepository.save(entry);
    }

    @DeleteMapping("/{id}")
    public void deleteEntry(@PathVariable int id) {
        entryRepository.deleteById(id);
    }
}
