package spike.mongodb.services;

import spike.mongodb.model.Human;
import spike.mongodb.repository.HumanRepository;

public class CreateHumanServiceImpl implements CreateHumanService {

    private HumanRepository humanRepository;

    public CreateHumanServiceImpl(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    @Override
    public Human createHuman(Human human) {
        return humanRepository.save(human);
    }
}
