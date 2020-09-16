package example.todo.domain.model.booking;
public class Cargo {
    int size;

    public Cargo(int size) {
        this.size = size;
    }

    // TODO getterは使わない
    public int size() {
        return size;
    }
}
