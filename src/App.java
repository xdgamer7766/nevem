import java.util.Scanner;

public class App {


    public static void spelling(String word){
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
    public static void main(String[] args) {
        f1();
    }

    public static void f1(){
        System.out.println("1.Feladat");
        spelling("Polgár Benedek");
    }

    public static void f2(){
        System.out.println("2.feladat");
        Scanner scnr = new Scanner(System.in);
        System.out.println("Adjon meg egy szót");
        String yrwrd = scnr.nextLine();
        spelling(yrwrd);
    }
}
