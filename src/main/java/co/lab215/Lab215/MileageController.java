package co.lab215.Lab215;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MileageController {
	@RequestMapping("/")
	public ModelAndView showHome() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/mileage-form")
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView("mileage-form");
		return mav;
	}
	
	@RequestMapping("/result")
	public ModelAndView showResult(
			@RequestParam("mpg") int mpg,
			@RequestParam("gallons") int gallons) {
		int remaining = gallons * mpg;
		ModelAndView mav = new ModelAndView("mileage-result");
		mav.addObject("mpg", mpg);
		mav.addObject("gallons", gallons);
		mav.addObject("remaining", remaining);
		return mav;
	}
}
