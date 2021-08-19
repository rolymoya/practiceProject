package com.daycare.admin.controller;

import com.daycare.admin.entity.Child;
import com.daycare.admin.repository.ChildRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChildController {

    private ChildRepository childRepository;

    @PostMapping("/child")
    public Child saveChild(@RequestBody Child child){
        return childRepository.save(child);
    }

    @GetMapping("/child/{id}")
    public Child getChild(@PathVariable("id") String childId){
        return childRepository.getChildById(childId);
    }

    @DeleteMapping("/child/{id}")
    public String deleteEmployee(@PathVariable("id") String childId){
        return childRepository.deleteChildById(childId);
    }

    @PutMapping("/child/{id}")
    public String updateChild(@PathVariable("id") String childId, Child child){
        return childRepository.updateChild(childId, child);
    }
}
