package spike.mongodb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spike.mongodb.services.GetHumanService;

@RestController
public class GetHumanController {
    private final GetHumanService getHumanService;

    @Autowired
    public GetHumanController(GetHumanService getHumanService) {
        this.getHumanService = getHumanService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/human/get/{humanId}")
    public ResponseEntity get(@PathVariable(value = "humanId") String humanId) {
        return getHumanService.getHuman(humanId).map(ResponseEntity::ok).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
