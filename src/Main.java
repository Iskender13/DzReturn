public class Main {


    public static void main(String[] args) {
        int age;
        int temperature;

        System.out.println(checkWeatherAndAge(age=25, temperature=10));


        System.out.println(checkWeatherAndAge(age=18, temperature=15));


        System.out.println(checkWeatherAndAge(age=50, temperature=20));


        System.out.println(checkWeatherAndAge(age=-30, temperature=-5));


        System.out.println(checkWeatherAndAge(age=40, temperature=5));


    }


    public static String checkWeatherAndAge(int age, int temperature) {
        String answer="Можно идти гулять";
        String answerTwo="Оставайтесь дома";

        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||


                (age < 20 && temperature >= 0 && temperature <= 28) ||


                (age > 45 && temperature >= -10 && temperature <= 25)) {


            return answer;


        } else {


            return answerTwo;


        }


    }


}