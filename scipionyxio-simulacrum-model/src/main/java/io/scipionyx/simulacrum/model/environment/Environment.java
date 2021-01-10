package io.scipionyx.simulacrum.model.environment;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
@Data
public class Environment {

    @MongoId
    private Long id;

    private String name;

    private String description;

    private Site[][] sites;

}
