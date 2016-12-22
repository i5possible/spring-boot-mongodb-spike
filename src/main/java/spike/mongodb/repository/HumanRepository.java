package spike.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import spike.mongodb.model.Human;

public interface HumanRepository extends MongoRepository<Human, String> {
    Human findByName(String userName);
}
