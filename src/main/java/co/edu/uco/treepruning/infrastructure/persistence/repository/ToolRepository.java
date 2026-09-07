package co.edu.uco.treepruning.infrastructure.persistence.repository;

import java.util.List;
import java.util.UUID;

import co.edu.uco.treepruning.infrastructure.persistence.repository.entity.ToolEntity;

public interface ToolRepository {
    void create(ToolEntity entity);
    void update(UUID id, ToolEntity entity);
    void delete(UUID id);
    List<ToolEntity> findAll();
    ToolEntity findById(UUID id);
    List<ToolEntity> findByFilter(UUID id, String name, String description);
}
