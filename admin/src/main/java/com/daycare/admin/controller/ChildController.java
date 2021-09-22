package com.daycare.admin.controller;

import com.daycare.admin.entity.Child;
import com.daycare.admin.repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/child")
@CrossOrigin("*")
public class ChildController {

    @Autowired
    private ChildRepository childRepository;

    @PostMapping("/addChild")
    public Child saveChild(@RequestBody Child child){
        return childRepository.save(child);
    }

    @GetMapping("/getChild/{id}")
    public Child getChild(@PathVariable("id") String childId){
        System.out.println("This is the child id: " + childId);
        return childRepository.getChildById(childId);
    }

    @DeleteMapping("/deleteChild/{id}")
    public String deleteEmployee(@PathVariable("id") String childId){
        return childRepository.deleteChildById(childId);
    }

    @PutMapping("/updateChild/{id}")
    public String updateChild(@PathVariable("id") String childId, Child child){
        return childRepository.updateChild(childId, child);
    }
}
