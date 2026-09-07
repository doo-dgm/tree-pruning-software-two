package co.edu.uco.treepruning.infrastructure.persistence.repository;

import java.util.List;
import java.util.UUID;

import co.edu.uco.treepruning.infrastructure.persistence.repository.entity.AdministratorEntity;

public interface AdministratorRepository {
    void create(AdministratorEntity entity);
    void update(UUID id, AdministratorEntity entity);
    void delete(UUID id);
    List<AdministratorEntity> findAll();
    AdministratorEntity findById(UUID id);
    List<AdministratorEntity> findByFilter(UUID id, String username, String email);
}
