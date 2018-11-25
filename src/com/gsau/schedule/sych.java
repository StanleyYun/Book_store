package com.gsau.schedule;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

@Component
public class sych implements SchedulingConfigurer{
//	public ScheduledThreadPoolExecutor se = new ScheduledThreadPoolExecutor(10);
//
//	public void fixedPeriodSchedule() {
//		// 设定可以循环执行的runnable,这里设置的任务的间隔为1秒
//
//		se.scheduleAtFixedRate(new FixedSchedule(), 5, 15, TimeUnit.SECONDS);
//		se.scheduleAtFixedRate(new FixedSchedule2(), 5, 15, TimeUnit.SECONDS);
//	}
//
//	public sych(){
//		fixedPeriodSchedule();
//	}
//
//	class FixedSchedule implements Runnable {
//		public void run() {
//			System.out.println("2222222"+ new Date());
//		}
//
//	}
//	class FixedSchedule2 implements Runnable {
//		public void run() {
//			System.out.println("333333" + new Date());
//		}
//	}
	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		// TODO Auto-generated method stub
		List<String> crons = new ArrayList<>();
		crons.add("10 50 22 * * ?");
		crons.add("15 50 22 * * ?");
		crons.add("16 50 22 * * ?");
		crons.add("17 50 22 * * ?");
		crons.add("18 50 22 * * ?");
		int a[] =new int[]{1,2,3,4,5};
		int i =0 ;
		Runnable task = null;
		for(String cron : crons) {
			if (a[i] == 1) {
				 task = new t1();
			} else if (a[i] == 2){
				 task = new t2();
			} else if (a[i] == 3){
				task = new t3();
			}else if (a[i] == 4){
				task = new t4();
			}else if (a[i] == 5){
				task = new t5();
			}
			i++;
			Trigger trigger = new Trigger() {

				@Override

				public Date nextExecutionTime(TriggerContext triggerContext) {

					//任务触发，可修改任务的执行周期.

					CronTrigger trigger = new CronTrigger(cron);

					Date nextExec = trigger.nextExecutionTime(triggerContext);

					return nextExec;

				}

			};

			taskRegistrar.addTriggerTask(task, trigger);

		}
	}
	
		
	
   public class t1 implements Runnable{
	   @Override
		public void run() {

			//任务逻辑代码部分.

			System.out.println("1 is running ... "+ new Date());

		}
	   
   }
  
   public class t2 implements Runnable{
	   @Override
		public void run() {

			//任务逻辑代码部分.

			System.out.println("2 is running ... "+ new Date());

		}
	   
   }
   public class t3 implements Runnable{
	   @Override
		public void run() {

			//任务逻辑代码部分.

			System.out.println("3 is running ... "+ new Date());

		}
	   
   }
   public class t4 implements Runnable{
	   @Override
		public void run() {

			//任务逻辑代码部分.

			System.out.println("4 is running ... "+ new Date());

		}
	   
   }
   public class t5 implements Runnable{
	   @Override
		public void run() {

			//任务逻辑代码部分.

			System.out.println("5 is running ... "+ new Date());

		}
	   
   }

}
