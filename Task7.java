import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your favorite quote: "); //string priima
        String quote = scanner.nextLine();
        System.out.println("Your favorite quote is: " + quote); // string parodo

        int total = 1; //kad pradetu zodziu kieki skaiciuot ne nuo nulio
        int i = 0; // simbloiu kiekio seka
        while (i < quote.length()) { // pereina string ilgi
            if ((quote.charAt(i) == ' ') && (quote.charAt(i + 1) != ' ')) { //jeigu yra tarpas prisideda 1 prie zodziu kiekio jei kitas simblois nera tarpas
                total++;
            }
            i++;
        }
        System.out.println("Number of words in the given string: " + total);


        int len = quote.length(); // taip pat kaip ir pries tai pasiemiau string ilgi
        System.out.println("Symbols used: " + len);


        StringBuilder demotext = new StringBuilder(quote); //i string builderi ikeliau string
        demotext.reverse(); //apvercia string
        System.out.println(demotext);
        scanner.close();


        char mostRecurringChar = '\0'; //
        int maxCount = 0;

        // pereisim per visus simbolius
        for (int c = 0; c < quote.length(); c++) {
            char currentChar = quote.charAt(c);
            int count = 0;

            // surasim dazniausiai pasikartojanti pridedant po + 1 prie kiekvieno simbolio
            for (int j = 0; j < quote.length(); j++) {
                if (quote.charAt(j) == currentChar) {
                    count++;
                }
            }

            // istraukiam didziausia kartu pasikartojanti simboli
            if (count > maxCount) {
                maxCount = count;
                mostRecurringChar = currentChar;
            }
        }

        // Print the most recurring character
        System.out.println("Most recurring character: " + mostRecurringChar);

            }
        }