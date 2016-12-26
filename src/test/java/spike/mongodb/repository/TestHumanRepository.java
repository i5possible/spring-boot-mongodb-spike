package spike.mongodb.repository;

import spike.mongodb.model.Human;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class TestHumanRepository extends TestRepository<Human, String> implements HumanRepository {
    Map<String, Human> humanMap = new HashMap<String, Human>();

    public TestHumanRepository() {
        Human lh = new Human();
        lh.setId("validId");
        lh.setName("LiangHong");
        humanMap.put("validId", lh);
    }

    @Override
    public Human findByName(String userName) {
        return new Human("LiangHong", "password");
    }

    @Override
    public Human findOne(String id) {
        return humanMap.get(id);
    }

    @Override
    public Human save (Human human) {
        human.setId(UUID.randomUUID().toString());
        return human;
    }
}
