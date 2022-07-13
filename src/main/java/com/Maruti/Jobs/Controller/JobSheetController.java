package com.Maruti.Jobs.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Maruti.Jobs.Model.JobsheetDTO;



@Controller
@RequestMapping("/users")
public class JobSheetController {

	
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	  public String getUsers(Model model, JobsheetDTO logDetails) {
	    model.addAttribute("users", logDetails);
	 //   model.addAttribute("userInfo", new JobsheetDTO());
	    return "index";
	  }
	 
	 @RequestMapping(value = "/", method = RequestMethod.POST)
	  public String createUser(Model model, @ModelAttribute JobsheetDTO logDetails) {
		 ModelAndView modelAndView = new ModelAndView();
			
			modelAndView.setViewName("user-data");
			modelAndView.addObject("user", logDetails);
			System.out.println("Completed");
			 return "user-data.html";
	  }
	
}
