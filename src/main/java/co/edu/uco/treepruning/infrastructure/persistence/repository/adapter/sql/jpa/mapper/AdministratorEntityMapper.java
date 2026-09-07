package co.edu.uco.treepruning.infrastructure.persistence.repository.adapter.sql.jpa.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import co.edu.uco.treepruning.infrastructure.persistence.repository.entity.AdministratorEntity;
import co.edu.uco.treepruning.infrastructure.persistence.repository.sql.jpa.entity.AdministratorJPAEntity;

@Mapper(componentModel = "spring")
public interface AdministratorEntityMapper {

    AdministratorJPAEntity toJPA(AdministratorEntity entity);
    AdministratorEntity toEntity(AdministratorJPAEntity jpaEntity);
    List<AdministratorEntity> toEntityList(List<AdministratorJPAEntity> jpaEntities);
}
