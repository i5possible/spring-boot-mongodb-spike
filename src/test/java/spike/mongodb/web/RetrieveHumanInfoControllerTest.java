package spike.mongodb.web;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import spike.mongodb.model.Human;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RetrieveHumanInfoControllerTest {

    @Test
    public void shouldReturnHumanIsMatched() {
        Human human = new Human();
        RetrieveHumanController retrieveHumanController = new RetrieveHumanController(id -> Optional.of(human));
        ResponseEntity responseEntity = retrieveHumanController.get("someone");
        assertThat(responseEntity.getStatusCode(), is(HttpStatus.OK));
        assertThat(responseEntity.getBody(), is(human));
    }

    @Test
    public void shouldReturnNotFoundIfNoneMatch() throws Exception {
        RetrieveHumanController retrieveHumanController = new RetrieveHumanController(id -> Optional.empty());
        ResponseEntity responseEntity = retrieveHumanController.get("someone");
        assertThat(responseEntity.getStatusCode(), is(HttpStatus.NOT_FOUND));
    }
}
