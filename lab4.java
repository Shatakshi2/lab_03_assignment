import java.util.ArrayList;
import java.util.Scanner;

class Match {
    String location;
    String team1;
    String team2;
    String timing;

    public Match(String location, String team1, String team2, String timing) {
        this.location = location;
        this.team1 = team1;
        this.team2 = team2;
        this.timing = timing;
    }
}

public class lab4 {
    public static void main(String[] args) {
        ArrayList<Match> matches = new ArrayList<>();
        matches.add(new Match("Mumbai", "India", "Sri Lanka", "DAY"));
        matches.add(new Match("Delhi", "England", "Australia", "DAY-NIGHT"));
        matches.add(new Match("Chennai", "India", "South Africa", "DAY"));
        matches.add(new Match("Indore", "England", "Sri Lanka", "DAY-NIGHT"));
        matches.add(new Match("Mohali", "Australia", "South Africa", "DAY-NIGHT"));
        matches.add(new Match("Delhi", "India", "Australia", "DAY"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a search parameter:");
            System.out.println("1. List of all the matches of a Team");
            System.out.println("2. List of Matches on a Location");
            System.out.println("3. List of Matches based on timing");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the team name: ");
                    String teamName = scanner.nextLine();
                    System.out.println("Matches of " + teamName + ":");
                    for (Match match : matches) {
                        if (match.team1.equalsIgnoreCase(teamName) || match.team2.equalsIgnoreCase(teamName)) {
                            System.out.println(match.location + " " + match.team1 + " vs " + match.team2 + " " + match.timing);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter the location: ");
                    String location = scanner.nextLine();
                    System.out.println("Matches at " + location + ":");
                    for (Match match : matches) {
                        if (match.location.equalsIgnoreCase(location)) {
                            System.out.println(match.team1 + " vs " + match.team2 + " " + match.timing);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter the timing: ");
                    String timing = scanner.nextLine();
                    System.out.println("Matches at " + timing + " timing:");
                    for (Match match : matches) {
                        if (match.timing.equalsIgnoreCase(timing)) {
                            System.out.println(match.location + " " + match.team1 + " vs " + match.team2);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}