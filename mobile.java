package week1.day1;

public class mobile {
	public void lock() {
		System.out.println("lock the phone");
	}
	public void  call () {
		System.out.println("phonecall");
	}
	public void password() {
		System.out.println("password");
	}
	public void camera() {
		System.out.println("camera");
		
	}
		    public void gaming() {
			System.out.println("gaming");
				
		}
			public void message() {
				System.out.println("message");
			}
				
			public void document() {
				System.out.println("document");
			}
	public static void main(String[] args) {
		mobile realme=new mobile();
		realme.lock();
		realme.call();
		realme.password();
		realme.camera();
		realme.gaming();
		realme.message();
		realme.document();
		
		

	}

}
