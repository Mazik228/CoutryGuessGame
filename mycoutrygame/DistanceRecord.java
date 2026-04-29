package mycoutrygame;

/**
 * A simple record-style class used to link a country's name to its calculated distance.
 * Used exclusively for sorting the leaderboard.
 */
public class DistanceRecord {
  protected String countryName;
  protected double distance;

    public DistanceRecord(String countryName, double distance) {
        this.countryName = countryName;
        this.distance = distance;
    }
}