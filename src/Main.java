import java.util.ArrayList;

abstract class Book{
    private String title;
    private String author;
    private String category;
    public Book(String title, String author, String category){
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }
    public String getCategory(){
        return category;
    }

   abstract void category();

     public String tostring(){
         return "tytuł:"+title +"autor: "+ author+"kategoria: "+category;
     }


}
interface Readble{
    public void read(String title);

}
class Fancy extends Book implements Readble{
    public Fancy(String title, String author, String category){
        super(title, author, category);
    }
    public void category(){
        System.out.println("Fancy");
    }
    public void read(String title){


    }
}
class Sience extends Book implements Readble{
    public Sience(String title, String author, String category){
        super(title, author, category);
    }
    public void category(){
        System.out.println("Nauka");
    }
    public void read(String title){}
}




public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Fancy("wiedżmin  ", "  Andrzej sapkowski  ","fancy"));
        books.add(new Sience("krotka  historia czasu  ", "  Stephen Hawking  ","Nauka"));
        books.add(new Fancy("Harry Potter  ", "  J.K. Rowling  ","fancy"));
        for (Book book : books) {
            System.out.println(book.tostring());

        }
        System.out.println();
        System.out.println();

        for (int i=0; i<books.size(); i++) {
            System.out.println("czytasz: "+books.get(i).getTitle());
        }
    }

}

