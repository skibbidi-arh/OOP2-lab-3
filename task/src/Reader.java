import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface Reader {
    void read(List<Book> books, String filename) throws IOException;
}
