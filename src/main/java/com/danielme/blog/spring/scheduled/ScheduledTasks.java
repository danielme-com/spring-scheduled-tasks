package com.danielme.blog.spring.scheduled;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTasks {

	private static final Logger LOG = Logger.getLogger(ScheduledTasks.class);
	
	/*@Scheduled(initialDelay=30000, fixedDelay = 1500)
	public void task1()
	{
		LOG.info("task1");
	}*/
	
	//@Scheduled(cron="*/10 * * * * ?")
	/*public void task2()
	{
		LOG.info("task2");
	}*/
	
	@Scheduled(initialDelayString="${task1.initialDelay}", fixedDelayString = "${task1.fixedDelay}")
	public void task1()
	{
		LOG.info("task1");
	}
	
	@Scheduled(cron="${task2.cron}")
	public void task2()
	{
		LOG.info("task2");
	}
	
}
