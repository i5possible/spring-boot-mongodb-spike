package spike.mongodb.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spike.mongodb.model.Human;
import spike.mongodb.services.CreateHumanService;

@RestController
public class CreateHumanController {
    CreateHumanService createHumanService;

    @Autowired
    public CreateHumanController(CreateHumanService createHumanService) {
        this.createHumanService = createHumanService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/human")
    public ResponseEntity createHuman(@RequestBody Human human) {
        createHumanService.createHuman(human);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
