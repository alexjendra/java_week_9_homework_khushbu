package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations. Just use Zone 1 stations name.
 */
public class Programme_10_Zone_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of Zone 1 station names
        String[] zone1Stations = {"Aldgate", "Bank", "Blackfriars", "Cannon Street", "Chancery Lane", "Covent Garden",
                "Euston Square", "Farringdon", "Holborn", "King's Cross St. Pancras", "Liverpool Street", "London Bridge",
                "Moorgate", "Monument", "Old Street", "Oxford Circus", "Piccadilly Circus", "Russell Square",
                "St. Paul's", "Tottenham Court Road", "Tower Hill", "Victoria"};

        // Create an array list to store the lines that pass through each station
        ArrayList<String[]> linesByStation = new ArrayList<>();

        // For each station, find the lines that pass through it
        for (String station : zone1Stations) {
            String[] lines = getLinesForStation(station);
            linesByStation.add(lines);
        }

        // Prompt the user to enter a station name
        System.out.println("Enter a station name:");
        String stationName = scanner.nextLine();

        // Find the index of the station in the array
        int stationIndex = Arrays.binarySearch(zone1Stations, stationName);

        // If the station is not found, print an error message
        if (stationIndex < 0) {
            System.out.println("Station not found.");
        } else {
            // Get the lines for the station and print them
            String[] lines = linesByStation.get(stationIndex);
            System.out.println("Lines for " + stationName + ":");
            System.out.println(Arrays.toString(lines));
        }
        scanner.close();
    }

    // Helper method to get the lines that pass through a particular station
    private static String[] getLinesForStation(String station) {
        switch (station) {
            case "Aldgate":
                return new String[]{"Circle", "Metropolitan"};
            case "Bank":
                return new String[]{"Central", "Northern", "Waterloo"};
            case "Blackfriars":
                return new String[]{"Circle", "District"};
            case "Cannon Street":
                return new String[]{"Circle", "Northern"};
            case "Chancery Lane":
                return new String[]{"Central"};
            case "Covent Garden":
                return new String[]{"Piccadilly"};
            case "Euston Square":
                return new String[]{"Circle", "Hammersmith & City", "Metropolitan"};
            case "Farringdon":
                return new String[]{"Circle", "Hammersmith & City", "Metropolitan"};
            case "Holborn":
                return new String[]{"Central", "Piccadilly"};
            case "King's Cross St. Pancras":
                return new String[]{"Circle", "Hammersmith & City", "Metropolitan", "Northern", "Piccadilly"};
            case "Liverpool Street":
                return new String[]{"Central", "Circle", "Hammersmith & City", "Metropolitan"};
            case "London Bridge":
                return new String[]{"Jubilee", "Northern"};
            case "Moorgate":
                return new String[]{"Circle", "Hammersmith & City", "Metropolitan", "Northern"};
            case "Monument":
                return new String[]{"Circle", "District"};
            case "Old Street":
                return new String[]{"Northern"};
            case "Oxford Circus":
                return new String[]{"Bakerloo", "Central", "Victoria"};
            case "Piccadilly Circus":
                return new String[]{"Bakerloo", "Piccadilly"};
            case "Russell Square":
                return new String[]{"Piccadilly"};
            case "St. Paul's":
                return new String[]{"Central"};
            case "Tottenham Court Road":
                return new String[]{"Central", "Northern"};
            case "Tower Hill":
                return new String[]{"Circle", "District"};
            case "Victoria":
                return new String[]{"Circle", "District"};
            default:
                return new String[]{};
        }
    }
}
