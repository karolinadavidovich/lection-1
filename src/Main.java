public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.phoneInstance("Iphone", 173, 119035855);
        phone.setCallerName("Michael");
        System.out.println(phone.receiveCall());
        phone.setNumber(119035855);
        System.out.println(phone.getNumber());
        phone.receiveCall2("Michael", 119035855);
        phone.sendMessage(119035855);

        System.out.println();


        Phone phone1 = new Phone();
        phone1.phoneInstance("Samsung", 233, 175937503);
        phone1.setCallerName("Mike");
        System.out.println(phone1.receiveCall());
        phone1.setNumber(175937503);
        System.out.println(phone1.getNumber());
        phone1.receiveCall2("Mike", 175937503);
        phone1.sendMessage(175937503);

        System.out.println();


        Phone phone2 = new Phone();
        phone2.phoneInstance("Xiaomi", 198, 123456789);
        phone2.setCallerName("Mark");
        System.out.println(phone2.receiveCall());
        phone2.setNumber(123456789);
        System.out.println(phone2.getNumber());
        phone2.receiveCall2("Mark", 123456789);
        phone2.sendMessage(123456789);

    }
}
