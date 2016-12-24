package spike.mongodb.web;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import spike.mongodb.model.Human;
import spike.mongodb.services.UpdateHumanService;

import static org.junit.Assert.assertEquals;

public class UpdateHumanControllerTest {

    boolean isUpdateHumanServiceInvoked = false;
    @Test
    public void shouldInvokeServiceAndReturnAcceptedWhenUpdateHuman() {
        Human human = new Human();
        String id = "id";
        UpdateHumanService updateHumanService = (human1, id1) -> InvokeUpdateHumanService();
        UpdateHumanController updateHumanController = new UpdateHumanController(updateHumanService);
        ResponseEntity responseEntity = updateHumanController.updateHuman(human, id);
        assertEquals(HttpStatus.ACCEPTED,responseEntity.getStatusCode());
        assertEquals(true,isUpdateHumanServiceInvoked);
    }

    private void InvokeUpdateHumanService() {
        isUpdateHumanServiceInvoked = true;
    }
}
