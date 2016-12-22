package spike.mongodb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spike.mongodb.model.Human;
import spike.mongodb.repository.HumanRepository;

@RestController
public class HumanController {

    private final HumanRepository humanRepository;

    @Autowired
    public HumanController(final HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/human")
    public ResponseEntity<Human> insert(@RequestBody Human human) {
        humanRepository.save(human);
        return new ResponseEntity<>(human, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/human")
    public ResponseEntity<Human> get(@RequestParam String id) {
        Human human = humanRepository.findOne(id);
        return new ResponseEntity<>(human, HttpStatus.OK);
    }
}
