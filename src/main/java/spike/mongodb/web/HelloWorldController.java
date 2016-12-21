package spike.mongodb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spike.mongodb.model.Human;
import spike.mongodb.repository.HumanRepository;

@RestController
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET, value = "/helloworld")
    public ResponseEntity helloWorld() {
        return new ResponseEntity("HelloWorld", HttpStatus.OK);
    }

    @Autowired
    HumanRepository humanRepository;

    @Autowired
    Human human;

    @RequestMapping(method = RequestMethod.POST, value = "/human")
    public ResponseEntity<Human> insert(@RequestBody Human human) {
        humanRepository.save(human);
        return new ResponseEntity<Human>(human, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/human")
    public ResponseEntity<Human> get(@RequestParam String id) {
        human = humanRepository.findOne(id);
        return new ResponseEntity<Human>(human, HttpStatus.OK);
    }
}
