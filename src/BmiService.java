public class BmiService {
    public double calculate(int height, double weight) {
        double bmi = (weight / (height * height) * 10000);
        return bmi;
    }
}