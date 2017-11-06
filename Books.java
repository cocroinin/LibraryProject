
public class Books {
    
    public String Title;
    public String item;
    public String Genre;
    static boolean isCheckedOut = false;
    
    public Books (String t, String i, String g){
    
        Title = t;
        item = i;
        Genre = g;
    }
    
    
     public void setBookTitle(String title){
        Title = title;
    }
    
    public void setBookGenre(String genre){
        Genre = genre;
    }
    
    public String getBookTitle(){
        return Title;
    }
    
    public String getBookGenre(){
        return Genre;
    }
    
    
}
