package com.example.buoi1.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Colors {
    private Long id;
    private String name;
    private String type;
}
