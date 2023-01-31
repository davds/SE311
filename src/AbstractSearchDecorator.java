public abstract class AbstractSearchDecorator extends AbstractSearch {
    protected AbstractSearch search;

    public AbstractSearchDecorator(AbstractSearch search) {
        this.search = search;
    }


    public void query(String keyword) {
        search.query(keyword);
    }

    public void search(String keyword) {
        search.query(keyword);
    }

}
