package springboot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/")
    public String showPortfolio(Model model) {
        List<course> myCourses = Arrays.asList(
            new course("CS201", "Data Structures", 3, "A"),
            new course("CS202", "Advance Programming", 3, "A"),
            new course("CS203", "Database Management Systems", 3, "A-")
        );

        List<String> myHobbies = Arrays.asList(
            "Mempelajari Generative AI", 
            "Bermain Catur (Tactical Opening)"
        );

        StudentProfile profile = new StudentProfile(
            "Steve Alberto", 
            "SA", 
            "2086022510015", 
            "Informatika", 
            "Universitas Ciputra Makassar", 
            2, 
            4, 
            "salberto@student.ciputra.ac.id",
            myHobbies, 
            myCourses
        );
        
        model.addAttribute("profilSaya", profile);
        return "tampilan"; 
    }
}