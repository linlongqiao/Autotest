package hello;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SimpleController {
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello Word!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SimpleController.class,args);
    }
}
