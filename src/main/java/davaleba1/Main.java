package davaleba1;

public class Main {
    public static void main(String[] args) {
        Work1 work = new Work1();

        String test2 = "Lela Magaria!";

        int vowelCount = work.countVowel(test2);

        System.out.println("ამ სტრიქონში არის " + vowelCount + " ხმოვანი");
    }
}