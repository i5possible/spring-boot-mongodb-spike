package spike.mongodb.repository;

import spike.mongodb.model.Human;

import java.util.HashMap;
import java.util.Map;


public class TestHumanRepository extends TestRepository<Human, String> implements HumanRepository {
    Map<String, Human> humanMap = new HashMap<String, Human>();

    public TestHumanRepository() {
        Human lh = new Human();
        lh.setName("LiangHong");
        lh.setPassword("1qaz!QAZ");
        lh.setAge(25);
        lh.setEmail("Email");
        humanMap.put("lh", lh);
    }

    @Override
    public Human findByName(String userName) {
        return new Human("LiangHong", "password");
    }

    @Override
    public Human findOne(String id) {
        return humanMap.get(id);
    }
}
