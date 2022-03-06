import java.util.Scanner;
public class BurcuBulma {
    public static void main(String[] args) {
        int month, day;
        Scanner input= new Scanner(System.in);
        System.out.println("kacinci ayda dogdunuz:");
        month= input.nextInt();
        System.out.println("hangi gun dogdunuz:");
        day= input.nextInt();

        if (month==1 ){
            if ((day>=1)&&(day<=21)){
                System.out.println("oglak burcusunuz");
            }else if ((day>=22)&&(day<=31)){
                System.out.println("kova burcusunuz");
            }

        }else if (month==2){
            if ((day>=1)&&(day<=19)){
                System.out.println("kova burcusunuz");
            }else if ((day>=20)&&(day<=30)){
                System.out.println("balık burcusunuz");
            }

        }else if (month==3){
            if ((day>=1)&&(day<=20)){
                System.out.println("balık burcusunuz");
            }else if ((day>=21)&&(day<=31)){
                System.out.println("koç burcusunuz");
            }
        }else if (month==4){
            if ((day>=1)&&(day<=20)){
                System.out.println("koc burcusunuz");
            }else if ((day>=21)&&(day<=30)){
                System.out.println("boga burcusunuz");
            }
        }else if (month==5){
            if ((day>=1)&&(day<=21)){
                System.out.println("boğa burcusunuz");
            }else if ((day>=22)&&(day<=31)){
                System.out.println("ikizler burcusunuz");
            }
        }else if (month==6){
            if ((day>=1)&&(day<=22)){
                System.out.println("ikizler burcusunuz");
            }else if ((day>=23)&&(day<=30)){
                System.out.println("yengec burcusunuz");
            }
        }else if (month==7){
            if ((day>=1)&&(day<=22)){
                System.out.println("yengec burcusunuz");
            }else if ((day>=23)&&(day<=31)){
                System.out.println("aslan burcusunuz");
            }
        }else if (month==8){
            if ((day>=1)&&(day<=22)){
                System.out.println("aslan burcusunuz");
            }else if ((day>=23)&&(day<=31)){
                System.out.println("basak burcusunuz");
            }
        }else if  (month==9){
            if ((day>=1)&&(day<=22)){
                System.out.println("basak burcusunuz");
            }else if ((day>=23)&&(day<=30)){
                System.out.println("terazi burcusunuz");
            }
        }else if (month==10){
            if ((day>=1)&&(day<=22)){
                System.out.println("terazi burcusunuz");
            }else if ((day>=23)&&(day<=31)){
                System.out.println("akrep burcusunuz");
            }
        }else if (month==11){
            if ((day>=1)&&(day<=21)){
                System.out.println("akrep burcusunuz");
            }else if ((day>=22)&&(day<=30)){
                System.out.println("yay burcusunuz");
            }
        }else{
            if ((day>=1)&&(day<=21)){
                System.out.println("yay burcusunuz");
            }else if ((day>=22)&&(day<=31)){
                System.out.println("oglak burcusunuz");
            }
        }

    }
}
