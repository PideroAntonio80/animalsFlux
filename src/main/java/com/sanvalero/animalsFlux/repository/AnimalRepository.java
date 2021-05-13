package com.sanvalero.animalsFlux.repository;

import com.sanvalero.animalsFlux.domain.Animal;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Creado por @ author: Pedro Orós
 * el 12/05/2021
 */

@Repository
public interface AnimalRepository extends ReactiveMongoRepository<Animal, String> {
    Flux<Animal> findAll();
    Mono<Animal> findById(String id);
    Mono<Animal> findByName(String name);
    Flux<Animal> findByClassification(String classification);
}
