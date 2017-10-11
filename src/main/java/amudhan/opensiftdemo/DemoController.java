package amudhan.opensiftdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/test")
	public String demoControllerTest(){
		return "The demo app is working!!!!!!!!";
	}
}
