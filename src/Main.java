import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        question1();
        question2();
        question6();
        tack();
    }

    public static void question1() throws InterruptedException {
        int i=1;
        int a=1;
        Integer b=1;
        Integer c=1;
        Integer k=1984;
        Integer l=1984;
        int o=1984;
        int f=1984;

        long start = System.currentTimeMillis();
        int j=a+i;
        Thread.sleep(1000);
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);

        long start2 = System.currentTimeMillis();
        Integer d=b+c;
        Thread.sleep(1000);
        long finish2 = System.currentTimeMillis();
        long elapsed2 = finish2 - start2;
        System.out.println("Прошло времени, мс: " + elapsed2);
        System.out.println(i==a);
        System.out.println(k==l);
        System.out.println(k.equals(l));
        System.out.println(i==a);
        System.out.println(o==f);

    }

    public static void question2(){
        I i=new I(2,2);
        System.out.println( i.example(2));
        System.out.println( i.example(2,2));
    }

    public static void question3(){

    }

    public static void question4(){
        int a=1;
        System.out.println(a);
    }

    public static void question5(){
        int a=1;
        System.out.println(a);
    }

    public static void question6(){
        Runnable task = new Runnable() {
            public void run() {
                System.out.println("Hello, World!");
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }

    public static void tack(){
        List<String>names=Arrays.asList("PОлег","JДмитрий","LАнна","RВладимир");
        List<String>modifyNames=names.stream()
                .map(name->name.substring(1))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(modifyNames);
    }
}