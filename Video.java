import java.util.*;
class Video
  {
     String title;
	 int flag;
	 double rating;
	 int i;
	 Video(String title)
	 {
		 this.title=title;
		 flag=0;
		 i=0;
		 rating=0.0d;
	 }
	 
	 void beingCheckedOut()
	 {
		   if(flag==1)
		   {
			   System.out.println("The video is currently with another Customer::");
			   return;
		   }
		   flag=1;
		   System.out.println("Dear Customer,"+title+" has been successfully checked out::");
		   
	 }
	 
	 void beingReturned()
	 {
		   if(flag==0)
		   {
			   System.out.println("This is not our video and we cannot accept it!");
			   return;
		   }
		   flag=0;
		   System.out.println("Dear Customer,"+title+"has been successfully returned");
	 }
	 
	 void receiveRatings(int Current)
	 {
		 i++;
		  rating=((rating*(i-1)+Current)/i);
	 }
  }