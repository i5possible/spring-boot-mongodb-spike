package spike.mongodb.web;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import spike.mongodb.model.Human;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class GetHumanInfoControllerTest {

    @Test
    public void shouldReturnHumanInfoGivenHumanId () {
        //given
        GetHumanController getHumanController = new GetHumanController();
        String humanId = "585a2d5d5f9ab8484339cdd4";
        //when
        ResponseEntity responseEntity = getHumanController.get(humanId);
        //then
        Human human = (Human) responseEntity.getBody();
        HttpStatus httpStatus = responseEntity.getStatusCode();
        assertThat(human.getName()).isEqualTo("LiangHong");
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
