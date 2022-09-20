import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
//Задача1(1)
        byte [] number =new byte [3];
        number [0]=1;
        number[1]=2;
        number[2]=3;
        String str =Arrays.toString(number);
        System.out.println(str);
//Задача1(2)
        float [] number1 ={1.57f,7.654f,9.986f};
        String str1 =Arrays.toString(number1);
        System.out.println(str1);
//Задача1(3)
        boolean [] number2 ={true,true,false,false};
        String str2 =Arrays.toString(number2);
        System.out.println(str2);
        System.out.println("Задание2");
//Задание2
//Задача2.1
        for (byte i=0;i<(number.length);i++){
            if (i==number.length-1){
                System.out.println(number[i]);
            }else {
                System.out.print(number[i]+",");
            }}
//Задача2.2
        for (byte i=0;i<(number1.length);i++){
            if (i==number1.length-1){
                System.out.println(number1[i]);
            }else {
                System.out.print(number1[i]+",");
            }}
//Задача2.3
        for (byte i=0;i<(number2.length);i++){
            if (i==number2.length-1){
                System.out.println(number2[i]);
            }else {
                System.out.print(number2[i]+",");
            }}
//Задание3
        System.out.println("Задание3");
        //System.out.println(number.length);

        for (int i= (number.length);i!=0;i--){
            if (i!=1){
                System.out.print((number[i-1])+",");
            } else {
                System.out.println(number[i-1]);
        }}

        for (int i= (number1.length);i!=0;i--){
            if (i!=1){
                System.out.print((number1[i-1])+",");
            } else {
                System.out.println(number1[i-1]);
            }}

        for (int i= (number2.length);i!=0;i--){
            if (i!=1){
                System.out.print((number2[i-1])+",");
            } else {
                System.out.println(number2[i-1]);
            }}
//Задание4
        System.out.println("Задание4");
        for (byte i=0;i<=(number.length)-1;i++){
            if (i==number.length-1){
                if ((number[i])%2==0){
                    System.out.println(number[i]);

                }else {
                    System.out.println(number[i]+1);
                }
            }else {
                if ((number[i])%2==0){
                    System.out.print(number[i]+",");
                }else {
                    System.out.print((number[i]+1)+",");
                }
            }}

        }}
