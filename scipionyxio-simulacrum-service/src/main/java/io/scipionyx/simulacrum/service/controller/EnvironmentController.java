package io.scipionyx.simulacrum.service.controller;

import io.scipionyx.simulacrum.model.environment.Environment;
import io.scipionyx.simulacrum.service.repository.EnvironmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/environment/")
@RequiredArgsConstructor
public class EnvironmentController {

    public final EnvironmentRepository repository;

    @PutMapping(path = "/save")
    public Mono<Environment> save(@RequestBody final Environment environment) {
        return repository.save(environment);
    }

}
