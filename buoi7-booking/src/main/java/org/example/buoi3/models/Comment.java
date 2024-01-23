package org.example.buoi3.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @Column(name = "id")
    private Long id;


    @Column(name = "content")
    private String content;

    // 1 customer có nhiều comment => 1 list comment mới có 1 đối tượng customer
    @ManyToOne
    @JoinColumn(name = "id_customer")
    @JsonIgnore
    private Customer customer;
}
