package com.vn.fs.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype")
public class PrototypeBean {

	@PostConstruct
	public void init() {
		System.out.println("PrototypeBean initialized");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("PrototypeBean destroyed");
	}
}
