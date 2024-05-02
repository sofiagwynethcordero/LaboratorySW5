package PhoneSeatwork;

public class Samsung implements PhoneMessage, PhoneCall, Browser, Camera{
    @Override
    public void makeCalls(String number) {
        System.out.println("Samsung is calling this number " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Samsung is sending a message " + message + " to this number " + number);
    }


    @Override
    public void browseWeb(String url) {
        System.out.println("Samsung is brrowsing on the " + url);
    }

    @Override
    public void takePicture() {
        System.out.println("Samsung is taking a photo");
    }
}
