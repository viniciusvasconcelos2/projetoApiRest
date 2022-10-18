package dio.SpringWebProjetoApiRest.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Olá este é meu primeiro projeto usando Spring Boot REST API";
    }
}