public class DebugMusical extends DebugPlay
{
   protected String composer;

   public DebugMusical(String title, String author, String comp)
   {
      super(title, author);
       comp = comp;
   }

   public void display()
   {
      System.out.println("The performance is "+ title +
        " by " + author + "\nThe music for " + title +
        " is by " + composer);
   }
}