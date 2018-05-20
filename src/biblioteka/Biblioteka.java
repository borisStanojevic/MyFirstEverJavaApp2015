package biblioteka;
/*Program treba da sadrži tri klase:
UI – U ovoj klasi će biti preuziman korisnički ulaz i na osnovu njega biti vraćan određeni razultat. Na primer, klasa može imati metod: mainMenu() koji će na izlazu ispisati glavni meni i uzeti od korisnika odabranu stavku
Library – klasa koja se bavi knjigama. Treba da sadrži listu knjiga (kolekcija objekata klase Book), kao i elementarne metode za rad sa knjigama
Book – Klasa predstavlja knjigu u sistemu. Mora da ima podatke o autoru, naslovu i isbn-u
*/
public class Biblioteka {
    
    public static void main(String[] args) {
       
       UI ui = new UI();
       ui.mainMenu();
      
       
    }
    
}