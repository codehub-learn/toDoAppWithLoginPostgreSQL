package gr.codehub.toDoAppWithLogin.controller;

import gr.codehub.toDoAppWithLogin.exception.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomErrorController {

    @GetMapping("/301")
    public void movedPermanently() {
        throw new MovedPermanentlyException();
    }

    @GetMapping("/401")
    public void unauthorized() {
        throw new UnauthorizedException();
    }

    @GetMapping("/405")
    public void methodNotAllowed() {
        throw new MethodNotAllowedException();
    }

    @GetMapping("/500")
    public void internalServerError() {
        throw new InternalServerErrorException();
    }

    @GetMapping("/502")
    public void badGateway() {
        throw new BadGatewayException();
    }
}
