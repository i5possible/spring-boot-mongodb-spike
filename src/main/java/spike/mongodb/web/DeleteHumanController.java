package spike.mongodb.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import spike.mongodb.services.DeleteHumanService;

public class DeleteHumanController {
    DeleteHumanService deleteHumanService;

    public DeleteHumanController(DeleteHumanService deleteHumanService) {
        this.deleteHumanService = deleteHumanService;
    }

    public ResponseEntity deleteHuman(String id) {
        deleteHumanService.deleteHuman(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
