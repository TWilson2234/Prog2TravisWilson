public class DebugPlay
{
   public String title;
   public String author;

    public DebugPlay(String title, String author) //Constructor
   {
       title = title;
      author = author;
   }

    public void display()
   {
      System.out.println("The performance is " + title +
        " by " + author);
   }
}