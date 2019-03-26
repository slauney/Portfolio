
import java.util.Scanner;

/**
 * A driver for the MusicTrack class. You can use it to test your implementation
 * of the MusicTrack class.
 * 
 *
 * @author yasushi akiyama
 */
public class MusicTrackTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //scanner object
        Scanner kbd = new Scanner(System.in);

        
        System.out.println("\n\nThis is a driver program to test the implementation"
                + " of MusicTrack class\n\n");
        
        
        //pause
        System.out.print("Press enter to continue...");
        kbd.nextLine();

        
//        //============================================================
//        // This sectin of the code tests the contructor and getters.
//        //============================================================
        System.out.println("\n\n=================\n"
                + "Testing the constructor and getters\n");

        //first create a bunch of them
        MusicTrack mt1 = new MusicTrack("John Coltrane",
                "Moment's Notice",
                "Blue Train",
                550, 2, 1957);

        //with invalid values
        MusicTrack mt2 = new MusicTrack("John Coltrane",
                "Lazy Bird",
                "Blue Train",
                -30, -9, 2030);

        MusicTrack mt3 = new MusicTrack("no name",
                "no track",
                "no album",
                100, 100, 100);
        
        
//   /*************       (The end of Activity 3)     ********************/
        
        

//        //Testing constructor and getters
//        
        System.out.println(mt2.getArtist()+ " (Should print \"John Coltrane\")");
        System.out.println(mt2.getTitle() + " (Should print \"Lazy Bird\")");
        System.out.println(mt2.getAlbum() + " (Should print \"Blue Train\")");
        System.out.println(mt2.getLength() + " (Should print \"0\")");
        System.out.println(mt2.getTrack() + " (Should print \"0\")");
        System.out.println(mt2.getYear() + " (Should print \"0\")");

        //pause
        System.out.print("\n\nPress enter to continue...");
        kbd.nextLine();
        
        
//   /*************       (The end of Activity 4)     ********************/
        

//        //============================================================
//        // This sectin of the code tests the setters.
//        //============================================================
        System.out.println("\n\n=================\n"
                + "Now testing the setters\n");
        mt3.setArtist("Sonny Stitt");
        mt3.setTitle("On the Sunny Side of the Street");
        mt3.setAlbum("Sonny Side Up");
        mt3.setLength(-9);//invalid value should not change the currnet value
        mt3.setTrack(-9);//invalid value should not change the currnet value
        mt3.setYear(-9);//invalid value should not change the currnet value

        System.out.println(mt3.getArtist() +" (Should print \"Sonny Stitt\")");
        System.out.println(mt3.getTitle() 
                      + " (Should print \"On the Sunny Side of the Street\")");
        System.out.println(mt3.getAlbum() + " (Should print \"Sonny Side Up\")");
        System.out.println(mt3.getLength() +" (Should print \"100\")");
        System.out.println(mt3.getTrack() +" (Should print \"100\")");
        System.out.println(mt3.getYear() + " (Should print \"100\")");

        System.out.println("\n... now trying valid values");
        mt2.setLength(430);//it should now change the value
        mt2.setTrack(5);////it should now change the value
        mt2.setYear(1957);////it should now change the value
        System.out.println(mt2.getLength() + " (Should print \"430\")" );
        System.out.println(mt2.getTrack() + " (Should print \"5\")");
        System.out.println(mt2.getYear() + " (Should print \"1957\")");

        //pause
        System.out.print("\n\nPress enter to continue...");
        kbd.nextLine();


//   /*************       (The end of Activity 5)     ********************/



//        //============================================================
//        // This sectin of the code tests the printInfo() method.
//        //============================================================
        System.out.println("\n\n=================\n"
                + "Now testing printInfo() method\n");
        System.out.println("It should print below the star line:\n");
        System.out.println("---- Track information ----\n"
                + "Artist    :  John Coltrane\n"
                + "Title     :  Moment's Notice\n"
                + "Album     :  Blue Train\n"
                + "Length    :  550\n"
                + "Track #   :  2\n"
                + "Year      :  1957");
        System.out.println("\n*********** (Your output below) ************\n");
        mt1.printInfo();

        //pause
        System.out.print("\n\nPress enter to continue...");
        kbd.nextLine();
//
//        
//        
//        
//        //============================================================
//        // This sectin of the code tests the isOnTheSameAlbum() method.
//        //============================================================
        MusicTrack mt4 = new MusicTrack("Ravi Coltrane",
                "Locomotion",
                "Blue Train (remastered)",
                434, 3, 2003);

        System.out.println("\n\n=================\n"
                + "Now testing isOnTheSameAlbum() method\n");
        
        System.out.print("They are ");
        if (!mt1.isOnTheSameAlbum(mt4)) {
            System.out.print("NOT ");
        }
        System.out.println("on the same album. "
                + "(They are NOT on the same track)\n");
        
        //change only the artist
        mt4.setArtist(mt1.getArtist());
        System.out.print("They are ");
        if (!mt1.isOnTheSameAlbum(mt4)) {
            System.out.print("NOT ");
        }
        System.out.println("on the same album. "
                + "(They are NOT on the same track)\n");

        //change only the album name
        mt4.setAlbum(mt1.getAlbum());
        System.out.print("They are ");
        if (!mt1.isOnTheSameAlbum(mt4)) {
            System.out.print("NOT ");
        }
        System.out.println("on the same album. "
                + "(They are NOT on the same track)\n");
        
        
        //change the year released
        mt4.setYear(mt1.getYear());
        System.out.print("They are ");
        if (!mt1.isOnTheSameAlbum(mt4)) {
            System.out.print("NOT ");
        }
        System.out.println("on the same album. "
                + "(They ARE on the same track)\n");
        
 
    }

}
