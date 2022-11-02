package playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class test {

	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Album> albums = new ArrayList<Album>();
	private static LinkedList<Song> playList = new LinkedList<>();
	private static ListIterator<Song> songsIterator = playList.listIterator();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		//1. Printing menu statements for User
//		mainMenu();
		
		
		//2. Get Input from User
		
		
		
		//3. Make condition as regards to userInput
		
		switch(mainMenu())
		{
		case 0:
			System.out.println("Printing playList songs");
			printingPlayList();
			mainMenu();
			break;
		case 1:
			System.out.println("Adding new song");
			addSongToPlayList();
			break;
		case 2:
			System.out.println("Forwarding song");
			break;
		case 3:
			System.out.println("skip backward");
			break;
		case 4:
			System.out.println("Replaying song");
			break;
		case 5:
			System.out.println("Quit");
			break;
		default:
			System.out.println("Invalid Input");
				
		}
		
		
		
		
	}
	
	
	private static int mainMenu()
	{
		System.out.println("Please Choose your input \n"
				+ "0 : List all songs in the playList \n"
				+ "1: Add new Song to the PlayList \n"
				+ "2: Forward Song \n"
				+ "3: Skip to previous song \n"
				+ "4: Replay the song \n"
				+ "5: Quit \n ");
		
		int userInput = sc.nextInt();
		return userInput;
	}
	private static void addSongToPlayList()
	{
		System.out.println("\n Enter Title for the song: ");
		String getTitle = sc.next();
		
		System.out.println(" \n Enter duration for the song: ");
		String getDuration = sc.next();
		
		System.out.println(" \n Enter the name of Album");
		String getAlbumName = sc.next();
		
		Song newSong = new Song(getTitle, getDuration);
		
		Album newAlbum = new Album(getAlbumName,newSong);
		
		if(albums.add(newAlbum))
		{
			if(playList.add(newSong))
			{
				System.out.println("Song successfull added to playList");
			}
			
		}else {
			System.out.println("Song not added!!");
		}
		mainMenu();
	}
	

	
	private static void printingPlayList()
	{
		System.out.println("Its working");
		int i = 0;
		while(songsIterator.hasNext())
		{
			i++;
			
			System.out.println(i + " " + songsIterator.next().getTitle());
		}
	}
}