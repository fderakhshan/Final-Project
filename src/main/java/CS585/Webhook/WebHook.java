package CS585.Webhook;


import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class WebHook {

	public static void main(String[] args) throws IOException, InterruptedException {

		//start ngrok server to expose http://localhost:8080 to Internet
		NgrokServer.run();



		SpringApplication.run(WebHook.class, args);
	}


}