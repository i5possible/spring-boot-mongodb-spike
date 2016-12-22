package spike.mongodb.web;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import spike.mongodb.model.Human;
import spike.mongodb.repository.TestHumanRepository;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class HumanControllerTest {

    @Test
    public void shouldReturnHumanInfo() throws Exception {
        //given
        HumanController controller = new HumanController(new TestHumanRepository());
        //when
        ResponseEntity<Human> humanResponseEntity = controller.get("xxxx");
        //then
        assertThat(humanResponseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(humanResponseEntity.getBody().getName()).isEqualTo("lianghong");
    }
}