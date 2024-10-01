import java.io.*;

import  java.util.*;

public class Main {
    public static List<Book> books = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        String filename= "info.csv.txt";
        String determiner =",";
        String line ;

        InfoReader rd = new InfoReader();
        rd.readInfo(new Filereader(),books,filename);
        rd.readInfo(new Filereader(),books,"info.csv");
        rd.ShowBookSurvey(books);

    }


}
