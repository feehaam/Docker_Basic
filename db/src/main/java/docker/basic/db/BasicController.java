package docker.basic.db;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/")
    public String home(){
        return "Home...";
    }

    @GetMapping("/db")
    public ResponseEntity<String> db(){
        return ResponseEntity.ok("From db");
    }
}
