package example.nogood.application.service.booking;

import example.nogood.domain.model.booking.BookingNumber;
import example.nogood.domain.model.booking.Cargo;
import example.nogood.domain.model.booking.Voyage;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    BookingNumber booking(Voyage voyage, Cargo cargo) {

        double maxBooking = voyage.capacity() * 1.1 ;
        if (voyage.bookedSize() + cargo.size() > maxBooking)
            throw new IllegalStateException("最大積載量オーバー");

        return BookingNumber.generate();
    }
}
