package za.co.mnjonjo.web;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import za.co.mnjonjo.common.service.TestService;

/**
 * @author Noxolo.Mkhungo
 */
@Controller
@RequiredArgsConstructor
public class HomePageController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomePageController.class.getName());

    private final @NonNull TestService testService;
    @GetMapping
    public ModelAndView index (){
        return new ModelAndView("index");
    }
    //use the web service to access data via AJAX calls ("/web-service/api/v1/tests/")

}
