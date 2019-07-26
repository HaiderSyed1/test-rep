import java.util.*;
public class Main extends Toppings
 {

 
   public static void main(String [] args)
  
  {
       
	Toppings toppings = new Toppings();
 	//instansiate this object after you get info about pizza.

        Scanner scanner = new Scanner(System.in);
	int size;
	float total = 0;
	int type;
        int amt = 0;

        int topAmt = 0;

        Toppings [] list;

        System.out.println("Welcome to Pizza Planet");
	System.out.println("How many pizzas do you want");
	int pAmt = scanner.nextInt();
	
        //scanner into pAmt;

        list = new Toppings[pAmt];


        for(int i = 0; i < pAmt; i++)

        	{
            
		System.out.println("For pizza #" + (i+1) + " what size?");
		toppings.printSize();
		size = scanner.nextInt();
		System.out.println("What Type of crust?\n1. Regular\n2. Deep Dish?"); 
		type = scanner.nextInt();
		type-=1;
		System.out.println("How many toppings do you want? Dollar Each");
		topAmt = scanner.nextInt();
		toppings.printTop();
			for (int j = 0; j < topAmt; j++)
			{
				int choice = scanner.nextInt();
			}
		
	            //might need two variables to hold these values
 
          	Toppings temp = new Toppings(size,type);
  
          
		temp.setTopAmt(topAmt);
		list[i] = temp;
    
                }
   
		for(int i = 0; i < list.length; i++)
		{
			total += list[i].updateFinalCost();
		}     
		

       		System.out.println("Your final total is: $" + total);
       }
   
 }
