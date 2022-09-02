import java.util.Random;
public class Main {


    public static String getMessage(int age, int temperature) {
        if (age >= 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age >= 45 && temperature >= -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static void main(String[] args) {
        System.out.println(getMessage(5, 0));
        System.out.println(getMessage(12, 10));
        System.out.println(getMessage(47, 14));
        System.out.println(getMessage(60, -13));
        System.out.println(getMessage(20, 24));
        System.out.println(Solution2.test(Solution2.generateRandomAge(), 10));
    }
    public class Solution2 {

        public static void main(String[] args) {
            System.out.println(test(23,10));
            System.out.println(test(generateRandomAge(), 10));
        }

        public static String test(int age, int temperature){
            if(age >= 20 && age < 45 && temperature > -20 && temperature < 30){
                return "Можно идти гулять";
            }else if(age < 20 && temperature >= 0 && temperature < 28){
                return "Можно идти гулять";
            }else if(age >=45 && temperature >= -10 && temperature < 25){
                return "Можно идти гулять";
            }else{
                return "Оставайтесь дома";
            }
        }

        public static int generateRandomAge(){
            Random random = new Random();
            return random.nextInt();
        }
    }


}