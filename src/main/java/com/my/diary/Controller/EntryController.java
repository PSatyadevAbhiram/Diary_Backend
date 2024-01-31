package com.my.diary.Controller;

import com.my.diary.Entity.Entry;
import com.my.diary.Service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/entries")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EntryController {
    @Autowired
    private EntryService entryService;

    @GetMapping
    public List<Entry> getEntries() {
        return entryService.getEntries();
    }

    @GetMapping("/{id}")
    public Entry getEntry(@PathVariable int id) {
        return entryService.getEntry(id);
    }

    @PostMapping
    public Entry addEntry(@RequestBody Entry entry) {
        return entryService.addEntry(entry);
    }

    @DeleteMapping("/{id}")
    public void deleteEntry(@PathVariable int id) {
        entryService.deleteEntry(id);
    }
}
