package co.edu.uco.treepruning.infrastructure.persistence.repository.entity;

import java.util.UUID;
import co.edu.uco.treepruning.crosscutting.helper.TextHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class FamilyEntity {
    private UUID id;
    private String scientificName;
    private String commonName;

    public FamilyEntity() {
        super();
        setId(UUIDHelper.getDefault());
        setScientificName(TextHelper.getDefault());
        setCommonName(TextHelper.getDefault());
    }
    
    public FamilyEntity(final UUID id) {
		super();
		setId(id);
		setScientificName(TextHelper.getDefault());
		setCommonName(TextHelper.getDefault());
	}
    
    public FamilyEntity(final UUID id, final String scientificName, final String commonName) {
		super();
		setId(id);
		setScientificName(scientificName);
		setCommonName(commonName);
	}

    public UUID getId() {
        return id;
    }
    public String getScientificName() {
        return scientificName;
    }
    public String getCommonName() {
        return commonName;
    }

    public void setId(final UUID id) {
        this.id = UUIDHelper.getDefault(id);
    }
    public void setScientificName(final String scientificName) {
        this.scientificName = TextHelper.getDefaultWithTrim(scientificName);
    }
    public void setCommonName(final String commonName) {
        this.commonName = TextHelper.getDefaultWithTrim(commonName);
    }
}
