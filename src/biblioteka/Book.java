package biblioteka;
public class Book {
    
    public String author;
    public String title;
    public String isbn;
    
    @Override
    public String toString(){
        return  this.title + ' '  + this.author + ' ' + this.isbn;
     }
}