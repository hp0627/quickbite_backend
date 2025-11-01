package quick.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import quick.model.*;

// --- REST API Controller for Users ---
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UsersController {

    @Autowired 
    UsersManager UM;

    @PostMapping("/signup")
    public String signUp(@RequestBody Users U) {
        return UM.addUser(U);
    }

    @GetMapping("/forgotpassword/{email}")
    public String forgotPassword(@PathVariable("email") String emailid) {
        return UM.recoverPassword(emailid);
    }

    @PostMapping("/signin")
    public String signIn(@RequestBody Users U) {
        return UM.validateCredentials(U.getEmail(), U.getPassword());
    }
}


// --- Controller for serving the React frontend ---
@Controller
class FrontendController {

    // Forward all /quickbite routes to React index.html
    @RequestMapping({"/quickbite", "/quickbite/**"})
    public String forwardReactRoutes() {
        return "forward:/index.html";
    }
}
