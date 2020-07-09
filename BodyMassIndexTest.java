import java.util.Scanner;
public class BodyMassIndexTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter heigth");
		double heigth = sc.nextDouble();
		System.out.println("Enter weight");
		double weight = sc.nextDouble();


		BodyMassIndex obj =  new BodyMassIndex();
		BodyMassIndex obj1 =  new BodyMassIndex(heigth);
		BodyMassIndex obj2 =  new BodyMassIndex(heigth, weight);


		obj1.setHeigth(heigth);
		obj1.getHeigth();
		obj2.setWeight(weight);
		obj2.getWeight();

		System.out.println(obj1.getHeigth());
		System.out.println(obj2.getWeight());
		System.out.println(obj.bmi());
	}
}