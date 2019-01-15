import java.util.*;
class VideoStoreLauncher
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		VideoStore object=new VideoStore();
		 while(true)
		 {      
                        System.out.println(" Welcome to Video Rental Inventory System:");
                        System.out.println("--------------------------------------------------------");
			System.out.println(" 1.Add Video in the Inventory::");
			System.out.println(" 2.Rent Video in the Inventory::");
			System.out.println(" 3.Return Video in the Inventory::");
			System.out.println(" 4.Rate Video in the Inventory::");
			System.out.println(" 5. Videos in the Inventory::");
                        System.out.println("Enter Your Choice::");
			int option=sc.nextInt();
			String title;
			switch(option)
			{
				case 1:
				       System.out.println("Enter the title of the video::");
					   title=sc.nextLine();
                                           title=sc.nextLine();
					   object.addVideo(title);
					   break;
					   
				case 2:
				       System.out.println("Enter the title of the video::");
					   title=sc.nextLine();
					   title=sc.nextLine();
					   object.checkOut(title);
					   break;
					   
				case 3:
				       System.out.println("Enter the title of the video::");
					   title=sc.nextLine();
                                           title=sc.nextLine();
					   object.returnVideo(title);
					   break;
					   
				case 4:
				       System.out.println("Enter the title of the video::");
					   title=sc.nextLine();
                                           title=sc.nextLine();
					   int rate=-1;
					   while(rate<0||rate>5)
					   {
					   System.out.println("Rate the video between 0 and 5");
					   rate=sc.nextInt();
					   }
					   object.receiveRating(title,rate);
					   break;
			    case 5:
				       
					   object.ListInventory();
					   break;
				default:
				       System.out.println("Invalid Option");
					   return;
					   
			}
		 }		   
			
			
		}
	}
