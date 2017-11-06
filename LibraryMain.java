
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LibraryMain {

    public static ArrayList<Books> Book = new ArrayList();
    public static ArrayList<IDs> LibrarianID = new ArrayList();
    public static ArrayList<IDs> PatronID = new ArrayList();

    public static void main(String[] args) {

        new LibraryGUI().setVisible(true);

        loadFile("books.txt", Book);
        loadFile2("librarian.txt",LibrarianID);
        loadFile3("patron.txt", PatronID);
        
    }//end main
    
    
    

    public static void loadFile(String filename, ArrayList <Books>tempList) {
        String temp = "";
        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));
            while (file.ready()) {
                temp = file.readLine();
                 //System.out.println(temp);
                String tempArray[] = temp.split(",");
                tempList.add(new Books(tempArray[0], tempArray[1], tempArray[2]));
                //System.out.println(Book.get(0).title);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        //System.out.println(tempList.get(2).title);
    }
    public static void loadFile2(String filename, ArrayList <IDs>tempList) {
        String temp = "";
        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));
            while (file.ready()) {
                temp = file.readLine();
                String tempArray[] = temp.split(",");
                tempList.add(new IDs(tempArray[0], Integer.parseInt(tempArray[1])));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void loadFile3(String filename, ArrayList <IDs>tempList) {
        String temp = "";
        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));
            while (file.ready()) {
                temp = file.readLine();
                String tempArray[] = temp.split(",");
                tempList.add(new IDs(tempArray[0], Integer.parseInt(tempArray[1])));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}//end class
