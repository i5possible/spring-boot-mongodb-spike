package spike.mongodb.web;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

public class DeleteHumanControllerTest {
    private boolean isDeleteHumanServiceInvokded = false;

    @Test
    public void shouldInvokeDeleteHumanServiceAndReturnAccepted() {
        String id = "id";
        DeleteHumanController deleteHumanController = new DeleteHumanController(
                id1 -> isDeleteHumanServiceInvokded = true);
        ResponseEntity responseEntity = deleteHumanController.deleteHuman(id);
        assertEquals(HttpStatus.ACCEPTED, responseEntity.getStatusCode());
        assertEquals(true, isDeleteHumanServiceInvokded);
    }

}
