package ch4;

public class p14 {
	public static void main(String[] args)
	{
		Car4 car1;
		car1 = new RacingCar4();
		
		car1.setCar(1234, 20.5);
		
		car1.show();
	}
}
class Car4
{
	protected int num;
	protected double gas;
	
	public Car4()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" +num + ", 汽油量設為" +gas);
	}
	
	public void show()
	{
		System.out.println("車號是" +num);
		System.out.println("汽油量是" +gas);
	}
}
class RacingCar4 extends Car4
{
	private int course;
	
	
	public RacingCar4()
	{
	
		course = 0;
		System.out.println("生產了賽車");
	}
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設為" + course);
	}
	public void show()
	{
		System.out.println("賽車的車號是" +num);
		System.out.println("汽油量是" +gas);
		System.out.println("賽車編號是" +course);
	}
	
}