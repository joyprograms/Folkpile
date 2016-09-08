package com.theironyard.charlotte;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ben on 9/8/16.
 */
@Controller
public class FolkPileController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    String home() {
        return "Hello, World!";
    }
}