import java.util.ArrayList;

public class Search extends AbstractSearch {

    public Search(ArrayList<String> records) {
        this.records = records;
        this.results = new ArrayList<String>();
    }

    @Override
    public void query(String keyword) {
        search(keyword);
        displayResults();
    }


}
