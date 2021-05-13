package com.sanvalero.animalsFlux.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Creado por @ author: Pedro Orós
 * el 12/05/2021
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalDTO {

    private String name;
    private int height;
    private float weight;
}
