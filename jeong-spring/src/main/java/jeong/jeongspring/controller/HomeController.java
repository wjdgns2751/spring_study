package jeong.jeongspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    /* index.html 을 호출하지 않는 이유는 요청한 주소에 매핑된 게 있어서이다. */
    @GetMapping("/")
    public String home(){
        return "home";
    }

}
