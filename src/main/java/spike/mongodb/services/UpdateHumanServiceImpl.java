package spike.mongodb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spike.mongodb.model.Human;
import spike.mongodb.repository.HumanRepository;

@Service
public class UpdateHumanServiceImpl implements UpdateHumanService {
    private HumanRepository humanRepository;

    @Autowired
    public UpdateHumanServiceImpl(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    @Override
    public Human updateHuman(Human newHuman, String toUpdateHumanID) {
        return humanRepository.save(newHuman);
    }
}
