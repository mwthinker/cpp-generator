package se.mwthinker.cppgenerator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.mwthinker.cppgenerator.service.PackagesApiDelegateImpl;
import se.mwthinker.openapi.api.PackagesApi;
import se.mwthinker.openapi.api.PackagesApiController;
import se.mwthinker.openapi.api.PackagesApiDelegate;

/*
@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @GetMapping("/hello")
    public String hello() {
        return "Full Stack Java with Spring Boot & VueJS!";
    }

}
*/
/*
@Controller
public class MessageController extends PackagesApiController {

    public MessageController(PackagesApiDelegateImpl delegate) {
        super(delegate);
    }
}
 */
