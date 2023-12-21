package Ada.CI.CD.CICD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/Despliegue")
@RestController
public class UserController {
    @GetMapping(path = "/name")
    public String name (String nombre){
        return nombre="JHON STEVEN BARACALDO";
    }
}
