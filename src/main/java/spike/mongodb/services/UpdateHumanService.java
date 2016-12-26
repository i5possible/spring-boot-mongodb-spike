package spike.mongodb.services;

import spike.mongodb.model.Human;

public interface UpdateHumanService {
    public Human updateHuman (Human newHuman, String toUpdateHumanID);
}
