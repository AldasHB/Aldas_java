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
    }
}
