package udemy.section9.absrtact_classes.lists_challenge;

public abstract class MyAbstractListItem {
    protected MyAbstractListItem previous = null;
    protected MyAbstractListItem next = null;
    protected Object value;

    public MyAbstractListItem(Object value) {
        this.value = value;
    }

    public void setPrevious(MyAbstractListItem previous){
        this.previous = previous;
    }

    public MyAbstractListItem previous() {
        return this.previous;
    }

    public void setNext(MyAbstractListItem next) {
        this.next = next;
    }

    public MyAbstractListItem next() {
        return this.next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public abstract int compareTo(MyAbstractListItem thatValue);
}
