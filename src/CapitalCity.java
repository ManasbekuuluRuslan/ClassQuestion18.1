public enum CapitalCity {
    TOKYO("Japan", 37400068, 2191),
    DELHI("India", 30236315, 1484),
    PEKIN("China", 21761222, 16410),
    MOSCOW("Russia", 12506468, 2511),
    BISHKEK("Kyrgyzstan", 7000000, 212);

    private final String country;
    private final int population;
    private final int area;

    CapitalCity(String country, int population, int area) {
        this.country = country;
        this.population = population;
        this.area = area;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public int getArea() {
        return area;
    }
}

