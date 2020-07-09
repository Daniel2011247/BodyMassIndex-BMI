import java.lang.Math;
public class BodyMassIndex{
	private double heigth;
    private double weight;

    public BodyMassIndex(){

    }
    public BodyMassIndex(double heigth){
        this.heigth = heigth;
    }
    public BodyMassIndex(double heigth, double weight){
        this.heigth = heigth;
        this.weight = weight;
    }
    public void setHeigth(double heigth){
        this.heigth = heigth;
    }
    public double getHeigth(){
        return heigth;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public double bmi(){
        double bmi = weight/Math.pow(heigth,2);
        return bmi;
        
    }
}