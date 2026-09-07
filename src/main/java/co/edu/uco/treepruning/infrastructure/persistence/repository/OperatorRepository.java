package co.edu.uco.treepruning.infrastructure.persistence.repository;

import java.util.List;
import java.util.UUID;

import co.edu.uco.treepruning.infrastructure.persistence.repository.entity.OperatorEntity;

public interface OperatorRepository {
    void create(OperatorEntity entity);
    void update(UUID id, OperatorEntity entity);
    void delete(UUID id);
    List<OperatorEntity> findAll();
    OperatorEntity findById(UUID id);
    List<OperatorEntity> findByFilter(UUID id, UUID personId, UUID quadrilleId);
}
