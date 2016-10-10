import javax.swing.*;
public class DebugPhoneBook extends DebugBook
{
   private int area;
   private String size;
   private final int CUTOFF = 30;
   DebugPhoneBook(int pages, String area)
   {
      //super(pages, area);

      if(pages < CUTOFF)
         size = "big";
      else
         size = "small";
   }
   public void display()
   {
      JOptionPane.showMessageDialog(null,"The phone book for " + area +
         " has " + pages + " pages.\nThat is a " +
         size + " phone book."); 
   }
}