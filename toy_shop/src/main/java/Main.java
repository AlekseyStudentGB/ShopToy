import classPack.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static ArrayList<Toy> shopList = new ArrayList<>();

    public static int command;
    public static String menu = """
            1. Добавить приз 
            2. Получить приз
            3. Удалить приз
            4. Выйти""";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (command != 4) {
            showList();
            System.out.println(menu);
            System.out.println("Введите команду меню ");
            command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 1 -> addToyInShop();
                case 2 -> getPriz(shopList);

                case 4 -> System.out.println("Bay!!!");

            }

        }

    }

    public static void addToyInShop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("название ");
        String name = scanner.nextLine();
        System.out.println("количество ");
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println("цену ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("шанс выпадения ");
        int weight = Integer.parseInt(scanner.nextLine());
        shopList.add(new softToy(name, count, price, weight));
    }

    public static void showList() {
        System.out.println("Сейчас разыгрывается :");
        if (shopList.size() > 0) {
            for (Toy x : shopList) {
                System.out.print(x.getName() + " " + x.getCount()+"шт. / ");

            }
            System.out.println();
        }
    }

    public static void getPriz(ArrayList<Toy> shopList) {
        ArrayList<Toy> winList = new ArrayList<>();
        for (Toy x : shopList) {
            if (x.getCount()>0) {
                for (int i = 0; i < x.getWeight(); i++) {
                    winList.add(x);
                }
            }

        }
        int r = new Random().nextInt(winList.size());
        System.out.println("Ваш приз -> " + winList.get(r).getName());
        winList.get(r).sale(1);
    }


}