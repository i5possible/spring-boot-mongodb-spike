package spike.mongodb;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import spike.mongodb.web.HelloWorldController;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class HelloWorldControllerTest {

    @Test
    public void shouldReturnHelloWorldWithOK () {
        //given
        //when
        ResponseEntity responseEntity = new HelloWorldController().helloWorld();
        //then
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody().toString()).isEqualTo("HelloWorld");
    }
}