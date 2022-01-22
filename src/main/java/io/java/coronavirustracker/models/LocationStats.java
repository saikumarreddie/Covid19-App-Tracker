package io.java.coronavirustracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int latestTotalCase;
    private int diffFromPrevDay;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setLatestTotalCase(int latestTotalCase) {
        this.latestTotalCase = latestTotalCase;
    }

    public String getCountry() {
        return country;
    }

    public int getLatestTotalCase() {
        return latestTotalCase;
    }



    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCase=" + latestTotalCase +
                '}';
    }

    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }
}
