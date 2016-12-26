package spike.mongodb.services;

import org.junit.Test;
import spike.mongodb.model.Human;
import spike.mongodb.repository.TestHumanRepository;

import static org.junit.Assert.assertNull;

public class DeleteHumanInfoServiceTest {

    @Test
    public void shouldReturnEmptyWhenQueryAfterHumanInfoDeleted () {
        String id = "validId";
        TestHumanRepository testHumanRepository = new TestHumanRepository();
        DeleteHumanService deleteHumanService = new DeleteHumanServiceImpl(testHumanRepository);
        deleteHumanService.deleteHuman(id);
        Human human = testHumanRepository.findOne(id);
        assertNull(human);
    }
}
