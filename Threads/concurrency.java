 import java.util.concurrent.*;
 class concurrency
 {
	 public static void main(String args[])
	 {
		 ExecutorService oES=Executors.newSingleThreadExecutor();
		 Future<String> oFuture=oES.submit(()->
		 {
			 Thread.sleep(10000);
			 return "completed !";
		 });
		 try
		 {
			 while(! oFuture.isDone())
			 {
				 System.out.println("Task Progress...");
				 Thread.sleep(200);
			 }
			 System.out.println("Task Completed.");
			 String oResult=oFuture.get(300,TimeUnit.MILLISECONDS);
			  System.out.println(oResult);
			  oES.shutdown();
		 }catch(Exception e){}
	 }
 }