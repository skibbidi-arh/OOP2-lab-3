import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class jsonreader implements Reader {

    @Override
    public void read(List<Book> books, String filename) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Read the JSON file and map it to a List of Book objects
            List<Book> bookList = objectMapper.readValue(new File(filename), new TypeReference<List<Book>>() {});

            // Manually add each book to the provided books list
            for (Book book : bookList) {
                books.add(book);
            }

        } catch (IOException e) {
            System.out.println("Error reading JSON file: " + e.getMessage());
            throw e; // Optionally rethrow the exception
        }
}
