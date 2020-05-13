package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void minimum(int n) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
        int min = arrayList.get(0);
        for (int i = 0; i < n; i++) {
            if (min > arrayList.get(i)) min = arrayList.get(i);
        }
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println(min);
    }

    public static void averageofarray(int n) {
        ArrayList<Double> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextDouble());
        }
        for (int i = 0; i < n; i++) {
            sum += arrayList.get(i);
        }
        arrayList.clear();
        System.out.println((sum / (n)));
        System.out.println(sum);
    }

    public static void primeorcomposite(int n) {
        if (n % 2 == 0) System.out.println("Composite");
        else System.out.println("Prime");
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
    public static int fibonacci(int n){
        if(n==0)return 1;
        if(n<4)return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static int an(int a,int n){
        if(n==1)return a;
        return a*an(a,n-1);
    }
    public static void problem7(int n){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        if(n>1) {
            problem7(n - 1);
        }
        System.out.println(b);
    }
    public static void checkString(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<10;j++) {
                if (str.charAt(i)==(char)count++){
                    System.out.println("Yes");
                    break;
                }
            }
        }
        System.out.println("No");
    }
    public static int problem9(int n,int k){
        if (k>n/2) k=n-k;
        if (k==1)  return n;
        if (k==0)  return 1;
        return problem9(n-1,k)+problem9(n-1,k-1);
    }

    public static int problem10(int a,int b){
            if (b != 0)
                return problem10(b, a % b);
            else
                return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int n = sc.nextInt();*/
        /*minimum(n);
        n=sc.nextInt();
        averageofarray(n);
        n = sc.nextInt();
        primeorcomposite(n);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(an(a,b));*/
        /* problem7(n);*/
        /*String str=sc.next();
        checkString(str);*/
        int n=sc.nextInt();
        int k=sc.nextInt();
       /* System.out.println(problem9(n,k));*/
        System.out.println(problem10(n,k));

    }
}
