package org.example.buoi3.controllers;

import org.example.buoi3.model.Colors;
import org.example.buoi3.model.Result;
import org.example.buoi3.services.IColorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hot-color")
public class HotColorController {
    private final IColorService iColorService;

    public HotColorController(IColorService iColorService) {
        this.iColorService = iColorService;
    }

    @PostMapping
    public ResponseEntity<?> checkColor(@RequestBody Colors colors){
        Result result = iColorService.checkColor(colors);
        return ResponseEntity.ok(result);
    }
}
