package org.example.buoi3.controllers;

import org.example.buoi3.model.Colors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class DemoController {

    @PostMapping
    public ResponseEntity<?> createColors(@RequestBody Colors colors){
        return ResponseEntity.ok(colors);
    }
    @PostMapping("/param")
    public ResponseEntity<?> createColorsParam(Colors colors){
        return ResponseEntity.ok(colors);
    }

}
