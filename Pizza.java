 public class Pizza implements Interface
{

	private float baseCost;

        private int deepDish;
 
        private SIZE size;


 enum SIZE
  
  {
small,medium,large;
}
  
 public Pizza()
 
 {

	baseCost = 5;

 	size = SIZE.small;
 
	deepDish = 0;

 }
    

public void printSize()
{
	System.out.println("1. Small is 5\n2. Medium is 6\n3.Large is 7\n");
	System.out.println("Enter 1, 2, or 3 to choose");
	
}
public Pizza(int s, int dd)
    
 {
        
	baseCost = 5;

        setSize(s);

        //deepDish = dd;

	setType(dd);
 }
    public void setSize(int s)
  

 {
    switch (s)
       
      {

	case 1:
  return;

	case 2:
  size = SIZE.medium;

        baseCost += 1;

        case 3:
  size = SIZE.large;

        baseCost += 2;

       }
   
 }
    

public void setType(int t)
  
 {
      
	deepDish = t;
  
	if (t == 1)
	{
	baseCost+=1;
  	}
 }
 
  
public float getTotal()
  
  {
    
        return baseCost;
 
   
 }

}
