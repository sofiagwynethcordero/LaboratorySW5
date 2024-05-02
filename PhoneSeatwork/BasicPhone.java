package PhoneSeatwork;

public class BasicPhone implements PhoneMessage, PhoneCall{
    @Override
    public void makeCalls(String number) {
        System.out.println("Basic Phone is Calling this number " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Basic phone is sending a message " + message + " to this number " + number);
    }
}
