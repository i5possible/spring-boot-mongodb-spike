package spike.mongodb.services;

import spike.mongodb.model.Human;

public interface UpdateHumanService {
    Human updateHuman (Human newHuman, String toUpdateHumanID);
}
