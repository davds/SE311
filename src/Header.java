public class Header extends HeaderFooter {

    public Header(AbstractSearch search) {
        super(search);
    }

    @Override
    public void query(String keyword) {
        search.search(keyword);
        addHeader();
        search.displayResults();
    }
}
