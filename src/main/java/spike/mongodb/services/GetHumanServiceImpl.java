package spike.mongodb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spike.mongodb.model.Human;
import spike.mongodb.repository.HumanRepository;

import java.util.Optional;

@Service
public class GetHumanServiceImpl implements GetHumanService {

    private HumanRepository humanRepository;

    @Autowired
    public GetHumanServiceImpl(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }
    @Override
    public Optional<Human> getHuman(String id) {
        if (humanRepository.findOne(id) == null) {
            return Optional.empty();
        } else {
            return Optional.of(humanRepository.findOne(id));
        }
    }
}
