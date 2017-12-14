package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(MatrixMessage message) throws Exception {
        return new Greeting("Hello, " + message.getFormula() + " " + message.getBetta() + " " + message.getGamma() + " " + message.getOrder() + "!");
    }

}
