package ua.nure.riznyk.diploma.run.rest;

import org.springframework.web.bind.annotation.*;

@RestController
public class PingRest {


    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String PingRest() {
        return "ping";
    }

    @RequestMapping(method = RequestMethod.POST)
    public void postPing(@RequestBody String body) {
        body = body + "qweqwe";
    }

}
