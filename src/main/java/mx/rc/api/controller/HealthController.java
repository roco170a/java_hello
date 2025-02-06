package mx.rc.api.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.rc.api.entities.User;

@RestController
public class HealthController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/health")
	public String greeting(@RequestParam(value = "name", defaultValue = "Mundo") String name) {
		return "Holis " + name;
	}
}
