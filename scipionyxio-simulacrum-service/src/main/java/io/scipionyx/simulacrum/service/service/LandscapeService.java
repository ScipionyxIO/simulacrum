package io.scipionyx.simulacrum.service.service;

import io.scipionyx.simulacrum.model.environment.Site;
import io.scipionyx.simulacrum.model.environment.Layer;

import java.util.Map;

public interface LandscapeService {

    Map<Layer, Object> load(final Site landscape);

}
