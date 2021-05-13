package com.sanvalero.animalsFlux.service;

import com.sanvalero.animalsFlux.domain.Animal;
import com.sanvalero.animalsFlux.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Objects;

/**
 * Creado por @ author: Pedro Orós
 * el 12/05/2021
 */

@Service
public class AnimalServiceImp implements AnimalService{

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public Flux<Animal> findAll() {
        return animalRepository.findAll();
    }

    @Override
    public Mono<Animal> findById(String id) {
        return animalRepository.findById(id);
    }

    @Override
    public Mono<Animal> findByName(String name) {
        return animalRepository.findByName(name);
    }

    @Override
    public Flux<Animal> findByClassification(String classification) {
        return animalRepository.findByClassification(classification);
    }

    @Override
    public Mono<Animal> addAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public Mono<Animal> modifyAnimal(String id, Animal newAnimal) {
        Mono<Animal> animal = animalRepository.findById(id);
        newAnimal.setId(Objects.requireNonNull(animal.block()).getId());
        return animalRepository.save(newAnimal);
    }

    @Override
    public void deleteAnimal(String id) {
        Mono<Animal> animal = animalRepository.findById(id);
        Animal deletingAnimal = new Animal();
        deletingAnimal.setId(Objects.requireNonNull(animal.block()).getId());
        animalRepository.delete(deletingAnimal);
    }


}
