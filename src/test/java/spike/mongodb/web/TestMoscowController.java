package spike.mongodb.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMoscowController {
    @RequestMapping(path = "/foo", method = RequestMethod.GET)
    public String returnFoo() {
        return "foo";
    }
}
