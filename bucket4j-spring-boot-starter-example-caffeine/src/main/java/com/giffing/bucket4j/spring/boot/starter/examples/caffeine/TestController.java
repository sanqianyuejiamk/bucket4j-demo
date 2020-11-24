package com.giffing.bucket4j.spring.boot.starter.examples.caffeine;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class TestController {
	
	@GetMapping("hello")
	public ResponseEntity<String> hello() {
		log.info("-------, 调用hello接口");
		return ResponseEntity.ok("Hello World");
	}
	
	@GetMapping("world")
	public ResponseEntity<String> world() {
		return ResponseEntity.ok("Hello World");
	}
	
}
