package spike.mongodb.web;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spike.mongodb.model.Human;
import spike.mongodb.services.CreateHumanService;

@RestController
public class CreateHumanController {
    CreateHumanService createHumanService;

    public CreateHumanController(CreateHumanService createHumanService) {
        this.createHumanService = createHumanService;
    }

    public ResponseEntity createHuman(@RequestBody Human human) {
        createHumanService.createHuman(human);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
