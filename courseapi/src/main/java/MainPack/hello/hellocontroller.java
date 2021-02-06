package MainPack.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

	
	@RequestMapping("/hello")	
    public String sayhi()
    {
    	return "HI";
     }
 }
