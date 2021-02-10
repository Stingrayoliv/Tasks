package FootballClub;

import java.util.Objects;

public class FootballClub {
    private String  country;
    private String name;
    private int achievedPoint;

    public FootballClub(String country, String name, int achievedPoint) {
        this.country = country;
        this.name = name;
        this.achievedPoint = achievedPoint;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public int getAchievedPoint() {
        return achievedPoint;
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", achievedPoint=" + achievedPoint +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballClub that = (FootballClub) o;
        return achievedPoint == that.achievedPoint &&
                Objects.equals(country, that.country) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, name, achievedPoint);
    }
}
