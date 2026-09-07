package co.edu.uco.treepruning.infrastructure.persistence.repository.adapter.sql.jpa.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import co.edu.uco.treepruning.infrastructure.persistence.repository.entity.OperatorEntity;
import co.edu.uco.treepruning.infrastructure.persistence.repository.sql.jpa.entity.OperatorJPAEntity;

@Mapper(componentModel = "spring", uses = {
    PersonEntityMapper.class,
    QuadrilleEntityMapper.class
})
public interface OperatorEntityMapper {

    OperatorJPAEntity toJPA(OperatorEntity entity);
    OperatorEntity toEntity(OperatorJPAEntity jpaEntity);
    List<OperatorEntity> toEntityList(List<OperatorJPAEntity> jpaEntities);
}
