package spike.mongodb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import spike.mongodb.model.HumanModel;

public interface HumanRepository extends MongoRepository<HumanModel, String> {
    public HumanModel findByName(String userName);
}
