package excersice1;
import java.util.*;

public class Books
{
    static String FavoriteBook[]=new String[5];

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String bookName;
        for(int i=0;i<5;i++)
        {
            bookName=scan.nextLine();
            if(addFavoriteBook(bookName))

                FavoriteBook[i]=bookName;

        }
        System.out.println("Favorite Books:");
        printFavoriteBooks();
    }

    public static Boolean addFavoriteBook(String bookName)
    {
        if(bookName.contains("Great"))
        {


            return  false ;
        }

        return true;


    }
    public static void printFavoriteBooks()
    {

        for(int i=0;i<FavoriteBook.length;i++)
        {
            if(FavoriteBook[i]!=null)

                System.out.println(FavoriteBook[i]);
        }


    }

}

