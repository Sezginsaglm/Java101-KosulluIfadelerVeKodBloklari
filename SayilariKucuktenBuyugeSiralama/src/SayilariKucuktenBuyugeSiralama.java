import java.util.Scanner;

public class SayilariKucuktenBuyugeSiralama {
    public static void main(String[] args) {

        int x,y,z;

        Scanner input=new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz : ");
        x=input.nextInt();

        System.out.print("2.Sayıyı giriniz : ");
        y=input.nextInt();

        System.out.print("3. Sayıyı giriniz : ");
        z=input.nextInt();

        if ((x<y)&&(x<z)){
            if (y<z){
                System.out.println("x<y<z");
            } else if (z<y) {
                System.out.println("x<z<y");
            }
        }
        if ((y<x)&&(y<z)){
            if (x<z){
                System.out.println("y<x<z");
            } else if (z<x) {
                System.out.println("y<z<x");

            }
        }
        if ((z<x)&&(z<y)){
            if (x<y){
                System.out.println("z<x<y");
            } else if (y<x) {
                System.out.println("z<y<x");

            }
        }
        if (x==y){
            if (y<z){
                System.out.println("x=y<z");
            } else if (z<y) {
                System.out.println("z<x=y");

            }
        }
        if (x==z){
            if (z<y){
                System.out.println("x=z<y");
            } else if (y < z) {
                System.out.println("y<x=z");
            }
        }
        if (y==z){
            if (y<x){
                System.out.println("y=z<x");
            } else if (x<y) {
                System.out.println("x<y=z");
            } else  {
                System.out.println("x=y=z");
            }
        }
    }


}



