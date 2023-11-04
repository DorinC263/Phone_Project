public class Main {
    public static void main(String[] args) {
        Samsung galaxyA24 = new Samsung("GalaxyA24", 70,"Gold","Plastic","351360042191513");
        Samsung galaxyUltra22 = new Samsung("GalaxyUltra22",66,"Black","Titanium","532523523423432");
        Iphone iPhone12 = new Iphone("iPhone12",44,"Gold","Plastic","4332342343244");
        Iphone iPhone15 = new Iphone("iPhone15",66,"Black","Plastic","4124123123412");

        galaxyA24.createContact("Cristi","523-665-9989");
        galaxyA24.createContact("Alex","445-654-7757");
        galaxyA24.createContact("Maria","788-654-6445");

        galaxyUltra22.createContact("Michelle","655-776-3343");
        galaxyUltra22.createContact("Bob","665-345-2311");
        galaxyUltra22.createContact("Alexandra","565-776-8865");

        iPhone12.createContact("Nick","444-656-7645");
        iPhone12.createContact("Michael","231-612-3221");
        iPhone12.createContact("Nicu","421-616-1235");

        iPhone15.createContact("Ana","889-512-1233");
        iPhone15.createContact("Paul","419-122-1537");
        iPhone15.createContact("Cristina","812-332-1255");

        System.out.println(galaxyA24.sendTextMessage(0,"Hello Cristi, how is your day going?"));
        System.out.println(galaxyUltra22.sendTextMessage(1,"Hello Alex, i hope you are ok"));
        System.out.println(galaxyUltra22.viewContacts());


        System.out.println(galaxyUltra22.makeCall(1));
        System.out.println(galaxyA24.makeCall(0));
        System.out.println(iPhone15.sendTextMessage(2,"How are you?"));

        System.out.println("Samsung GalaxyA24 call history : "+ galaxyA24.viewCallHistory());
        System.out.println("Samsung Galaxy Ultra22 messages: " + galaxyUltra22.viewMessages(1));
        }
    }
