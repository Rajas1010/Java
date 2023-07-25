
import java.lang.*;
public class generic<T,U>
   {
		T obj;
		U obj1;
		generic(T obj,U obj1)
		{
			this.obj=obj;
			this.obj1=obj1;
		}
		public void display()
		{
			System.out.println(obj);
			System.out.println(obj1);
		}
		public static void main(String args[])
		{
			generic<Integer,String>io=new generic<Integer,String>(10,"rajas");
			io.display();
		}
		
   }