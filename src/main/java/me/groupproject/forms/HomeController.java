package me.groupproject.forms;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/loadform")


    public String loadFormPage(){
        return "formtemplate";
    }
    @RequestMapping("/processform")
    public String loadFormPage(@RequestParam("formattedDate") String formattedDate,Model model){


            Birthday userBirthday = new Birthday(formattedDate);

            userBirthday.getFormattedbirthday();


        model.addAttribute("formattedDate",userBirthday.getFormattedbirthday());
        model.addAttribute("male",userBirthday.getMale());
        model.addAttribute("female",userBirthday.getFemale());
        return "confirm";
    }
}
