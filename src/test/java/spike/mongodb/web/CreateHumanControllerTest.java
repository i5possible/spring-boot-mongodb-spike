package spike.mongodb.web;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import spike.mongodb.model.Human;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CreateHumanControllerTest {

    //? Why this can't be injected.
    CreateHumanController createHumanController;

    @Autowired
    GetHumanController getHumanController;

    Human human;

    @Before
    public void setUp() throws Exception {
        human = new Human("Liang Hong", "123456");
        createHumanController = new CreateHumanController();
    }

    @Test
    public void shouldReturn202WhenHumanCreated() {
        //given
        System.out.println(human.getName());
        System.out.println(createHumanController);
        //when
        ResponseEntity responseEntity = createHumanController.save(human);
        //then
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.ACCEPTED);
    }

    @Test
    public void shouldReturnHumanInfoWhenGetHumanById() {
        //given
        String humanId = "";
        //when
        human = getHumanController.get(humanId);
        //then
        assertThat(human.getName()).isEqualTo("LiangHong");
    }
}
