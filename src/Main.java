public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(180, 86);
        System.out.printf("Ваш индекс массы тела %.1f", bmi);

        double bmi1 = service.calculate(160, 80);
        System.out.printf("Ваш индекс массы тела %.1f", bmi1);

        double bmi2 = service.calculate(155, 66);
        System.out.printf("Ваш индекс массы тела %.1f", bmi2);

        double bmi3 = service.calculate(200, 86);
        System.out.printf("Ваш индекс массы тела %.1f", bmi3);
    }
}
