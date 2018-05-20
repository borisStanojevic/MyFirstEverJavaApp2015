package biblioteka;
import java.util.ArrayList;
import java.util.Scanner;
public class Library {
    
    public static ArrayList booksList = new ArrayList();
    

    
    public  void dodaj(){
            System.out.println("Unesite naziv,ime autora i ISBN :");
            Book book = new Book();
            Scanner input = new Scanner(System.in);
            
            book.title = input.nextLine();
            book.author = input.nextLine();
            book.isbn = input.nextLine();
            
            booksList.add(book);
    }
    
    public void izlistaj(){
        
        System.out.println("Lista knjiga u biblioteci :");
        for (Object value : booksList) {
            System.out.println(value);
            
        }
    }
    
    public void ukloni(){
        try{
            System.out.println(" Unesite indeks knjige : ");
            Scanner input = new Scanner(System.in);
            int indeks = input.nextInt();
            System.out.println("Knjiga" + " " + booksList.get(indeks) + " " + "je izbrisana.");
            booksList.remove(indeks);
    }
        catch(IndexOutOfBoundsException iob){
            System.out.println(iob);
        }
    }
}
