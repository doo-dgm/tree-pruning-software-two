package co.edu.uco.treepruning.infrastructure.persistence.repository.sql.jpa;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import co.edu.uco.treepruning.infrastructure.persistence.repository.sql.jpa.entity.ToolJPAEntity;

public interface ToolJPARepository extends JpaRepository<ToolJPAEntity, UUID> {

    @Query("SELECT t FROM ToolJPAEntity t WHERE " +
           "(:id IS NULL OR t.id = :id) AND " +
           "(:name IS NULL OR t.name ILIKE concat('%', CAST(:name AS String), '%')) AND " +
           "(:description IS NULL OR t.description ILIKE concat('%', CAST(:description AS String), '%'))")
    List<ToolJPAEntity> findByFilter(@Param("id") UUID id,
                                     @Param("name") String name,
                                     @Param("description") String description);
}
