package com.shivam.calculetor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.model.calculetor;
import com.shivam.service.calcuservice;

@RestController
@RequestMapping("/api/sss") // Base path
public class CalculatorController {
    
    @Autowired
    private calcuservice clrrs;

    @PostMapping("/Add") 
    public double add(@RequestBody calculetor clr) {
        return clrrs.add(clr.getA(), clr.getB());
    }
    @PostMapping("/sub") 
    public double sub(@RequestBody calculetor clr) {
        return clrrs.sub(clr.getA(), clr.getB());
    }
    @PostMapping("/div") 
    public double div(@RequestBody calculetor clr) {
        return clrrs.divide(clr.getA(), clr.getB());
    }
}

