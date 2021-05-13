package com.sanvalero.animalsFlux.service;

import com.sanvalero.animalsFlux.domain.Animal;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Creado por @ author: Pedro Orós
 * el 12/05/2021
 */

public interface AnimalService {

    Flux<Animal> findAll();
    Mono<Animal> findById(String id);
    Mono<Animal> findByName(String name);
    Flux<Animal> findByClassification(String classification);

    Mono<Animal> addAnimal(Animal animal);
    Mono<Animal> modifyAnimal(String id, Animal newAnimal);
    void deleteAnimal(String id);
}
