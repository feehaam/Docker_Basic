package docker.basic.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {
    @GetMapping("/")
    public String hello(){
        return "Yo!!!!!!";
    }
}
