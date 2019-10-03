package udemy.section9.absrtact_classes.lists_challenge;

public class MyOrderedStringList {
    private MyStingListItem head = null;
    private int count = 0;

    public void add(String value) {
        MyStingListItem item = new MyStingListItem(value);

        if (head == null) {
            head = item;
            count++;
        } else {
            setNext(item);
        }
    }

    public int length() {
        return this.count;
    }

    public void remove(String value) {
        MyStingListItem item = new MyStingListItem(value);

        if (head != null) {
            if (head.next() == null) {
                if (head.compareTo(item) == 0) {
                    head = null;
                    count--;
                }
            } else {
                remove(item);
            }
        }
    }

    private void remove(MyStingListItem item) {
        boolean isFound = false;
        boolean isEqual;
        boolean isHeadToDelete;
        MyStingListItem currentItem = head;

        while (!isFound) {
            isEqual = item.compareTo(currentItem) == 0;
            isHeadToDelete = item.compareTo(head) == 0;
            if (isEqual) {
                //sequence is important
                if (isHeadToDelete) {
                    head = (MyStingListItem) currentItem.next();
                }
                if (currentItem.next() != null) {
                    currentItem.next().setPrevious(currentItem.previous());
                }
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(currentItem.next());
                }
                currentItem.setNext(null);
                currentItem.setPrevious(null);
                isFound = true;
                count--;
            } else {
                if (currentItem.next() != null) {
                    currentItem = (MyStingListItem) currentItem.next();
                } else {
                    return;
                }
            }
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
