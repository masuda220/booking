package example.todo.domain.model.booking;

import java.util.UUID;

public class BookingNumber {
    UUID number;

    public BookingNumber(UUID number) {
        this.number = number;
    }

    public static BookingNumber generate() {
        return new BookingNumber(UUID.randomUUID());
    }
}
