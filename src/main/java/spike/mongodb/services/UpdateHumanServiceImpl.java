package spike.mongodb.services;

import spike.mongodb.model.Human;
import spike.mongodb.repository.HumanRepository;

public class UpdateHumanServiceImpl implements UpdateHumanService {
    private HumanRepository humanRepository;

    public UpdateHumanServiceImpl(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    @Override
    public Human updateHuman(Human newHuman, String toUpdateHumanID) {
        return humanRepository.save(newHuman);
    }
}
