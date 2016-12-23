package spike.mongodb.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spike.mongodb.model.Human;

@RestController
public class CreateHumanController {
    @Autowired
    CreateHumanController () {

    }

    public ResponseEntity save (@RequestBody Human human) {
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
