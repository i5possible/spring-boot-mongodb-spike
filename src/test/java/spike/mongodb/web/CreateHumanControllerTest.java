package spike.mongodb.web;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import spike.mongodb.model.Human;

import static org.junit.Assert.assertEquals;


public class CreateHumanControllerTest {

    @Test
    public void shouldReturnNotFoundWhenHumanIsEmpty() {
        //given
        CreateHumanController createHumanController = new CreateHumanController(human -> {
        });
        //when
        ResponseEntity responseEntity = createHumanController.createHuman(new Human(""));
        //then
        assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
    }

    @Test
    public void shouldReturnAcceptedWhenHumanIsGiven() {
        //given
        CreateHumanController createHumanController = new CreateHumanController(human -> {
        });
        //when
        ResponseEntity responseEntity = createHumanController.createHuman(new Human("LiangHong"));
        //then
        assertEquals(HttpStatus.ACCEPTED,responseEntity.getStatusCode());
    }
}
