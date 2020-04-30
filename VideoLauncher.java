import java.util.Scanner;

class Video
{
	String videoName;
	boolean checkout;
	int rating;
	Video()
	{
		
	}

	Video(String name)
	{
		videoName=name;
	
	}
	
	String getName()
	{
		return videoName;
	}
	

	void doCheckout()
	{
		checkout=true;
	}
	void doReturn()
	{
		checkout=false;
	}
	void receiveRating(int rating)
	{
		this.rating=rating;
	}
	int getRating()
	{
		return rating;
	}
	boolean getCheckout()
	{
		return checkout;
	}
}

	
	
	
class VideoStore extends Video
{
	int i=0;
	
	
		
	Video[] store=new Video[10];
	VideoStore()
	{
		 
	}
	void addVideo(String name)
	{    
		if(i<store.length)
		{
			
		store[i]= new  Video();
		 store[i].videoName=name;
		System.out.println("video "+name+" added succesfully");
	
		i++;
		}
		else
			System.out.println("memory full");
		
	
		
	}
	void doCheckout(String name)
	{int t=0;
		
		for(int j=0;j<i;j++)
		{
			if(store[j].videoName.equals(name))
			{
            store[j].checkout=true;
			System.out.println("video "+name+" checked out successfully");
			t=5;
			}
		}
		if(t!=5)
			System.out.println(name+" video not found in system");
	}
		
	
	void doReturn(String name)
	{
		int n=0;
		for(int j=0;j<i;j++)
		{
			if(store[j].videoName.equals(name)) 
			{
				store[j].checkout=false;
				System.out.println("video "+name+" returned successfully");
				 n=5;
				
			}
			
				
		}
		if(n!=5)
			System.out.println("video "+name+" not found:::");
	}
	void receiveRating(String name,int rating)
	{
		int m=0;
		for(int j=0;j<i;j++)
		{
		
			if(store[j].videoName.equals(name))
			{
				store[j].rating=rating;
				System.out.println("rating"+rating+" has been mapped to the video "+name);
				m=5;
			}
		}
		if(m!=5)
			System.out.println(name+" does not exist in system");
	}
	void listInventory()
	{
		if(i==0)
		{
			System.out.println("List is empty.......");
		}
		else
		{
		System.out.println("video name    "+"checkout status   "+"rating ");
		for(int j=0;j<i;j++)
		{
	    System.out.println(store[j].videoName+"          "+store[j].checkout+"          "+store[j].rating);
		}
		}
		
	}
}
		

		
public class VideoLauncher extends VideoStore {

	public static void main(String[] args) 
	{  
		
		VideoStore vs=new VideoStore();
		
		
		while(true) {
		System.out.println("main menu");
		System.out.println("1.add video");
		System.out.println("2.check out video");
		System.out.println("3.return video");
		System.out.println("4.receive rating:");
		System.out.println("5.list inventory:");
		System.out.println("6.exit");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String str=new String();
		switch(num)
		{
		case 1:System.out.println("enter the name of video you want to add:");
		 str=sc.next();
		 
		 vs.addVideo(str);
		 break;
		case 2:System.out.println("enter the name of the video you want to check out");
		str=sc.next();
		vs.doCheckout(str);
		break;
		case 3:System.out.println("enter the name you want to return");
		str=sc.next();
		vs.doReturn(str);
			break;
		case 4:System.out.println("enter the name of video you want to rate:");
		str=sc.next();
		System.out.println("enter rating for video "+str);
		int rating=sc.nextInt();
		vs.receiveRating(str, rating);
		break;
		case 5:vs.listInventory();
			break;
		case 6:System.out.println("exiting....thanks for using application");
		System.exit(0);
		break;
		default:System.out.println("wrong choice........");
		}
		
		
	}
	}
}
		
	
		
		
		

	


