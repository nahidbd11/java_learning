import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Random randNumb=new Random();
        int generatedRandnumb=randNumb.nextInt(10)+1;
        boolean isFinished=false;
//        System.out.println(generatedRandnumb);
        int tried=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Your first guess number");
        int num=scanner.nextInt();
        while(!isFinished){
            tried++;
            if(tried>3) {
                isFinished=true;
                System.out.println("You lost the game");
            }else{
                if(num==generatedRandnumb){
                   isFinished=true;
                    System.out.println("Congratulation you are brilliant!!!!!!!!!");
                }else if(num>generatedRandnumb){
                    System.out.println("guess low number");
                     num=scanner.nextInt();
                } else {
                    System.out.println("guess higher number");
                     num=scanner.nextInt();
                }
            }

        }



    }
    }
