package spike.mongodb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import spike.mongodb.services.GetHumanService;

@RestController
public class GetHumanController {
    private final GetHumanService getHumanService;

    // TODO: 23/12/2016 I'd like to get an error without the Autowired
    @Autowired
    public GetHumanController(GetHumanService getHumanService) {
        this.getHumanService = getHumanService;
    }

    public ResponseEntity get(String id) {
        return getHumanService.getHuman(id).map(ResponseEntity::ok).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
