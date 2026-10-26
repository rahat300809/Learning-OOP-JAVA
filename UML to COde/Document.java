public class Document {
    private String authors;
    private int date;

    public String getAuthors()
    {
        return authors;
    }
    public void addAuthor(String name)
    {
        authors=name;
    }

    public int getDate()
    {
        return date;
    }
}
