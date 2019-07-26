
public class Toppings extends Pizza
{
 
   private String[] topList;
   private int headCount;
    
   private float total;
   
   private Pizza p;


   public Toppings()
    
	{

     		topList = new String[] {"Olives","Pineapple","Mushrooms","Bell Pepper","Jalapenos"};

   
     }
 
   public Toppings(int s, int dd)
   {

   topList = new String[] {"Olives","Pineapple","Mushrooms","Bell Pepper","Jalapenos"};

   p = new Pizza(s, dd);
   
	}
    
public void printTop()
   
{
   
     for (int i = 0; i < topList.length; i++)	
	{
		System.out.println((i+1)+") "+ topList[i] );
	} 
}
 
   public void setTopAmt(int amount)
   
	{

        	headCount = amount;
    
	}

   public float updateFinalCost()
    {

        total = headCount + p.getTotal();
 
	return total;   
	}

}