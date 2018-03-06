package ua.nure.riznyk.diploma.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ping")
public class PingRest {

    @GetMapping
    public String PingRest(@RequestParam String pingParam) {
        return pingParam + "ping";
    }

    @PostMapping
    public void postPing(@RequestBody String body) {
        body = body + "qweqwe";
    }

}
