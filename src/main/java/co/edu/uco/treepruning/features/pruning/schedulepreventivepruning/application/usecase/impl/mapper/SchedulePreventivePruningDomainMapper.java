package co.edu.uco.treepruning.features.pruning.schedulepreventivepruning.application.usecase.impl.mapper;

import java.util.UUID;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import co.edu.uco.treepruning.features.pruning.schedulepreventivepruning.application.usecase.domain.SchedulePreventivePruningDomain;
import co.edu.uco.treepruning.infrastructure.persistence.repository.entity.PruningEntity;
import co.edu.uco.treepruning.infrastructure.persistence.repository.entity.QuadrilleEntity;
import co.edu.uco.treepruning.infrastructure.persistence.repository.entity.StatusEntity;
import co.edu.uco.treepruning.infrastructure.persistence.repository.entity.TreeEntity;
import co.edu.uco.treepruning.infrastructure.persistence.repository.entity.TypeEntity;

@Mapper(componentModel = "spring")
public interface SchedulePreventivePruningDomainMapper {

    @Mapping(target = "pqr", ignore = true)
    PruningEntity toEntity(SchedulePreventivePruningDomain domain);

    // Los IDs planos del dominio se referencian como entidades "por id" en
    // PruningEntity (patron ya usado por el resto del dominio: EntityName(UUID id)).
    default StatusEntity mapStatus(UUID id) {
        return new StatusEntity(id);
    }

    default TreeEntity mapTree(UUID id) {
        return new TreeEntity(id);
    }

    default QuadrilleEntity mapQuadrille(UUID id) {
        return new QuadrilleEntity(id);
    }

    default TypeEntity mapType(UUID id) {
        return new TypeEntity(id);
    }
}
