package org.example.buoi3.controllers;

import org.example.buoi3.model.Color;
import org.example.buoi3.services.IColorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/color")
public class ColorController {
    private final IColorService colorService;

    public ColorController(IColorService colorService) {
        this.colorService = colorService;
    }

    @PostMapping
    public ResponseEntity<?> createColor(String name, String type,String test){
        Color color = colorService.createColor(name,type,test);
        return ResponseEntity.ok(color);
    }
    @PostMapping("/body")
    public ResponseEntity<?> createColorBody(@RequestBody Color color){
        return ResponseEntity.ok(colorService.createColorBody(color));
    }

    @GetMapping
    public ResponseEntity<?> getListColor(){
        return ResponseEntity.ok(colorService.getAllColor());
    }

    @GetMapping("/type")
    public ResponseEntity<?> getColorByType(String type){
        return ResponseEntity.ok(colorService.getColorByType(type));
    }
}
