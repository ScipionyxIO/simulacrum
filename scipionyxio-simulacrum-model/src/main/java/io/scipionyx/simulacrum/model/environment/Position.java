package io.scipionyx.simulacrum.model.environment;

import lombok.Data;

@Data
public class Position {

    private int x;

    private int y;

    private int z;

    /**
     * Time
     */
    private int t;

}
