public class DebugCustomerMakingPurchase extends DebugCustomer
{
    private double amountOfPurchase;
    private boolean overLimit;


    public DebugCustomerMakingPurchase(int id,
       String name, double credit, double purchase)
    {
        super(id, name,credit);
        amountOfPurchase = purchase;

       if(amountOfPurchase > creditLimit)
          overLimit = true;
       else
          overLimit = false;
        purchDisplay();

    }


    public void purchDisplay()
    {
       System.out.println("Purchase amount $" + amountOfPurchase);

       if(overLimit)
          System.out.println("****Credit denied - customer over limit");
       else
          System.out.println("Purchase Okay");
        display();
    }
}
