package lk.sack.livescore.service.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAPI {

    @GetMapping("/")
    public String sayHello(){
        return "Hello ACF!";
    }
}
