package com.sanvalero.animalsFlux.controller;

import com.sanvalero.animalsFlux.domain.Animal;
import com.sanvalero.animalsFlux.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.websocket.server.PathParam;

/**
 * Creado por @ author: Pedro Orós
 * el 12/05/2021
 */

@RestController
@RequestMapping(value = "/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Animal> getAnimals() {
        return animalService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<Animal> getAnimalById(@PathVariable String id) {
        return animalService.findById(id);
    }

    @GetMapping(value = "/name")
    public Mono<Animal> getAnimalByName(@PathParam(value = "name") String name) {
        return animalService.findByName(name);
    }

    @GetMapping(value = "/classification")
    public Flux<Animal> getAnimalByClassification(@PathParam(value = "classification") String classification) {
        return animalService.findByClassification(classification);
    }

    @PostMapping
    public Mono<Animal> addAnimal(@RequestBody Animal animal) {
        return animalService.addAnimal(animal);
    }

    @PutMapping(value = "/{id}")
    public Mono<Animal> modifyAnimal(@PathVariable String id, @RequestBody Animal newAnimal) {
        return animalService.modifyAnimal(id, newAnimal);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteAnimal(@PathVariable String id) {
        animalService.deleteAnimal(id);
    }
}