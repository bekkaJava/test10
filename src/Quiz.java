import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        quiz(scanner);
        scanner.close();

    }

    public static void quiz(Scanner scanner) {
        while (true) {

            String[] answers = {"A", "B", "B", "A", "B", "B", "C", "A", "A", "A"};
            String[] userAnswers = {"", "", "", "", "", "", "", "", "", ""};

            System.out.println("What is the capital city of Peru");

            System.out.println("A : Lima");
            System.out.println("B : Doha");
            System.out.println("C : Paris");
            System.out.println("D : Rome");

            userAnswers[0] = scanner.next();

            System.out.println("Which river is the longest in the world?");

            System.out.println("A : Amazon");
            System.out.println("B : Nile");
            System.out.println("C : Mississippi");
            System.out.println("D : Yangtze");

            userAnswers[1] = scanner.next();

            System.out.println("Which mountain is the tallest in the world?");

            System.out.println("A : Mount Kilimanjaro");
            System.out.println("B : Mount Everest");
            System.out.println("C : Mount McKinley (Denali)");
            System.out.println("D : Mount Fuji");

            userAnswers[2] = scanner.next();


            System.out.println("Which waterfall holds the title for being the tallest in the world?");

            System.out.println("A : Angel Falls (Salto Ángel) in Venezuela");
            System.out.println("B : Niagara Falls in North America");
            System.out.println("C : Victoria Falls in Zambia and Zimbabwe");
            System.out.println("D : Iguazu Falls in Argentina and Brazil");

            userAnswers[3] = scanner.next();


            System.out.println("Which continent is the largest by land area?");

            System.out.println("A : Africa");
            System.out.println("B : Asia");
            System.out.println("C : North America");
            System.out.println("D : South America");

            userAnswers[4] = scanner.next();


            System.out.println("What is the name of the world's deepest lake?");

            System.out.println("A : Lake Superior");
            System.out.println("B : Lake Baikal");
            System.out.println("C : Caspian Sea");
            System.out.println("D : Lake Victoria");

            userAnswers[5] = scanner.next();


            System.out.println("Which mountain range is considered the longest in the world?");

            System.out.println("A : Rocky Mountains");
            System.out.println("B : Himalayas");
            System.out.println("C : Andes");
            System.out.println("D : Alps");

            userAnswers[6] = scanner.next();


            System.out.println("Which desert is the largest in the world?");

            System.out.println("A : Sahara Desert");
            System.out.println("B : Gobi Desert");
            System.out.println("C : Arabian Desert");
            System.out.println("D : Kalahari Desert");

            userAnswers[7] = scanner.next();


            System.out.println("Which country is known as the 'Land of the Rising Sun'?");

            System.out.println("A : Japan");
            System.out.println("B : China");
            System.out.println("C : South Korea");
            System.out.println("D : Vietnam");

            userAnswers[8] = scanner.next();


            System.out.println("Which continent is known as the 'Dark Continent'?");

            System.out.println("A : Africa");
            System.out.println("B : Asia");
            System.out.println("C : South America");
            System.out.println("D : Antarctica");

            userAnswers[9] = scanner.next();

            System.out.println();

            int score = 0;

            for (int i = 0; i < answers.length; i++) {
                if (answers[i].equals(userAnswers[i].toUpperCase())) {
                    score++;
                }
            }

            System.out.println("Your score is " + score + "/" + "10");
            System.exit(0);
        }

    }
}
