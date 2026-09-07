package co.edu.uco.treepruning.infrastructure.persistence.repository.adapter.sql.jpa.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import co.edu.uco.treepruning.infrastructure.persistence.repository.entity.PruningToolEntity;
import co.edu.uco.treepruning.infrastructure.persistence.repository.sql.jpa.entity.PruningToolJPAEntity;

@Mapper(componentModel = "spring", uses = {
    PruningEntityMapper.class,
    ToolEntityMapper.class
})
public interface PruningToolEntityMapper {

    PruningToolJPAEntity toJPA(PruningToolEntity entity);
    PruningToolEntity toEntity(PruningToolJPAEntity jpaEntity);
    List<PruningToolEntity> toEntityList(List<PruningToolJPAEntity> jpaEntities);
}
