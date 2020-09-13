import java.util.Scanner;

public class App {


    public static void spelling(String word){
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 's' && word.charAt(i+1) == 'z'){               
                    System.out.println("sz");               
            }
             if (word.charAt(i) == 'z' && word.charAt(i+1) == 's'){               
                    System.out.println("zs");               
            }
             if (word.charAt(i) == 't' && word.charAt(i+1) == 'y'){               
                    System.out.println("ty");               
            }
             if (word.charAt(i) == 'n' && word.charAt(i+1) == 'y'){               
                    System.out.println("ny");               
            }
             if (word.charAt(i) == 'l' && word.charAt(i+1) == 'y'){               
                    System.out.println("ly");               
            }
             if (word.charAt(i) == 'g' && word.charAt(i+1) == 'y'){               
                    System.out.println("gy");               
            }
             if (word.charAt(i) == 'c' && word.charAt(i+1) == 's'){               
                    System.out.println("cs");               
            }
             if (word.charAt(i) == 'd' && word.charAt(i+1) == 'z'){               
                    if (word.charAt(i+2) == 's')
                        System.out.println("dzs");
                    else
                        System.out.println("dz");             
            }
        }
    }
  
//elválasztás az átláthatóság kedvéért
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
