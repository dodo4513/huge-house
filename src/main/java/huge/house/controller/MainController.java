package huge.house.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author doyoung hwang on 2019-07-08
 */

@RestController
public class MainController {

    @GetMapping
    public String main() {
        return "Hello world";
    }
}
