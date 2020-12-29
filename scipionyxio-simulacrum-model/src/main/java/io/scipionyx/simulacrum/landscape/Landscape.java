package io.scipionyx.simulacrum.landscape;

import io.scipionyx.simulacrum.landscape.shape.Shape;
import lombok.Data;

import java.util.List;

@Data
public class Landscape {

    private Shape shape;

    private List<Layer> layers;

}
