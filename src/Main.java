public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 95;
        double height = 1.85;
        double bmi = service.calculate(weight, height);
        String bmiResult = String.format("%.2f",bmi);
        System.out.println("Ваш вес: " + weight + " кг.");
        System.out.println("Ваш рост: " + height*100 + " см.");
        System.out.println("Ваш ИМТ составляет: " + bmiResult);
    }
}