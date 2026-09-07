package co.edu.uco.treepruning.infrastructure.persistence.repository.adapter.sql.jpa.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import co.edu.uco.treepruning.infrastructure.persistence.repository.entity.ToolEntity;
import co.edu.uco.treepruning.infrastructure.persistence.repository.sql.jpa.entity.ToolJPAEntity;

@Mapper(componentModel = "spring")
public interface ToolEntityMapper {

    ToolJPAEntity toJPA(ToolEntity entity);
    ToolEntity toEntity(ToolJPAEntity jpaEntity);
    List<ToolEntity> toEntityList(List<ToolJPAEntity> jpaEntities);
}
