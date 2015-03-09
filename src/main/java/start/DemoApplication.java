package start;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

	@RequestMapping("/sayhello")
	public Map<String, Object> proxyTicket() throws Exception {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("message", "Hello, my friend!");

		return model;
	}
}
