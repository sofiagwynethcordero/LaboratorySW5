package PhoneSeatwork;

public class Main {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        Samsung samsung = new Samsung();
        Iphone iphone = new Iphone();


        System.out.println();

        System.out.println("Basic Phone's Information:");
        basicPhone.makeCalls("09123456789");
        basicPhone.sendSMS("09987456321", "'Hello!'");
        
        System.out.println();

        System.out.println("Samsung's Information:");
        samsung.makeCalls("09741852963");
        samsung.sendSMS("09369852147", "'I'm at your house!'");
        samsung.browseWeb("www.youtube.com");
        samsung.takePicture();

        System.out.println();

        System.out.println("Iphone's Information:");
        iphone.makeCalls("09987123654");
        iphone.sendSMS("09321789456", "'What's your ETA?'");
        iphone.browseWeb("www.instagram.com");
        iphone.takePicture();
    
    }
}

