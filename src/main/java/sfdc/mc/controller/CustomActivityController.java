package sfdc.mc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static java.lang.System.*;

@Controller
@RequestMapping("/ca")
public class CustomActivityController {

    @RequestMapping(value = "")
    public String index(@RequestParam(value="numSteps", defaultValue="1") Integer numSteps, Model model) {
        out.println("*******************************");
        out.println("************** " + numSteps + " *****************");
        model.addAttribute("numSteps", numSteps);
        return "ca";
    }

    @RequestMapping(value = "/save")
    public String save() {
        out.println("*******************************");
        return "ca";
    }

    @RequestMapping(value = "/publish")
    public String publish() {
        out.println("**************save*****************");
        return "ca";
    }

    @RequestMapping(value = "/validate")
    public String validate() {
        out.println("***************validate****************");
        return "ca";
    }

    @RequestMapping(value = "/stop")
    public String stop() {
        out.println("****************stop***************");
        return "ca";
    }

}