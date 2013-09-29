package dTunesStore.util;
//---------------------------------------------------------------------
import dTunesStore.dataStore.MusicInfo;
import java.util.Hashtable;
import java.util.Enumeration;
//---------------------------------------------------------------------
public class Results 
{
	Hashtable <String, MusicInfo> songList;

	/**
	*	The empty constructor for this class
	**/
	public Results()
	{
		songList = new Hashtable<String, MusicInfo>();
	}

	/**
	*	This method is used to display all of the song entries 
	*	 that are in the library.
	**/
	public void displayData()
	{
		//Makes an enum based on all the keys in the songList
		Enumeration keys = songList.keys();

		//Iterates through the keys and prints all entries out
		while(keys.hasMoreElements())
		{
			System.out.println(songList.get(keys.nextElement()));
		}
	}

}
