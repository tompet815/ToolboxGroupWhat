package DTO;

import java.io.Serializable;

public class FerryRouteIdentifer implements Serializable {

    private long id;

    public FerryRouteIdentifer(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

}
