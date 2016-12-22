package spike.mongodb.web;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import spike.mongodb.model.Human;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CreateHumanControllerTest {
    @Test
    public void shouldReturn202WhenHumanCreated () {
        //given
        //when
        Human human = new Human();
        CreateHumanController createHumanController = new CreateHumanController();
        ResponseEntity responseEntity = createHumanController.save(human);
        //then
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.ACCEPTED);
    }
}
