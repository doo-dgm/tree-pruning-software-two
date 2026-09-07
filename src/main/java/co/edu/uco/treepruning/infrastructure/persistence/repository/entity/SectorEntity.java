package co.edu.uco.treepruning.infrastructure.persistence.repository.entity;

import java.util.UUID;
import co.edu.uco.treepruning.crosscutting.helper.ObjectHelper;
import co.edu.uco.treepruning.crosscutting.helper.TextHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class SectorEntity {
    private UUID id;
    private String name;
    private MunicipalityEntity municipality;

    public SectorEntity() {
        super();
        setId(UUIDHelper.getDefault());
        setName(TextHelper.getDefault());
        setMunicipality(new MunicipalityEntity());
    }

    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public MunicipalityEntity getMunicipality() {
        return municipality;
    }

    public void setId(final UUID id) {
        this.id = UUIDHelper.getDefault(id);
    }
    public void setName(final String name) {
        this.name = TextHelper.getDefault(name);
    }
    public void setMunicipality(final MunicipalityEntity municipality) {
        this.municipality = ObjectHelper.getDefault(municipality, new MunicipalityEntity());
    }
}
