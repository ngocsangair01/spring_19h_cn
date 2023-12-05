package com.example.buoi1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class DemoController {

    //200 : success
    //201 : created (ít dùng)
    //400 : bad request
    //401 : un authorize
    //403 : forbidden
    //500 : internal
    //path variable, request param
    @GetMapping()
    public ResponseEntity<?> demoHello(String name){
        UserDemo result = new UserDemo(name);
        List<UserDemo> userDemos = new ArrayList<>();
        userDemos.add(new UserDemo(1L,"1",1,"1"));
        userDemos.add(new UserDemo(2L,"2",2,"2"));
        userDemos.add(new UserDemo(3L,"3",3,"3"));
        userDemos.add(new UserDemo(4L,"4",4,"4"));
        userDemos.add(new UserDemo(5L,"5",5,"5"));
        for (UserDemo u :
                userDemos) {
            if (u.getName().equals(name)){
                result = u;
            }
        }
        return ResponseEntity.status(200).body(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> demoHello2(@PathVariable("id")Long idUser){
        UserDemo result = new UserDemo();
        List<UserDemo> userDemos = new ArrayList<>();
        userDemos.add(new UserDemo(1L,"1",1,"1"));
        userDemos.add(new UserDemo(2L,"2",2,"2"));
        userDemos.add(new UserDemo(3L,"3",3,"3"));
        userDemos.add(new UserDemo(4L,"4",4,"4"));
        userDemos.add(new UserDemo(5L,"5",5,"5"));
        for (UserDemo u :
                userDemos) {
            if (Objects.equals(u.getId(), idUser)){
                result = u;
            }
        }
        return ResponseEntity.status(200).body(result);
    }
}
