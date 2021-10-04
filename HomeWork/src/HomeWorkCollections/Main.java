package HomeWorkCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Country ukraine = new Country("Ukraine", "Eurasia", 1991, "Kyiv", 41501175);
        Country china = new Country("China", "Eurasia", 1949, "Beijing", 1411778724);
        Country usa = new Country("USA", "North America", 1776, "Washington", 333449281);
        Country turkey = new Country("Turkey", "Eurasia", 1923, "Ankara", 83614362);
        Country germany = new Country("Germany", "Eurasia", 1990, "Berlin", 83019200);
        Country netherlands = new Country("Netherlands", "Eurasia", 1945, "Amsterdam", 17549782);
        Country belgium = new Country("Belgium", "Eurasia", 1830, "Brussels", 11480534);
        Country egypt = new Country("Egypt", "Africa", 1922, "Cairo", 102333440);
        Country sweden = new Country("Sweden", "Eurasia", 1983, "Stockholm", 9354462);
        Country switzerland = new Country("Switzerland", "Eurasia", 1848, "Bern", 8570146);
        Country india = new Country("India", "Eurasia", 1947, "New Delhi", 1381790000);
        Country greatBritain = new Country("Great Britain", "Eurasia", 1922, "London", 66273576);
        Country italy = new Country("Italy", "Eurasia", 1946, "Rome", 60588306);
        Country norway = new Country("Norway", "Eurasia", 1814, "Oslo", 5391369);
        Country australia = new Country("Australia", "Australia", 1986, "Canberra", 25694393);

        List<Country> countries = new ArrayList<>();
        countries.add(ukraine);
        countries.add(china);
        countries.add(usa);
        countries.add(turkey);
        countries.add(germany);
        countries.add(netherlands);
        countries.add(belgium);
        countries.add(egypt);
        countries.add(sweden);
        countries.add(switzerland);
        countries.add(india);
        countries.add(greatBritain);
        countries.add(italy);
        countries.add(norway);
        countries.add(australia);

        Collections.sort(countries, new CountrySortByName());
        System.out.println(countries);

        Collections.sort(countries, new CountrySortByIndepAge());
        System.out.println(countries);

        findByCapital(countries);

        findByContinent(countries);

    }

    public static void findByCapital(List<Country> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a capital - ");
        String capit = scanner.nextLine();
        boolean a = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCapital().equals(capit)) {
                a = true;
                System.out.println(list.get(i).getName());

            }

        }
        if (!a)
            System.out.println("No such country");

    }

    public static void findByContinent(List<Country> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a continent - ");
        String continent = scanner.nextLine();
        boolean a = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getContinent().equals(continent)) {
                a = true;
                System.out.println(list.get(i).getName());

            }


        }
        if (!a)
            System.out.println("No such country");
    }


}





