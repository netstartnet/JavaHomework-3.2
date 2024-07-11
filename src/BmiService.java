public class BmiService {
   public double calculate (int weight, double height){
        double wth = weight / (height*height);
        int bmi = (int)wth;
        return bmi;
    }
}
