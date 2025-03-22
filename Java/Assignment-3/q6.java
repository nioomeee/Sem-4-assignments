// Create a class name Book that contains data fields for the title and number of pages.
// Include get and set methods for these fields. Next, create a subclass named Textbook,
// which contains an additional field that holds a grade level for the Textbook and
// additional methods to get and set grade level field. Write an application that
// demonstrates using objects of each class.
class Book {
    String title;
    int no;

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return no;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setPages(int n) {
        no = n;
    }
}

class Textbook extends Book {
    private int gradeLevel;

    public int getGrade() {
        return gradeLevel;
    }

    public void setGrade(int g) {
        gradeLevel = g;
    }
}

public class q6 {
    public static void main(String[] args) {
        Book book = new Book();

        book.setTitle("How to Kill a Mockingbird");

        book.setPages(800);

        Textbook tb = new Textbook();
        tb.setTitle("Love Hypothesis");
        tb.setPages(565);
        tb.setGrade(12);
        
        System.out.println("\nFor book: ");
        System.out.println("Book title = " + book.getTitle());
        System.out.println("Book Pages = " + book.getPages());
        
        System.out.println("\nFor textbook: ");
        System.out.println("Textbook title = " + tb.getTitle());
        System.out.println("Textbook Pages = " + tb.getPages());
        System.out.println("Textbook Grade = " + tb.getGrade());
        
    } 
}
