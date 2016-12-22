package spike.mongodb.web;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import spike.mongodb.model.Human;

public class CreateHumanController {
    public ResponseEntity save (@RequestBody Human human) {
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
