package example.nogood.domain.model.booking;

public class Voyage {
    int bookedSize;
    static final int capacity = 100;

    public void addBookedSize(int size) {
        this.bookedSize += size;
    }

    public int capacity() {
        return capacity;
    }

    public int bookedSize() {
        return bookedSize;
    }
}
