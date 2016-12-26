package spike.mongodb.services;

import spike.mongodb.model.Human;

@FunctionalInterface
public interface CreateHumanService {
    public Human createHuman (Human human);
}
