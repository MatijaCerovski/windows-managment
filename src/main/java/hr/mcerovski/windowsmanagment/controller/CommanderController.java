package hr.mcerovski.windowsmanagment.controller;

import hr.mcerovski.windowsmanagment.model.CommanderRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CommanderController {

    @PostMapping(value = "/commander")
    public ResponseEntity<?> commander(@RequestBody final CommanderRequest commanderRequest){
        Runtime runtime = Runtime.getRuntime();
        try {
            final Process proc = runtime.exec(commanderRequest.getCommand());
        } catch (final IOException e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
