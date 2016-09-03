/*
 *2013-09-05
 *HW: Unit 2 Practice Assignment: Ch4 Debug Exercise 3
 *Bradley Forney
 *CIS 127
 *Professor: Craig Sharp
 * 
 * FixDebugBox class to instantiate two Box objects
 */

public class FixDebugBox
{
    public static void main(String[] args) {

       private int width;
       private int length;
       private int height;

    public FixDebugBox() {
         length = 1;
         width  = 1;
         height = 1;
       }

    public FixDebugBox(int widthx, int lengthy, int heightz)
       {
          width = widthx;
          length = lengthy;
          height = heightz;
       }

    public void showData()
       {
         System.out.println("Width: "  + width + "  Length: " +
         length + "  Height: " + height);
       }

    public double getVolume()
       {

           return (length * width * height);
       }
    }
