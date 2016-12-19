package spike.mongodb;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import spike.mongodb.dao.HumanRepository;
import spike.mongodb.model.HumanModel;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HumanResourceDBTest {
    @Autowired
    HumanRepository humanRepository;

    @Before
    public void setUp() throws Exception {
        humanRepository.save(new HumanModel("User1"));
    }

    @Test
    public void shouldSetIdWhenSave () {
        //given
        HumanModel humanModel = new HumanModel();
        //when
        humanModel.setName("User2");
        humanRepository.save(humanModel);
        //then
        assertThat(humanModel.getId()).isNotNull();
    }
    
    @Test
    public void findByName () {
        //given
        //when
        HumanModel humanModel = humanRepository.findByName("User1");
        //then
        assertThat(humanModel.getName()).isEqualTo("User1");
    }
}
