package HomeWorkCollections;

import java.util.Comparator;

public class CountrySortByIndepAge implements Comparator<Country> {


    @Override
    public int compare(Country o1, Country o2) {
        return  o2.getIndepYear() - o1.getIndepYear();
    }
}
