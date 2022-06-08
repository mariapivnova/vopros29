
public class Main {

    public static void main(String[] args) {
Book B=new Book("War and Peace",TYPE.BELLETRE,"L.TOLSTOY");
System.out.println(B);
switch (B.BookType){
    case BELLETRE: System.out.println("Belletre");
    break;
}
switch (B.BookType){
    case SCIENCE : System.out.println("Science");
    break;
}
switch (B.BookType){
    case PHANTASY: System.out.println("Phantasy");
    break;
        }
    }

}
enum TYPE{
    SCIENCE,BELLETRE,PHANTASY;
}
class Book{
    String title;
    TYPE BookType;
    String Autor;

    Book(String title,TYPE BookType,String Autor){
        this.title=title;
        this.BookType=BookType;
        this.Autor=Autor;
    }
}