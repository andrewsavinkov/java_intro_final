package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main (String[] args) {
        Laptop lap1 = new Laptop();
        Laptop lap2 = new Laptop();
        Laptop lap3 = new Laptop();

        lap1.name="MacBook";
        lap1.model="Air";
        lap1.serialNumber="SN123456";
        lap1.ram=8192;
        lap1.hdd=120;
        lap1.os="macOS";
        lap1.color="Space-Grey";
        lap1.price=120000;

        lap2.name="MSI";
        lap2.model="Raider";
        lap2.serialNumber="SN987456";
        lap2.ram=16384;
        lap2.hdd=512;
        lap2.os="Windows 11";
        lap2.color="Black";
        lap2.price=150000;

        lap3.name="HP";
        lap3.model="ProBook 455";
        lap3.serialNumber="SN987123";
        lap3.ram=16384;
        lap3.hdd=256;
        lap3.os="Windows 11";
        lap3.color="Grey";
        lap3.price=90000;

        Set <Laptop> myStore = new HashSet<>(Arrays.asList(lap1, lap2, lap3));
        while (true) {
            filter(myStore);
        }
    }
    static void filter(Set <Laptop> laptopSet){
        Scanner newSc = new Scanner(System.in);
        System.out.println("Введите критерий фильтрации:\n1-По названию\n2-По объему опреативной памяти\n3-По объему жесткого диска\n4-По типу операционной системы,\n5-показать все модели");
        int choice = newSc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Введите название: ");
                String name = newSc.next();
                for (Laptop item : laptopSet) {
                    if (item.name.contains(name)) {
                        System.out.println(item.toString());
                        System.out.println("\n");
                    }
                }
                break;
            case 2:
                System.out.println("Введите объем оперативной памяти в мегабайтах цифрами (1024 мБ, 4096 мБ и т.д.): ");
                try {int ram = Integer.parseInt(newSc.next()) ;
                    for (Laptop item : laptopSet) {
                        if (item.ram==ram) {
                            System.out.println(item.toString());
                            System.out.println("\n");
                        }}
                } catch (Exception e) {
                    System.out.println("Введите корректное значение!");
                }
                break;
            case 3:
                System.out.println("Введите объем жесткого диска в гигабайтах цифрами (120 ГБ, 240 ГБ и т.д.): ");
                try {int hdd = Integer.parseInt(newSc.next()) ;
                    for (Laptop item : laptopSet) {
                        if (item.hdd==hdd) {
                            System.out.println(item.toString());
                            System.out.println("\n");
                        }}
                } catch (Exception e) {
                    System.out.println("Введите корректное значение!");
                }
                break;
            case 4:
                System.out.println("Введите ОС: ");
                String os = newSc.next();
                for (Laptop item : laptopSet) {
                    if (item.os.contains(os)) {
                        System.out.println(item.toString());
                        System.out.println("\n");
                    }
                }
                break;
            case 5:
                for (Laptop item : laptopSet) {
                    System.out.println(item.toString());
                    System.out.println("\n");
                }
                break;
            default:
                newSc.close();
                break;
        }
    }
}
