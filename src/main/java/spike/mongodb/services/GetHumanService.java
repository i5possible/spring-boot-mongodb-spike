package spike.mongodb.services;

import spike.mongodb.model.Human;

import java.util.Optional;

public interface GetHumanService {
    Optional<Human> getHuman(String id);
}
