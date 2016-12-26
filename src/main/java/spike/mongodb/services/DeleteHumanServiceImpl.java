package spike.mongodb.services;

import spike.mongodb.repository.HumanRepository;

public class DeleteHumanServiceImpl implements DeleteHumanService {
    private HumanRepository humanRepository;

    public DeleteHumanServiceImpl(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    @Override
    public void deleteHuman(String id) {
        humanRepository.delete(id);
    }
}
