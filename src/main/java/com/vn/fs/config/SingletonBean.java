package com.vn.fs.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("singleton")
public class SingletonBean {

	@PostConstruct
	public void init() {
		System.out.println("SingletonBean initialized");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("SingletonBean destroyed");
	}
}
