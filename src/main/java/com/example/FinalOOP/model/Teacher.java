package com.example.FinalOOP.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Teacher extends User {
    private String className; // "Griffindor", "Slytherin", "Ravenclaw", "Hufflepuff"
}