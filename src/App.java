import java.util.Scanner;


public class App {


    public static void spelling(String word){
        int i = 0;
        while(i < word.length()) {            
           char indexchar = word.charAt(i);
           switch (indexchar){
               case 'c':
                    if (word.charAt(i+1) == 's'){
                        System.out.println("cs");
                        i++;
                    }
                    else
                    {
                        System.out.println('c');
                    }
                    break;
                case 'd':
                    if (word.charAt(i+1) == 'z'){
                        if (word.charAt(i+2) == 's'){
                            System.out.println("dzs");
                            i = i + 2;
                        }
                        else{
                            System.out.println("dz");
                            i++;
                        }
                    }
                    else
                    {
                        System.out.println('d');
                    }
                    break;
                case 'g':
                    if (word.charAt(i+1) == 'y'){
                        System.out.println("gy");
                        i++;
                    }
                    else
                    {
                        System.out.println('g');
                    }
                    break;
                case 'l':
                    if (word.charAt(i+1) == 'y'){
                        System.out.println("ly");
                        i++;
                    }
                    else
                    {
                        System.out.println('l');
                    }
                    break;
                case 'n':
                    if (word.charAt(i+1) == 'y'){
                        System.out.println("ny");
                        i++;
                    }
                    else
                    {
                        System.out.println('n');
                    }
                    break;
                case 's':
                    if (word.charAt(i+1) == 'z'){
                        System.out.println("sz");
                        i++;
                    }
                    else
                    {
                        System.out.println('s');
                    }
                    break;
                case 't':
                    if (word.charAt(i+1) == 'y'){
                        System.out.println("ty");
                        i++;
                    }
                    else
                    {
                        System.out.println('t');
                    }
                    break;
                case 'z':
                    if (word.charAt(i+1) == 's'){
                        System.out.println("zs");
                        i++;
                    }
                    else
                    {
                        System.out.println('z');
                    }
                    break;
                default:
                    System.out.println(word.charAt(i));
                    break;
           }
           i++;
        }
    }
  



    public static void main(String[] args) {
        f1();
        f2();
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
