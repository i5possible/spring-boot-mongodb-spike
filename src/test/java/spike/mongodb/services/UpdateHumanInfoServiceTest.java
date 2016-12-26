package spike.mongodb.services;

import org.junit.Test;
import spike.mongodb.model.Human;
import spike.mongodb.repository.TestHumanRepository;

import static org.junit.Assert.assertEquals;

public class UpdateHumanInfoServiceTest {

    @Test
    public void shouldReturnModifiedHumanInfo () {
        Human newHuman = getDummyHuman();
        String id = "validId";
        TestHumanRepository testHumanRepository = new TestHumanRepository();
        UpdateHumanService updateHumanService = new UpdateHumanServiceImpl(testHumanRepository);
        Human updatedHuman = updateHumanService.updateHuman(newHuman, id);
        assertEquals(newHuman, updatedHuman);
    }

    public Human getDummyHuman () {
        Human newHuman =  new Human("new person");
        newHuman.setPassword("123456");
        newHuman.setAge(100);
        newHuman.setEmail("Email");
        return newHuman;
    }
}
