package udemy.section9.absrtact_classes.lists_challenge;

public class MyIntegerListItem extends MyAbstractListItem {

    public MyIntegerListItem(Integer value) {
        super(value);
    }

    @Override
    public void setPrevious(MyAbstractListItem previous) {
        this.previous = previous;
    }

    @Override
    public MyAbstractListItem previous() {
        return this.previous;
    }

    @Override
    public void setNext(MyAbstractListItem next) {
        this.next = next;
    }

    @Override
    public MyAbstractListItem next() {
        return this.next;
    }

    @Override
    public int compareTo(MyAbstractListItem thatItem) {
        if (thatItem != null) {
            return (Integer)this.value - (Integer)thatItem.getValue();
        }
        else {
            return -1;
        }
    }
}
