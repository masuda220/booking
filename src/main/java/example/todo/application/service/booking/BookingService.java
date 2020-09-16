package example.todo.application.service.booking;

import example.todo.domain.model.booking.BookingNumber;
import example.todo.domain.model.booking.Cargo;
import example.todo.domain.model.booking.Voyage;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    // TODO コマンドとクエリーの分離
    BookingNumber booking(Voyage voyage, Cargo cargo) {

        // TODO ビジネスルールの明示（クラスを使って）
        // TODO ビジネスロジックの記述をdomain.modelに移動
        double maxBooking = voyage.capacity() * 1.1 ;
        if (voyage.bookedSize() + cargo.size() > maxBooking)
            throw new IllegalStateException("最大積載量オーバー");

        return BookingNumber.generate();
    }
}
