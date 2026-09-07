package co.edu.uco.treepruning.infrastructure.persistence.repository.sql.jpa;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import co.edu.uco.treepruning.infrastructure.persistence.repository.sql.jpa.entity.OperatorJPAEntity;

public interface OperatorJPARepository extends JpaRepository<OperatorJPAEntity, UUID> {

    @Query("SELECT o FROM OperatorJPAEntity o WHERE " +
           "(:id IS NULL OR o.id = :id) AND " +
           "(:personId IS NULL OR o.person.id = :personId) AND " +
           "(:quadrilleId IS NULL OR o.quadrille.id = :quadrilleId)")
    List<OperatorJPAEntity> findByFilter(@Param("id") UUID id,
                                         @Param("personId") UUID personId,
                                         @Param("quadrilleId") UUID quadrilleId);
}
