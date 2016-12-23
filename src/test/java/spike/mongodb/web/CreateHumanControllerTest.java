package spike.mongodb.web;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import spike.mongodb.model.Human;

import static org.junit.Assert.assertEquals;


public class CreateHumanControllerTest {

    boolean isCreateHumanServiceInvoked = false;

    @Test
    public void shouldInvokeServiceAndReturnAcceptedWhenCreateHuman() {
        CreateHumanController createHumanController = new CreateHumanController(h -> invokeCreateHumanService());
        ResponseEntity responseEntity = createHumanController.createHuman(new Human("LiangHong"));
        assertEquals(isCreateHumanServiceInvoked, true);
        assertEquals(HttpStatus.ACCEPTED, responseEntity.getStatusCode());
    }

    private void invokeCreateHumanService() {
        isCreateHumanServiceInvoked = true;
    }
}
