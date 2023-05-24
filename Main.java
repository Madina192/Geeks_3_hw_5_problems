import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1
        int[] numbersArray = {9991, 821923, 2832, 22, 1120, 9, 3, 33, 1233};
        Arrays.sort(numbersArray);
        System.out.println(Arrays.toString(numbersArray));



        //2
        int[] numbersList = {10002, 293, 123, 4352, 96354, 816, 992, 984, 884, 38};
        for (int i = 0; i < numbersList.length; i++) {
            if(numbersList[i] % 2 == 0) {
                System.out.println("Четное число: " + numbersList[i]);
            } else {
                System.out.println("Нечетное число: " + numbersList[i]);
            }
        }

        //3
        int[] numbersList2 = {12001, 29384, 12384, 909345, 34289, 1, 2, 3};
        int evenNumbersSum = 0;
        long oddNumbersProduct = 1;
        for (int i = 0; i < numbersList2.length; i++) {
            if(numbersList2[i] % 2 == 0) {
                evenNumbersSum += numbersList2[i];
            } else {
                oddNumbersProduct *= numbersList2[i];
            }
        }
        System.out.println("Sum of the even numbers: " + evenNumbersSum);
        System.out.println("Product of the odd numbers: " + oddNumbersProduct);

        //4
        String[] words = {"переменная", "функция", "метод", "аргумент", "параметр", "привязка", "длина", "высота", "размер"};
        String vowels = "аэоуиыеюя";
        String consonants = "бвгджзйклмнпрстфхцчшщ";

        for (String word : words) {
            System.out.println("Word: " + word);
            System.out.print("Consonants: ");
            for (char letter : word.toCharArray()) {
                if (consonants.contains(String.valueOf(Character.toLowerCase(letter)))) {
                    System.out.print(letter + " ");
                }
            }
            System.out.println();
            System.out.print("Vowels: ");
            for (char letter : word.toCharArray()) {
                if (vowels.contains(String.valueOf(Character.toLowerCase(letter)))) {
                    System.out.print(letter + " ");
                }
            }
            System.out.println("\n");
        }

        //5
        String[] androidWords = {"java", "kotlin", "python", "javascript", "nodejs", "go", "react", "react", "native", "swift"};
        String englishVowels = "aeiouy";
        String englishConsonants = "bcdfghjklmnpqrstvwxz";

        for (String word : androidWords) {
            System.out.println("Word: " + word);
            System.out.print("Consonants: ");
            for (char letter : word.toCharArray()) {
                if (englishConsonants.contains(String.valueOf(Character.toLowerCase(letter)))) {
                    System.out.print(letter + " ");
                }
            }
            System.out.println();
            System.out.print("Vowels: ");
            for (char letter : word.toCharArray()) {
                if (englishVowels.contains(String.valueOf(Character.toLowerCase(letter)))) {
                    System.out.print(letter + " ");
                }
            }
            System.out.println("\n");
        }
        String[] android = {"a", "n", "d", "r", "o", "i", "d"};
        String emptyStringAndroid = "";
        boolean isLetterFound = false;
        for (int i = 0; i < androidWords.length; i++) {
            for (int j = 0; j < android.length; j++) {

            }
        }
        System.out.println(emptyStringAndroid);
    }
}