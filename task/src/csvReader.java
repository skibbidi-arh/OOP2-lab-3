import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class csvReader implements Reader {

    @Override
    public void read(List<Book> books, String filename) throws IOException {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int pages = Integer.parseInt(data[3]);  // Parse the number of pages
                books.add(new Book(data[0], data[1], data[2], pages, data[4])); // Assuming book data fits into these fields
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
