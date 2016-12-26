package spike.mongodb.services;

import org.junit.Test;
import spike.mongodb.model.Human;
import spike.mongodb.repository.TestHumanRepository;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
public class GetHumanInfoServiceTest {
    private Human human = generateDummyHuman();
    private TestHumanRepository testHumanRepository = new TestHumanRepository();
    @Test
    public void shouldReturnHumanInfoGivenValidId() {
        String id = "validId";
        GetHumanServiceImpl getHumanService = new GetHumanServiceImpl(testHumanRepository);
        Optional<Human> humanOptional = getHumanService.getHuman(id);
        assertEquals(human.getName(), humanOptional.get().getName());
    }

    @Test
    public void shouldReturnEmptyGivenInvalidId () {
        String id = "invalidId";
        GetHumanServiceImpl humanService = new GetHumanServiceImpl(testHumanRepository);
        Optional<Human> human = humanService.getHuman(id);
        assertEquals(false, human.isPresent());
    }

    private Human generateDummyHuman() {
        Human human = new Human();
        human.setName("LiangHong");
        return human;
    }
}
