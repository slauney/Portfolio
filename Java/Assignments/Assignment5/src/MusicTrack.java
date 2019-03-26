/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Description!
//In this program, we will be creating contructors, stubs, and booleans which we will
//test with the program MusicTrackTester.java

/**
 *
 * @author zach slaunwhite (A00385522)
 */
public class MusicTrack {

    //constants
    private String artist1;
    private String title1;
    private String album1;
    private int length1;
    private int track1;
    private int year1;

    public MusicTrack(String artist, String title, String album,
            int length, int track, int year) {

        artist1 = artist;
        title1 = title;
        album1 = album;
        length1 = length;
        track1 = track;
        year1 = year;

        //checking if the values are out of range, and sets = 0 if invalid
        if (length < 0) {
            length1 = 0;
        }
        if (track < 0) {
            track1 = 0;
        }
        if (year < 0) {
            year1 = 0;
        }

    }

    //creating all the getters
    public String getArtist() {
        return artist1;

    }

    public String getTitle() {
        return title1;
    }

    public String getAlbum() {
        return album1;
    }

    public int getLength() {
        return length1;
    }

    public int getTrack() {
        return track1;
    }

    public int getYear() {
        return year1;
    }

    //setting all the setters
    public void setArtist(String newArtist) {
        this.artist1 = newArtist;
    }

    public void setTitle(String newTitle) {
        this.title1 = newTitle;
    }

    public void setAlbum(String newAlbum) {
        this.album1 = newAlbum;
    }

    public void setLength(int newLength) {
        if (newLength >= 0) {
            this.length1 = newLength;
        }
    }

    public void setTrack(int newTrack) {
        if (newTrack >= 0) {
            this.track1 = newTrack;
        }
    }

    public void setYear(int newYear) {
        if (newYear >= 0) {
            this.year1 = newYear;
        }
    }

    //printing info
    public void printInfo() {
        System.out.println("---- Track information ----");
        System.out.println("Artist    :  " + artist1);
        System.out.println("Title     :  " + title1);
        System.out.println("Album     :  " + album1);
        System.out.println("Length    :  " + length1);
        System.out.println("Track     :  " + track1);
        System.out.println("Year      :  " + year1);
    }

    //checking if the album is the same
    boolean isOnTheSameAlbum(MusicTrack mt4) {
        return this.album1.equals(mt4.album1) && this.artist1.equals(mt4.artist1) && this.year1 == mt4.year1;

    }

    
}
