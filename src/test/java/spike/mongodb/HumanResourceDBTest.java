package spike.mongodb;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spike.mongodb.repository.HumanRepository;
import spike.mongodb.model.Human;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HumanResourceDBTest {
    @Autowired
    HumanRepository humanRepository;

    @Before
    public void setUp() throws Exception {
        humanRepository.save(new Human("User1"));
    }

    @Test
    public void shouldSetIdWhenSave () {
        //given
        Human human = new Human();
        //when
        human.setName("User2");
        humanRepository.save(human);
        //then
        assertThat(human.getId()).isNotNull();
    }
    
    @Test
    public void shouldReturnHumanInfoGivenName () {
        //given
        //when
        Human human = humanRepository.findByName("User1");
        //then
        assertThat(human.getName()).isEqualTo("User1");
    }
}
