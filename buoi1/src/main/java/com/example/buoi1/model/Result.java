package com.example.buoi1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Long id;
    private List<Colors> colors1;
    private List<Colors> colors2;
}
