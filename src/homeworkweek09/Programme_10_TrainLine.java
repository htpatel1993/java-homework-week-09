package homeworkweek09;

import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_TrainLine {
    public static void main(String[] args) {
        char result;
        String station[] = new String[]{"Staions", "Aldgate", "Borough", "Bank", "Baker Street", "Edgware Road", "Aldgate East", "Baker Street", "Green Oark",
                "Euston", "Liverpool Street", "London Bridge", "Waterloo", "Regent's Park", "Holborn", "Baker Street",
                "Paddington", "Bond Street", "Picaadilly Circus", "Warren Street",
                "Moorgate", "Oxford Circus", "St Paul", "Farringdon", "Bayswater", "Westminster", "Leicester Square",
                "Barbican", "Old Street", "Bond Street", "Waterloo", "Covent Garden", "Green Park"};

        String[][] alllines = new String[12][42];
        alllines[0][0] = "Metreopolitan";
        alllines[0][1] = "Aldgate";
        alllines[0][2] = "LiverPool Street";
        alllines[0][3] = "Moorgate";
        alllines[0][4] = "Barbian";

        alllines[1][0] = "Northern";
        alllines[1][1] = "London Bridge";
        alllines[1][2] = "Moorgate";
        alllines[1][3] = "Old Street";

        alllines[2][0] = "Waterloo & City";
        alllines[2][1] = "Bank";
        alllines[2][2] = "Waterloo";

        alllines[3][0] = "Bakerloo";
        alllines[3][1] = "Baker Street";
        alllines[3][2] = "Oxford";
        alllines[3][3] = "Picaadilly Circus";

        alllines[4][0] = "Central";
        alllines[4][1] = "Bank";
        alllines[4][2] = "st Paul";
        alllines[4][3] = "Bond Street";

        alllines[5][0] = "Edgware Road";
        alllines[5][1] = "Baker Street";
        alllines[5][2] = "Farringdon";
        alllines[5][3] = "Barbican";

        alllines[6][0] = "DLR";
        alllines[6][1] = "Bank";

        alllines[7][0] = "District";
        alllines[7][1] = "Edgware Road";
        alllines[7][2] = "Paddington";
        alllines[7][3] = "Bayswater";

        alllines[8][0] = "Hammersmith & City";
        alllines[8][1] = "Aldgate East";
        alllines[8][2] = "Liverpool Street";
        alllines[8][3] = "Moorgate";
        alllines[8][4] = "Barbican";

        alllines[9][0] = "Jubliee";
        alllines[9][1] = "Baker Street";
        alllines[9][2] = "Boud Street";
        alllines[9][3] = "Westminster";
        alllines[9][4] = "Waterloo";

        alllines[10][0] = "Picadily";
        alllines[10][1] = "Green Dark";
        alllines[10][2] = "Picaadily Circus";
        alllines[10][3] = "Leicester Square";
        alllines[10][4] = "Covent Garden";

        alllines[11][0] = "Victoria";
        alllines[11][1] = "Euston";
        alllines[11][2] = "Warren Street";
        alllines[11][3] = "Oxford Circus";

        //  Scanner scanner = new Scanner(System.in);
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter the tube station name of Zone 1:");
            String userTubestation = scanner.nextLine();
            String catchStationName = "";

            for (int a = 0; a < station.length; a++) {
                if (userTubestation.equalsIgnoreCase(station[a])) {
                    catchStationName = station[a];
                }
            }
            if (userTubestation.equalsIgnoreCase(catchStationName)) {
                System.out.println(userTubestation + " Station is in Zone 1.");
                System.out.println("------------------------------------------------");
                System.out.println("Following Lines passing through " + userTubestation + " is : ");

                for (int i = 0; i < alllines.length; i++) {
                    for (int j = 1; j < alllines.length; j++) {
                        String MATCH = alllines[i][j];
                        if (userTubestation.equalsIgnoreCase(MATCH)) {
                            System.out.println(alllines[i][0]);
                        }
                    }
                }
            } else {
                System.out.println("Station is not in the Zone 1,");
            }
            System.out.println("Do you want to try again : 'Y' or 'N' ");
            result = scanner.next().charAt(0);
        } while (result == 'Y' || result == 'y');
    }
}