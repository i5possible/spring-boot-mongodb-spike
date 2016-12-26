package spike.mongodb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import spike.mongodb.services.DeleteHumanService;

@RestController
public class DeleteHumanController {
    DeleteHumanService deleteHumanService;

    @Autowired
    public DeleteHumanController(DeleteHumanService deleteHumanService) {
        this.deleteHumanService = deleteHumanService;
    }

    public ResponseEntity deleteHuman(String id) {
        deleteHumanService.deleteHuman(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
