import java.util.Date;

public class HeaderFooter extends AbstractSearchDecorator {

    public HeaderFooter(AbstractSearch search) {
        super(search);
    }

    @Override
    public void query(String keyword) {
        search.search(keyword);
        addHeader();
        search.query(keyword);
        addFooter();
    }

    protected void addHeader() {
        System.out.println(search.getNumResults() + " results are found in " + search.getRecords() + " records.");
    }

    protected void addFooter() {
        Date date = new Date();
        System.out.println(date);
    }

}
