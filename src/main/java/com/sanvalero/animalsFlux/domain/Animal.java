package com.sanvalero.animalsFlux.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Creado por @ author: Pedro Orós
 * el 12/05/2021
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "animal")
public class Animal {

    @Id
    private String id;

    @Field
    private String name;

    @Field
    private String classification;

    @Field
    private int height;

    @Field
    private float weight;
}
