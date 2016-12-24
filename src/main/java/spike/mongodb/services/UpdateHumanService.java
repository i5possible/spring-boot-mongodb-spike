package spike.mongodb.services;

import spike.mongodb.model.Human;

public interface UpdateHumanService {
    public void updateHuman (Human newHuman, String toUpdateHumanID);
}
