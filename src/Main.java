public class Main {
    public static void main(String[] args) {

        for (CapitalCity city : CapitalCity.values()) {
            System.out.println(city.name());
            System.out.println("Country: " + city.getCountry());
            System.out.println("Population: " + city.getPopulation());
            System.out.println("Area: " + city.getArea() + " km 2");
            System.out.println();
        }
    }
}
