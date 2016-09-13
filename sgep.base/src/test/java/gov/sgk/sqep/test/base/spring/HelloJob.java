package gov.sgk.sqep.test.base.spring;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import gov.sgk.sgep.base.schedule.AJob;

public class HelloJob extends AJob {      
    public HelloJob() {      
    }      
    
    @Override
    public void run(JobExecutionContext context)      
      throws JobExecutionException      
    {      
      System.err.println("Hello!  HelloJob is executing.");      
    }      
  }