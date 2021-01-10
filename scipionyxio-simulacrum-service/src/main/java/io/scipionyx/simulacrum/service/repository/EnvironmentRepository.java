package io.scipionyx.simulacrum.service.repository;

import io.scipionyx.simulacrum.model.environment.Environment;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EnvironmentRepository extends ReactiveCrudRepository<Environment, Long> {
}
