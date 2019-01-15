import java.util.*;
class VideoStore
{
	Video object[]=new Video[10];
	int i=0;
	void addVideo(String title)
	{   
	    
		if(i==10)
		{
			System.out.println("Inventory is Full:-(");
			return;
		}
		for(int j=0;j<i;j++)
		{
			  if(title.equalsIgnoreCase(object[j].title))
			  {
				  System.out.println("Video is already present in the Inventory ");
				  return;
			  }
		}
		
		object[i++]=new Video(title);
	}
	
	void checkOut(String title)
	{
		for(int j=0;j<i;j++)
		{
			if(title.equalsIgnoreCase(object[j].title))
			{
				object[j].beingCheckedOut();
				return;
			}
		}
		System.out.println("Sorry!This video is not in the Inventory:");
	}
	
	void returnVideo(String title)
	{
		Scanner sc=new Scanner(System.in);
		for(int j=0;j<i;j++)
		{
			if(title.equalsIgnoreCase(object[j].title) && object[j].flag==1)
			{
				object[j].beingReturned();
				int rate=-1;
				while(rate<0||rate>5)
				{
				   System.out.println("Rate the video between 0 and 5");
				   rate=sc.nextInt();
				}
				receiveRating(title,rate);
				return;
			}
		}
		System.out.println("Sorry!This is not our video:");
		
	}
	
	void receiveRating(String title,int rating)
	{
		for(int j=0;j<i;j++)
		{
			if(title.equalsIgnoreCase(object[j].title))
			{
				object[j].receiveRatings(rating);
				return;
			}
		}
		System.out.println("This is not our Video!");
	}
	
	void ListInventory()
	{
		if(i==0)
		{
			System.out.println("Sorry!The Inventory is Empty!");
			return;
		}
		System.out.println("-----------------------------------The List is-----------------------------------");
		System.out.println("___________________________________________________________________________________");
		System.out.format("%-45s%s%45s","      Title","Customer Rating","      Status     \n|");
		System.out.println("__________________________________________________________________________________________");
		for(int j=0;j<i;j++)
		{
			  if(object[j].i==0)
			  {
				  if(object[j].flag==0)
				  {      
					  System.out.format("%-45s%s%45s","      "+object[j].title,"NA ","Present\n");
				      System.out.printl("________________________________________________________________________________________");
                                          
				  }
				  else
				  {
					  System.out.format("%-45s%s%45s","      "+object[j].title,"NA ","Rented\n");
				     System.out.println("_________________________________________________________________________________________");
				  }
			  }
			  else
			  {
				  if(object[j].flag==0)
				  {
					  System.out.format("%-45s%s%45s","      "+object[j].title,object[j].rating,"Present\n");
				      System.out.println("__________________________________________________________________________________________");
				  }
				  else
				  {
					  System.out.format("%-45s%s%45s","      "+object[j].title,object[j].rating,"Rented\n");
				      System.out.println("__________________________________________________________________________________________");
				  }
			  }
		}
		System.out.println("---------------------------Thank You:-)------------------------------------");
	}
}