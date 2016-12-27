package spike.mongodb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spike.mongodb.services.DeleteHumanService;

@RestController
public class DeleteHumanController {
    DeleteHumanService deleteHumanService;

    @Autowired
    public DeleteHumanController(DeleteHumanService deleteHumanService) {
        this.deleteHumanService = deleteHumanService;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/human/delete/{humanId}")
    public ResponseEntity deleteHuman(@PathVariable(name = "humanId") String humanId) {
        deleteHumanService.deleteHuman(humanId);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
