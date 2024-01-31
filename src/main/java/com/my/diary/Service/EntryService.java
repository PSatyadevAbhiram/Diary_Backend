package com.my.diary.Service;

import com.my.diary.Entity.Entry;
import com.my.diary.Repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EntryService {
    @Autowired
    private EntryRepository entryRepository;

    public List<Entry> getEntries(){
        return entryRepository.findAll();
    }

    public Entry getEntry(int id){
        return entryRepository.findById(id).orElse(null);
    }

    public Entry addEntry(Entry entry){
        return entryRepository.save(entry);
    }

    public void deleteEntry(int id){
        entryRepository.deleteById(id);
    }
}
