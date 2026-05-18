public class Book {
    private String title;
    private String author;
    private double price;
    private int pages;

    public void setTitle(String title){
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public  String getAuthor() {
        return author;
    }

    public void setPrice(double price){
        this.price= price;

    }

    public double getPrice(){
      return price;
    }
    public void setPages(int pages){
        this.pages=pages;
    }
    public int getPages(){
        return pages;
    }
    public Book(String title,String author,int pages,double price){
        setTitle(title);
       setAuthor(author);
       setPages(pages);
       setPrice(price);
    }
    public void printDetails(){
        System.out.println( "Title:"+getTitle()+"\n"+
                "Author:"+getAuthor()+"\n"+
                "Price:"+getPrice()+"\n"+
                "Pages:"+getPages());
    }



    public String toString(){
        return "Title:"+getTitle()+"\n"+
                "Author:"+getAuthor()+"\n"+
                "Price:"+getPrice()+"\n"+
                "Pages"+getPages();
    }



}
