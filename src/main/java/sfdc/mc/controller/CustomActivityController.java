package sfdc.mc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ca")
public class CustomActivityController {

    public static Logger logger = LoggerFactory.getLogger(CustomActivityController.class);

    @RequestMapping(value = "")
    public String index(@RequestParam(value="numSteps", defaultValue="1") Integer numSteps, Model model) {

        if (logger.isDebugEnabled())
            logger.debug("Number of steps: " + numSteps);
        logger.info("Number of steps: " + numSteps);
        model.addAttribute("numSteps", numSteps);
        return "ca";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST, headers = "Accept=application/json")
    public ResponseEntity post(@RequestBody String json) {
        if (logger.isDebugEnabled())
            logger.debug("json: " + json);
        logger.info("post:");
        return new ResponseEntity("OK", HttpStatus.OK);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, headers = "Accept=application/json")
    public String save() {
        if (logger.isDebugEnabled())
            logger.debug("save:");
        return "ca";
    }

    @RequestMapping(value = "/publish", method = RequestMethod.POST, headers = "Accept=application/json")
    public String publish() {
        if (logger.isDebugEnabled())
            logger.debug("publish:");
        logger.info("publish:");
        return "ca";
    }

    @RequestMapping(value = "/validate", method = RequestMethod.POST, headers = "Accept=application/json")
    public String validate() {
        if (logger.isDebugEnabled())
            logger.debug("validate:");
        return "ca";
    }

    @RequestMapping(value = "/stop", method = RequestMethod.POST, headers = "Accept=application/json")
    public String stop() {
        if (logger.isDebugEnabled())
            logger.debug("stop:");
        return "ca";
    }

}
