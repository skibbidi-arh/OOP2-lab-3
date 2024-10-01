import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public  class Filereader implements Reader {

    @Override
    public void read(List<Book> books, String filename) throws IOException {
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {

            while ((line = br.readLine())!= null) {
                String[] data = line.split(",");
                int pages = Integer.parseInt(data[3]);
                books.add(new Book(data[0],data[1],data[2],pages,data[4]));

            }
        }

        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }


}
