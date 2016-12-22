package spike.mongodb.repository;

import spike.mongodb.model.Human;

public class TestHumanRepository extends TestRepository<Human, String> implements HumanRepository {
    @Override
    public Human findByName(String userName) {
        return new Human("lianghong");
    }

    @Override
    public Human findOne(String s) {
        return new Human("lianghong");
    }
}
