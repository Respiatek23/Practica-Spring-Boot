package edu.comillas.icai.pat.ejemplopat.controler;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Controller

public class Controler {
    @GetMapping("/error")
    public String redirect(){
        return "redirect:/HtmlPage5.html";

    }
}
