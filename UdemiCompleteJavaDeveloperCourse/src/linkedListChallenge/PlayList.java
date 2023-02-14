package linkedListChallenge;

import java.util.LinkedList;
import java.util.ListIterator;

public class PlayList {
    private static boolean addToPlaylist(LinkedList linkedList, String songToPlayList) {
        ListIterator <String> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            int comparison = iterator.next().compareTo(songToPlayList);
            if (comparison == 0) {
                System.out.println(songToPlayList + " son is already added!");
                return false;
            } else  {
                linkedList.add(songToPlayList);
            }
        }
        iterator.add(songToPlayList);
        return  true;
    }

    public static void play(LinkedList songs) {
        ListIterator<String> listIterator = songs.listIterator();
        if (songs.isEmpty()) {
            System.out.println("No songs in a play list.");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next());
            Menu.printMenu();
        }
    }
}
