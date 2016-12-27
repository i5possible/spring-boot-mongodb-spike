package spike.mongodb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spike.mongodb.model.Human;
import spike.mongodb.services.UpdateHumanService;

@RestController
public class UpdateHumanController {
    UpdateHumanService updateHumanService;

    @Autowired
    public UpdateHumanController(UpdateHumanService updateHumanService) {
        this.updateHumanService = updateHumanService;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/human/{humanId}")
    public ResponseEntity updateHuman(@RequestBody Human human, @PathVariable(name = "humanId") String toUpdateHumanID) {
        updateHumanService.updateHuman(human, toUpdateHumanID);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
