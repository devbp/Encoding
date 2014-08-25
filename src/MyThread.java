import java.lang.*;
 public class MyThread extends Thread {

	public void run()
	{
		System.out.println("this ismy thread");
	}
	
}


class MathSin extends Thread
{
	 public double deg;
	 public double res;
	 
	 public MathSin(int degree) {
	 deg = degree;
	 }
	 public void run() {
	 System.out.println("Executing sin of "+deg);
	 double Deg2Rad = Math.toRadians(deg);
	 res = Math.sin(Deg2Rad);
	 System.out.println("Exit from MathSin. Res = "+res);
	 }

}


class MathTan extends Thread
{
	public double deg;
	public double res;
	
	public MathTan(int degree)
	{
		deg=degree;
	}
	
	 public void run() {
		 System.out.println("Executing tan of"+deg);
		 double Deg2Rad = Math.toRadians(deg);
		 res = Math.tan(Deg2Rad);
		 System.out.println("Exit from MathTan. Res = "+res);
		 }
	
	
}