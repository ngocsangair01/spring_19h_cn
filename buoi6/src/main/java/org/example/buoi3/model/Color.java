package org.example.buoi3.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// danh dau class la 1 bang o trong sql
@Entity
//Quy tac: ten_viet_gach_duoi_viet_thuong_het
@Table(name = "color")
public class Color {
    @Id
    @Column(name = "id",unique = true)
    // tu dong tang
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_color")
    @Nationalized
    private String name;

    @Column(name = "type")
    @Nationalized
    private String type;

    @Column(name = "test")
    private String test;

}
