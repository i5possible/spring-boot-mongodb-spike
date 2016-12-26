package spike.mongodb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spike.mongodb.model.Human;
import spike.mongodb.repository.HumanRepository;

@Service
public class CreateHumanServiceImpl implements CreateHumanService {

    private HumanRepository humanRepository;

    @Autowired
    public CreateHumanServiceImpl(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    @Override
    public Human createHuman(Human human) {
        return humanRepository.save(human);
    }
}
