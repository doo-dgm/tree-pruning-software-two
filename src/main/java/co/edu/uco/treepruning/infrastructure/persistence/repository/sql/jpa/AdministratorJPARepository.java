package co.edu.uco.treepruning.infrastructure.persistence.repository.sql.jpa;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import co.edu.uco.treepruning.infrastructure.persistence.repository.sql.jpa.entity.AdministratorJPAEntity;

public interface AdministratorJPARepository extends JpaRepository<AdministratorJPAEntity, UUID> {

    @Query("SELECT a FROM AdministratorJPAEntity a WHERE " +
           "(:id IS NULL OR a.id = :id) AND " +
           "(:username IS NULL OR a.username ILIKE concat('%', CAST(:username AS String), '%')) AND " +
           "(:email IS NULL OR a.email ILIKE concat('%', CAST(:email AS String), '%'))")
    List<AdministratorJPAEntity> findByFilter(@Param("id") UUID id,
                                              @Param("username") String username,
                                              @Param("email") String email);
}
