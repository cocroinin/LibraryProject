
public class IDs {

    static public String name;
    static public int id;
    static public boolean isLibrarian = false;

    public IDs(String n, int ids) {
        name = n;
        id = ids;
    }
    public void setBookTitle(String n){
        name = n;
    }
    
    public void setBookGenre(int ids){
        id = ids;
    }
    
    public String getBookTitle(){
        return name;
    }
    
    public int getBookGenre(){
        return id;
    }
}
