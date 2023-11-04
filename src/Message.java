public class Message {
    private Contact recipient;
    private String message;

    public Message(Contact recipient, String message){
        this.recipient = recipient;
        this.message = message;
    }
    public Contact getRecipient(){
        return recipient;
    }
    public String getMessage(){
        return message;
    }

    @Override
    public String toString() {
        return "Recipient: "+ recipient.getName() + ", Message: "+ message;
    }
}
