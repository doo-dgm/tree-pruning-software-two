package co.edu.uco.treepruning.infrastructure.persistence.repository.adapter.sql.jpa;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import co.edu.uco.treepruning.crosscutting.helper.TextHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;
import co.edu.uco.treepruning.infrastructure.persistence.repository.AdministratorRepository;
import co.edu.uco.treepruning.infrastructure.persistence.repository.adapter.sql.jpa.mapper.AdministratorEntityMapper;
import co.edu.uco.treepruning.infrastructure.persistence.repository.entity.AdministratorEntity;
import co.edu.uco.treepruning.infrastructure.persistence.repository.sql.jpa.AdministratorJPARepository;

@Repository
public class AdministratorJPARepositoryAdapter implements AdministratorRepository {

    private final AdministratorJPARepository repository;
    private final AdministratorEntityMapper mapper;

    public AdministratorJPARepositoryAdapter(AdministratorJPARepository repository,
            AdministratorEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void create(AdministratorEntity entity) {
        repository.save(mapper.toJPA(entity));
    }

    @Override
    public void update(UUID id, AdministratorEntity entity) {
        // TODO
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }

    @Override
    public List<AdministratorEntity> findAll() {
        return mapper.toEntityList(repository.findAll());
    }

    @Override
    public AdministratorEntity findById(UUID id) {
        return repository.findById(id)
                .map(mapper::toEntity)
                .orElse(new AdministratorEntity());
    }

    @Override
    public List<AdministratorEntity> findByFilter(UUID id, String username, String email) {
        UUID effectiveId = UUIDHelper.isDefaultUUID(id) ? null : id;
        String effectiveUsername = TextHelper.isEmptyWithTrim(username) ? null : username.trim();
        String effectiveEmail = TextHelper.isEmptyWithTrim(email) ? null : email.trim();
        return mapper.toEntityList(repository.findByFilter(
                effectiveId, effectiveUsername, effectiveEmail));
    }
}
