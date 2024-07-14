package docker.basic.db;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController @RequiredArgsConstructor
public class BasicController {

    private final FlowerRepo flowerRepo;
    Random random = new Random();

    @GetMapping("/")
    public ResponseEntity<List<Flower>> home(){
        // create a flower
        var saved = flowerRepo.save(
                new Flower(
                        random.nextInt(10000),
                        "Rose",
                        "Red"
                )
        );

        var all = flowerRepo.findAll();
        return ResponseEntity.ok(all);
    }
}
