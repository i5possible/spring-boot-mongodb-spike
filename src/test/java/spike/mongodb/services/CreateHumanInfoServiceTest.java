package spike.mongodb.services;

import org.junit.Test;
import spike.mongodb.model.Human;
import spike.mongodb.repository.TestHumanRepository;

import static org.junit.Assert.assertNotNull;

public class CreateHumanInfoServiceTest {

    @Test
    public void shouldReturnHumanWithId () {
        Human human = new Human("LiangHong");
        TestHumanRepository testHumanRepository = new TestHumanRepository();
        CreateHumanServiceImpl createHumanService = new CreateHumanServiceImpl(testHumanRepository);
        Human returnedHuman = createHumanService.createHuman(human);
        assertNotNull(returnedHuman.getId());
    }
}
