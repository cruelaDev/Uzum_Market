package org.example.common;

import java.util.List;
import java.util.Optional;

public interface Service<ENTITY, ID> {

    ENTITY add(ENTITY entity);
    void delete(ID id);

    List<ENTITY> getAll();

    Optional<ENTITY> findById(ID id);
}
