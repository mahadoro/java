package HomeWorkCollections;

import java.util.ArrayList;
import java.util.List;

public class Country {

    private String Name;
    private String Continent;
    private int IndepYear;
    private String Capital;
    private int population;



    public Country(String name, String continent, int indepYear, String capital, int population) {
        Name = name;
        Continent = continent;
        IndepYear = indepYear;
        Capital = capital;
        this.population = population;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public int getIndepYear() {
        return IndepYear;
    }

    public void setIndepYear(int indepYear) {
        IndepYear = indepYear;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Name='" + Name + '\'' +
                ", Continent='" + Continent + '\'' +
                ", IndepYear=" + IndepYear +
                ", Capital='" + Capital + '\'' +
                ", population=" + population +
                "}\n";
    }
}
