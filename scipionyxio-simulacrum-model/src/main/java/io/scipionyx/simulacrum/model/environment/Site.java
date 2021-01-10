package io.scipionyx.simulacrum.model.environment;

import lombok.Data;

import java.util.List;

@Data
public class Site {

    private Position position;

    private List<Layer> layers;

}
