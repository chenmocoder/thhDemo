package com.springboot.thhDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.net.URISyntaxException;

@SpringBootApplication
//spring data jpa 在程序启东时使用注解家在 repositories
@EnableJpaRepositories("com.springboot.thhDemo.Repository")
public class ThhDemoApplication {

	public static void main(String[] args) throws URISyntaxException {
		SpringApplication.run(ThhDemoApplication.class, args);

//		Socket socket = IO.socket("http://47.100.39.70");
//		socket.on("alarm", new Emitter.Listener() {
//			@Override
//			public void call(Object... args) {
//				JSONObject obj = (JSONObject) args[0];
//				System.out.println( obj.get("type") +"=>" + obj.get("nodeid") );
//			}
//		});
//		socket.connect();
	}
}
