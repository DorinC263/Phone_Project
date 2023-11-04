public class Call {
    private Contact recipient;

    public Call(Contact recipient) {
        this.recipient = recipient;
    }

    public Contact getRecipient() {
        return recipient;
    }

    @Override
    public String toString() {
        return "Call recipient : " + recipient;
    }
}
