package spike.mongodb.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    @RequestMapping(method = RequestMethod.GET, value = "/helloworld")
    public ResponseEntity helloWorld() {
        return new ResponseEntity("HelloWorld", HttpStatus.OK);
    }
}
