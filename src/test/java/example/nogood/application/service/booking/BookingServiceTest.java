package example.nogood.application.service.booking;

import example.nogood.domain.model.booking.Cargo;
import example.nogood.domain.model.booking.Voyage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class BookingServiceTest {

    @Autowired
    BookingService bookingService;

    @Test
    @DisplayName("オーバーブッキング")
    void overBooking() {
        Voyage voyage = new Voyage();
        voyage.addBookedSize(100);
        Cargo cargo = new Cargo(10);

        assertThrows(IllegalStateException.class, () ->
            bookingService.booking(voyage, cargo));
    }
}