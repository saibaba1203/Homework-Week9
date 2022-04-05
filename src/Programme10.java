import java.util.Scanner;

/*
  * Write the programme that tell you which line pass through particular stations.
  * Just use Zone 1 stations name.
  * @param args
  */
 public class Programme10 {

 public static void main(String[] args) {
         String stations[][] = {{"Metropoliton", "Aldgate", "Liverpool St", "Moorgate", "Kings Cross", "Euston"},
         {"Northern Line", "Bank", "Moorgate", "Old Street", "Angel", "Kings Cross"},
         {"Victoria", "Kings Cross", "Euston", "Warren Steet", "Oxford Circus", "Green Park"}};
         String lines = ""; //variable to list all the lines passing through the destination
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the station you want to search:");
         String destination = scan.nextLine(); //Variable to get destination station

         for (int i = 0; i < 3; i++) { //First look to move through each row
         for (int j = 0; j < 6; j++) { //Second loop to move through each columns (stations in a row)
         if (destination.equals(stations[i][j])) {//To check if a line passes through the destination station
         if (!lines.isEmpty()) {
         lines = lines + ", "; //Putting comma is the list is not empty to add next line
         }
         lines = lines + stations[i][0];
         }
         }
         }
         if (lines.isEmpty())
         System.out.println("The station is not on any lines");
         else
         System.out.println(lines + " tube lines pass through " + destination);
         }
         }

