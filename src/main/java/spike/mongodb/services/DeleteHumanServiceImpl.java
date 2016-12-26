package spike.mongodb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spike.mongodb.repository.HumanRepository;

@Service
public class DeleteHumanServiceImpl implements DeleteHumanService {
    private HumanRepository humanRepository;

    @Autowired
    public DeleteHumanServiceImpl(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    @Override
    public void deleteHuman(String id) {
        humanRepository.delete(id);
    }
}
