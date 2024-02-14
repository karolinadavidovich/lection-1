class Phone {

    private long number;

    private String model;

    private int weight;

    private String callerName;


    //receiveCall (один параметр – имя звонящего). Выводит на консоль сообщение “Звонит {name}”.
    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public String receiveCall() {
        return "Calling {" + callerName +
                '}';
    }

    //getNumber – возвращает номер телефона
    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    //Добавить второй метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего

    public void receiveCall2(String callerName, long number) {
        System.out.println("Calling " + callerName + " " + '\n' + number);
    }

    //Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
    //которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.

    public void sendMessage(long number) {
        System.out.println("Send message to " + number);
    }

    //Создайте три экземпляра (instance) этого класса. Выведите в консоль их значения.
    public void phoneInstance(String model, int weight, long number) {
        System.out.println("Phone:" + '\n' + model + ", " + weight + " grams, " + number);
    }
}


