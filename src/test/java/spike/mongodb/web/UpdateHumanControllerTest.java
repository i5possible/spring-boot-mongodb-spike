package spike.mongodb.web;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import spike.mongodb.model.Human;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UpdateHumanControllerTest {

    boolean isUpdateHumanServiceInvoked = false;

    @Test
    public void shouldInvokeServiceAndReturnAcceptedWhenUpdateHuman() {
        Human human = new Human();
        String id = "id";
        UpdateHumanController updateHumanController = new UpdateHumanController(
                (human1, id1) -> {
                    isUpdateHumanServiceInvoked = true;
                    return null;
                });
        ResponseEntity responseEntity = updateHumanController.updateHuman(human, id);
        assertEquals(HttpStatus.ACCEPTED, responseEntity.getStatusCode());
        assertTrue(isUpdateHumanServiceInvoked);
    }

}
