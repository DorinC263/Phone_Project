import java.util.ArrayList;
import java.util.List;
class Phone {
    private String manufacturer;
    private String model;
    private int batteryLife;
    private String color;
    private String material;
    private List<Contact> contacts = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();
    private List<Call> calls = new ArrayList<>();

    public Phone(String manufacturer, String model, int batteryLife, String color, String material) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
    }

    public void createContact(String name, String phoneNumber) {
        contacts.add(new Contact(name, phoneNumber));
    }

    public List<Contact> viewContacts() {
        return contacts;
    }

    public String sendTextMessage(int contactIndex, String message) {
        if (message.length() > 500) {
            return "Message too long";
        }

        if (batteryLife >= 1) {
            batteryLife -= 1;
            Contact recipient = contacts.get(contactIndex);
            messages.add(new Message(recipient, message));
            return "Message sent";
        } else {
            return "Not enough battery to send a message";
        }
    }

    public List<Message> viewMessages(int contactIndex) {
        Contact recipient = contacts.get(contactIndex);
        List<Message> recipientMessages = new ArrayList<>();
        for (Message message : messages) {
            if (message.getRecipient().equals(recipient)) {
                recipientMessages.add(message);
            }
        }
        return recipientMessages;
    }

    public String makeCall(int contactIndex) {
        if (batteryLife >= 2) {
            Contact recipient = contacts.get(contactIndex);
            calls.add(new Call(recipient));
            batteryLife -= 2;
            return "Call made";
        } else {
            return "Not enough battery to make a call";
        }
    }

    public List<Call> viewCallHistory() {
        return calls;
    }
}