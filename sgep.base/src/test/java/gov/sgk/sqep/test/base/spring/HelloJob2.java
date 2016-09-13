package gov.sgk.sqep.test.base.spring;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import gov.sgk.sgep.base.schedule.AJob;

public class HelloJob2 extends AJob {      
    public HelloJob2() {      
    }      
    
    @Override
    public void run(JobExecutionContext context)      
      throws JobExecutionException      
    {      
      System.err.println("Hello!  HelloJob2 is executing.");      
    }      
  }