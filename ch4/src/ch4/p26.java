package ch4;

public class p26 {
	public static void main(String[] args) 
	{
		Car8[] cars;
		cars = new Car8[2];
		
		cars[0] = new Car8();
		cars[1] = new RacingCar8();

		for(int i=0;i<cars.length;i++)
		{
			Class cl = cars[i].getClass();
			System.out.println("第"+(i+1)+"個物件的類別是"+cl);
		}
	}
}
class Car8
{
	protected int num;
	protected double gas;
	
	public Car8()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
}
class RacingCar8 extends Car8
{
	public RacingCar8()
	{
		System.out.println("生產了賽車");
	}
}
