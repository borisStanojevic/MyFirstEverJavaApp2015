package biblioteka;
import java.util.Scanner;


public class UI {
    
    Library lib = new Library();
    
    public void mainMenu(){
    Scanner input = new Scanner(System.in);
    try{
    program:   
    while (true){
    System.out.println("Odaberite opciju :");
    System.out.println(" 1 : Dodavanje knjige.");
    System.out.println(" 2 : Izlistavanje svih knjiga.");
    System.out.println(" 3 : Brisanje odredjene knjige.");
    System.out.println(" 0 : Izlazak iz aplikacije.");
          
    int choice = input.nextInt();
    
    if(choice == 1){
            lib.dodaj();
            System.out.println("Da li zelite da nastavite Da/Ne :");
            String response = input.next();
            if(response.equals("Da") || response.equals("da") || response.equals("dA") || response.equals("DA"))
                continue;
            else 
                 break program;
                   }
    else
        if(choice == 2){
            lib.izlistaj();
            System.out.println("Da li zelite da nastavite Da/Ne :");
            String response = input.next();
            if(response.equals("Da") || response.equals("da") || response.equals("dA") || response.equals("DA"))
                continue;
            else 
                 break program;
        }
                        
    else 
            if(choice == 3){
            lib.ukloni();
            System.out.println("Da li zelite da nastavite Da/Ne :");
            String response = input.next();
            if(response.equals("Da") || response.equals("da") || response.equals("dA") || response.equals("DA"))
                continue;
            else 
                 break program;
        }
            
    else 
            if(choice == 0){
            break program;
                               }
    else
            System.out.println(" Zatrazili ste nepostojecu opciju ! ");
    }
    }
    catch (Exception exc){
            System.out.println(exc);
            
            }
  
    }
    }
