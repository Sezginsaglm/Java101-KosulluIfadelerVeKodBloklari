import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {

        int ay,gun;

        Scanner input = new Scanner(System.in);
        System.out.print(" Doğduğunuz ayı sayı olarak belirtiniz : ");
        ay = input.nextInt();

        System.out.print(" Doğduğunuz günü sayı olarak belirtiniz : ");
        gun = input.nextInt();

        if (ay>=1&&ay<=12){
            if (ay==1){
                if (gun >= 1 && gun<=31){
                    if (gun<=21){
                        System.out.print("Burcunuz Oğlak'tır");
                    } else if (gun>21) {
                        System.out.print("Burcunuz Kova'dır");

                    }
                }else{
                    System.out.println("Doğum tarihinizi düzgün girdiğinizden emin olun.");
                }
            }

            if (ay==2){
                if (gun >= 1 && gun<=29){
                    if (gun<=19){
                        System.out.print("Burcunuz Kova'dır");
                    } else if (gun>19) {
                        System.out.print("Burcunuz Balık'tır");

                    }
                }else{
                    System.out.print("Doğum tarihinizi düzgün girdiğinizden emin olun.");
                }
            }

            if (ay==3){
                if (gun >= 1 && gun<=31){
                    if (gun<=20){
                        System.out.print("Burcunuz Balık'tır");
                    } else if (gun>21) {
                        System.out.print("Burcunuz Koç'tur");

                    }
                }else{
                    System.out.println("Doğum tarihinizi düzgün girdiğinizden emin olun.");
                }
            }

            if (ay==4){
                if (gun >= 1 && gun<=30){
                    if (gun<=20){
                        System.out.print("Burcunuz Koç'tur");
                    } else if (gun>20) {
                        System.out.print("Burcunuz Boğa'dır");

                    }
                }else{
                    System.out.println("Doğum tarihinizi düzgün girdiğinizden emin olun.");
                }
            }

            if (ay==5){
                if (gun >= 1 && gun<=31){
                    if (gun<=21){
                        System.out.print("Burcunuz Boğa'dır");
                    } else if (gun>21) {
                        System.out.print("Burcunuz İkizler'dir");

                    }
                }else{
                    System.out.println("Doğum tarihinizi düzgün girdiğinizden emin olun.");
                }
            }

            if (ay==6){
                if (gun >= 1 && gun<=30){
                    if (gun<=22){
                        System.out.print("Burcunuz İkizler'dir");
                    } else if (gun>22) {
                        System.out.print("Burcunuz Yengeç'dir");

                    }
                }else{
                    System.out.println("Doğum tarihinizi düzgün girdiğinizden emin olun.");
                }
            }

            if (ay==7){
                if (gun >= 1 && gun<=31){
                    if (gun<=22){
                        System.out.print("Burcunuz Yengeç'tir");
                    } else if (gun>22) {
                        System.out.print("Burcunuz Aslan'dır");

                    }
                }else{
                    System.out.print("Doğum tarihinizi düzgün girdiğinizden emin olun.");
                }
            }

            if (ay==8){
                if (gun >= 1 && gun<=31){
                    if (gun<=22){
                        System.out.print("Burcunuz Aslan'dır");
                    } else if (gun>22) {
                        System.out.print("Burcunuz Başak'dır");

                    }
                }else{
                    System.out.println("Doğum tarihinizi düzgün girdiğinizden emin olun.");
                }
            }

            if (ay==9){
                if (gun >= 1 && gun<=30){
                    if (gun<=22){
                        System.out.print("Burcunuz Başak'tır");
                    } else if (gun>22) {
                        System.out.print("Burcunuz Terazi'dir");

                    }
                }else{
                    System.out.println("Doğum tarihinizi düzgün girdiğinizden emin olun.");
                }
            }

            if (ay==10){
                if (gun >= 1 && gun<=31){
                    if (gun<=22){
                        System.out.print("Burcunuz Terazi'dir");
                    } else if (gun>22) {
                        System.out.print("Burcunuz Akrep'tir");

                    }
                }else{
                    System.out.println("Doğum tarihinizi düzgün girdiğinizden emin olun.");
                }
            }

            if (ay==11){
                if (gun >= 1 && gun<=30){
                    if (gun<=21){
                        System.out.print("Burcunuz Akrep'tir");
                    } else if (gun>21) {
                        System.out.print("Burcunuz Yay'dır");

                    }
                }else{
                    System.out.println("Doğum tarihinizi düzgün girdiğinizden emin olun.");
                }
            }

            if (ay==12){
                if (gun >= 1 && gun<=31){
                    if (gun<=21){
                        System.out.print("Burcunuz Yay'dır");
                    } else if (gun>21) {
                        System.out.print("Burcunuz Oğlak'tır");

                    }
                }else{
                    System.out.println("Doğum tarihinizi düzgün girdiğinizden emin olun.");
                }
            }
        }


    }
}
