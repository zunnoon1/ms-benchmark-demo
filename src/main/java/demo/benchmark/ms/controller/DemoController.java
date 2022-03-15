package demo.benchmark.ms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class DemoController {


    @GetMapping("test/{username}")
    public ResponseEntity<String> loadTest(@PathParam("username") String username) {

        try {
            System.out.println("Request arrived");
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(username,HttpStatus.OK);
    }

}
