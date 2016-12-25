package spike.mongodb.services;

import org.junit.Test;
import spike.mongodb.model.Human;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class GetHumanInfoServiceTest {

    @Test
    public void shouldReturnHumanInfoGivenValidId() {
        String id = "test";
        GetHumanService humanService = new GetHumanServiceImpl();
        Optional<Human> human = humanService.getHuman(id);
        assertEquals(true, human.isPresent());
    }
    
    @Test
    public void shouldReturnEmptyGivenInvalidId () {
        String id = "invalidId";
        GetHumanServiceImpl humanService = new GetHumanServiceImpl();
        Optional<Human> human = humanService.getHuman(id);
        assertEquals(false, human.isPresent());
    }
}
