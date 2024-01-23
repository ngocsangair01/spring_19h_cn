package com.example.buoi1;

import com.example.buoi1.model.Colors;
import com.example.buoi1.model.Result;
import com.github.slugify.Slugify;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class DemoController {
    private final Slugify slugify;

    public DemoController(Slugify slugify) {
        this.slugify = slugify;
    }

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

    @GetMapping("/btvnb1_1")
    public ResponseEntity<?> btvnb1_1(String name1,String name2,String type1,String type2){
        Colors color1 = new Colors(3L,"name3","Type1");
        Colors color2 = new Colors(2L,name2,type2);
        List<Colors> colors1 = new ArrayList<>();
        List<Colors> colors2 = new ArrayList<>();
        colors1.add(new Colors(3L,"name3","Type1"));
        colors2.add(new Colors(4L,"name4","Type2"));
        colors1.add(color1);
        colors2.add(color2);
        colors1.get(10);
        Set<Colors> colorsSet = new HashSet<>();
        Result result = new Result(1L,colors1,colors2);
        return ResponseEntity.ok(result);
    }


    @GetMapping("slug")
    public ResponseEntity<?> buoi2(){
        String s1 = "Đỗ Đức Đạt";
        String s2 = slugify.slugify(s1);
        return ResponseEntity.ok(s2);
    }
    @PostMapping
    public ResponseEntity<?> createColors(@RequestBody Colors colors){
        //validate thông tin hợp lệ
        // Nếu hợp lệ thì đưa vào database
        // Nếu không hợp lệ thì ném exception
        return ResponseEntity.ok(colors);
    }

}
