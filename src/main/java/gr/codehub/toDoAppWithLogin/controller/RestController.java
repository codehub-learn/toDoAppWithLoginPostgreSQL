package gr.codehub.toDoAppWithLogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.concurrent.ThreadLocalRandom;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private static int APP_ID = ThreadLocalRandom.current().nextInt();

    @GetMapping("/id")
    public int getID() {
        return APP_ID;
    }
}
