package PhoneSeatwork;

public class Iphone implements PhoneMessage, PhoneCall, Browser, Camera{
    @Override
    public void makeCalls(String number) {
        System.out.println("IPhone is Calling this number " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Iphone is sending a message " + message + " to this number " + number);
    }


    @Override
    public void browseWeb(String url) {
        System.out.println("IPhone is browsing on the " + url);
    }

    @Override
    public void takePicture() {
        System.out.println("IPhone is taking a photo");
    }
}

