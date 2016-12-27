package spike.mongodb.functional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spike.mongodb.services.GetHumanServiceImpl;

@SpringBootTest
public class createHuman {

    @Autowired
    GetHumanServiceImpl getHumanService;

    @Test
    public void shouldReturnHumanWithId () {

    }
}
