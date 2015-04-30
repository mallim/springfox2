package mallim;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "swagger-ui.html";
    }
}
