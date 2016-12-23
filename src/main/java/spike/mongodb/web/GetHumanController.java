package spike.mongodb.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import spike.mongodb.model.Human;

@RestController
public class GetHumanController {
    public ResponseEntity<Human> get(String id) {
        Human human = new Human();
        human.setName("LiangHong");
        return new ResponseEntity<Human>(human,HttpStatus.OK);
    }
}
