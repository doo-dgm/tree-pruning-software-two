package co.edu.uco.treepruning.infrastructure.persistence.repository.entity;

import java.util.UUID;
import co.edu.uco.treepruning.crosscutting.helper.ObjectHelper;
import co.edu.uco.treepruning.crosscutting.helper.TextHelper;
import co.edu.uco.treepruning.crosscutting.helper.UUIDHelper;

public class MunicipalityEntity {
    private UUID id;
    private String name;
    private StateEntity state;

    public MunicipalityEntity() {
        super();
        setId(UUIDHelper.getDefault());
        setName(TextHelper.getDefault());
        setState(new StateEntity());
    }
    
    public MunicipalityEntity(final UUID id) {
		super();
		setId(id);
		setName(TextHelper.getDefault());
		setState(new StateEntity());
	}
    
    public MunicipalityEntity(final UUID id, final String name, final StateEntity state) {
		super();
		setId(id);
		setName(name);
		setState(state);
	}

    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public StateEntity getState() {
        return state;
    }

    public void setId(final UUID id) {
        this.id = UUIDHelper.getDefault(id);
    }
    public void setName(final String name) {
        this.name = TextHelper.getDefault(name);
    }
    public void setState(final StateEntity state) {
        this.state = ObjectHelper.getDefault(state, new StateEntity());
    }
}
