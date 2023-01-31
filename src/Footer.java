public class Footer extends HeaderFooter {

    public Footer(AbstractSearch search) {
        super(search);
    }

    @Override
    public void query(String keyword) {
        search.query(keyword);
        search.displayResults();
        addFooter();
    }
}
