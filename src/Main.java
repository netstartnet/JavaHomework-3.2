public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 95;
        double height = 1.85;
        double bmi = service.calculate(weight, height);
        String bmiResult = String.format("%.0f",bmi);
        System.out.println("Ваш вес: " + weight + " кг." + " Ваш рост: " + height*100 + " см." + " Ваш ИМТ составляет: " + bmiResult);
    }
}
