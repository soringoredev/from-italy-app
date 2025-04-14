package pixel.academy.setter_injection_app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pixel.academy.setter_injection_app.common.Chef;

@RestController
public class DemoController {

    private Chef myChef;
    // constructor injection
    @Autowired
    public DemoController(Chef theChef) {
        myChef = theChef;
    }


    // setter injection
//    @Autowired
//    public void setMyChef(Chef theChef) {
//        myChef = theChef;
//    }


    @GetMapping("/dailyrecipe")
    public String getDailyRecipe() {
        return myChef.getDailyRecipe();
    }

    @GetMapping("/dailyrecipe2")
    public String getDailyRecipe2() {
        return myChef.getDailyRecipe2();
    }

    @GetMapping("/dailyrecipe3")
    public String getDailyRecipe3() {
        return myChef.getDailyRecipe3();
    }

    @GetMapping("/dailyrecipe4")
    public String getDailyRecipe4() {
        return myChef.getDailyRecipe4();
    }


}
