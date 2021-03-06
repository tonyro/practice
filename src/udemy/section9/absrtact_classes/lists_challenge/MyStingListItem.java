package udemy.section9.absrtact_classes.lists_challenge;

public class MyStingListItem extends MyAbstractListItem {

    public MyStingListItem(String value) {
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
        return compareTo((String)thatItem.getValue());
    }

    public int compareTo(String value) {
        if (value != null) {
            return ((String)this.value).compareTo(value);
        } else {
            return -1;
        }
    }
}
