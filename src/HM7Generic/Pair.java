package HM7Generic;


public class Pair<T> {
    private T firstObj;
    private T secondObj;

    private T newObj;

    public Pair(T firstObj, T secondObj, T newObj) {
        this.firstObj = firstObj;
        this.secondObj = secondObj;
        this.newObj = newObj;
    }

    public T getFirstObj() {
        return firstObj;
    }

    public void setFirstObj(T firstObj) {
        this.firstObj = firstObj;
    }

    public T getSecondObj() {
        return secondObj;
    }

    public void setSecondObj(T secondObj) {
        this.secondObj = secondObj;
    }

    public T getNewObj() {
        return newObj;
    }

    public void setNewObj(T newObj) {
        this.newObj = newObj;
    }

    public void swap() {
        T obj = firstObj;
        firstObj = secondObj;
        secondObj = obj;
    }

    public String toString() {
        return "\n" + "After swap:" + "\n" + "first object = " + firstObj + "\n" + "second object = " + secondObj;
    }

    public void replaceFirst() {
        T obj = firstObj;
        firstObj = newObj;
        newObj = obj;
    }

    public String replaceFirstToString() {
        return "\n" + "After first replay:" + "\n" + "first object = " + newObj;
    }

    public void replaceSecond() {
        T obj = firstObj;
        firstObj = newObj;
        newObj = obj;
    }

    public String replaceSecondToString() {
        return "\n" + "After first replay:" + "\n" + "first object = " + newObj;
    }
}
