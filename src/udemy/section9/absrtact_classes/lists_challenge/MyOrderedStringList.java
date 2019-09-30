package udemy.section9.absrtact_classes.lists_challenge;

public class MyOrderedStringList {
    private MyStingListItem head = null;
    private int count = 0;

    public void add(String value) {
        MyStingListItem item = new MyStingListItem(value);

        if (head == null) {
            head = item;
        } else {
            setNext(item);
        }
    }

    public int length() {
        return this.count;
    }

    public void remove(String value) {
        boolean isFound = false;
        MyStingListItem currentItem = head;

        while (!isFound) {

        }
    }

    private void setNext(MyStingListItem item) {
        boolean isFound = false;
        MyStingListItem currentItem = head;

        while (!isFound) {
            int comp = item.compareTo(currentItem);
            if (comp < 0) {
                MyStingListItem prev = (MyStingListItem)currentItem.previous();
                item.setNext(currentItem);
                currentItem.setPrevious(item);
                if (prev != null) {
                    prev.setNext(item);
                    item.setPrevious(prev);
                } else {
                    head = item;
                }
                isFound = true;
                count++;
            } else if (comp > 0) {
                if (currentItem.next() != null) {
                    currentItem = (MyStingListItem) currentItem.next();
                } else {
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    isFound = true;
                    count++;
                }
            }
        }
    }
}
