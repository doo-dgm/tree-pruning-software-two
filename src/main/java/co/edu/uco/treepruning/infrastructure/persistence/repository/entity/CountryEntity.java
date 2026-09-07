package co.edu.uco.treepruning.infrastructure.persistence.repository.entity;

import java.util.UUID;
import co.edu.uco.treepruning.crosscutting.helper.TextHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class CountryEntity {
    private UUID id;
    private String name;
    private String isoCode;

    public CountryEntity() {
        super();
        setId(UUIDHelper.getDefault());
        setName(TextHelper.getDefault());
        setIsoCode(TextHelper.getDefault());
    }

    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    
    public String getIsoCode() {
		return isoCode;
	}

    public void setId(final UUID id) {
        this.id = UUIDHelper.getDefault(id);
    }
    public void setName(final String name) {
        this.name = TextHelper.getDefault(name);
    }
    public void setIsoCode(final String isoCode) {
		this.isoCode = TextHelper.getDefault(isoCode);
	} 
}
