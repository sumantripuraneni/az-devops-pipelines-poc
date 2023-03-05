package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ExampleController {

    private final ExampleRepository exampleRepository;

    public ExampleController(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    @PostMapping("/example")
    @ResponseStatus(HttpStatus.CREATED)
    public Example createExample(@RequestBody Example example) {
        return exampleRepository.save(example);
    }

    @GetMapping("/example")
    public Iterable<Example> getExamples() {
        return exampleRepository.findAll();
    }
}