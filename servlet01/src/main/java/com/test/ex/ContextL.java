package com.test.ex;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextL implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("���ø����̼��� ����!!");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("���ø����̼��� ����!!");
	}

}
