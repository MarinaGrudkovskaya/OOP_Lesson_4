package OOP.Lessen4;


import java.util.ArrayList;
import java.util.List;

// Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator(+)
public class StreamServise {

    private Stream stream;

    public List<Stream> sortStreamBySize(){
        List<Stream> streamList = new ArrayList<>();
        streamList.sort(new StreamComparator());
        return streamList;
    }

}