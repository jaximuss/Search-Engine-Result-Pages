import java.util.ArrayList;
import java.util.List;

public class searchThreading extends  Thread {
    private int ThreadNumber;
    private String text;
    List<String> queries = new ArrayList<String>();
    List<String> UniqueqQueries = new ArrayList<String>();

    public searchThreading(int threadNumber, String text) {
        this.ThreadNumber = threadNumber;
        this.text = text;
    }

    @Override
    public void run() {

        if (text.length() >= 30) {
            if (!queries.contains(text)) {
                queries.add(text);
            }else {
                queries.remove(text);
            }
        }
        for (String item:queries)
        {
            if (!UniqueqQueries.contains(item)){
                UniqueqQueries.add(item);
            }
            for (String items:UniqueqQueries){
                System.out.println(ThreadNumber + "." + items);
            }

        }

    }
}


