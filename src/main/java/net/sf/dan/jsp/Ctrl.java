package net.sf.dan.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * daneel yaitskov
 */
@Controller
public class Ctrl {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/")
    public String def() {
        return "def";
    }

}
