package spike.mongodb.web;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import spike.mongodb.model.Human;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CreateHumanControllerTest {

    boolean isCreateHumanServiceInvoked = false;

    @Test
    public void shouldInvokeServiceAndReturnAcceptedWhenCreateHuman() {
        CreateHumanController createHumanController = new CreateHumanController(
                h -> {
                    isCreateHumanServiceInvoked = true;
                    return null;
                });
        ResponseEntity responseEntity = createHumanController.createHuman(new Human("LiangHong"));
        assertTrue(isCreateHumanServiceInvoked);
        assertEquals(HttpStatus.ACCEPTED, responseEntity.getStatusCode());
    }

}
