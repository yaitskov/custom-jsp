package net.sf.dan.velocity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * daneel yaitskov
 */
@Controller
public class Ctrl {

    @RequestMapping("/hello")
    public String method() {
        return "hello";
    }
}
