package spike.mongodb.services;

import spike.mongodb.model.Human;

import java.util.Optional;

public class GetHumanServiceImpl implements GetHumanService {

    @Override
    public Optional<Human> getHuman(String id) {
        return Optional.empty();
    }
}
