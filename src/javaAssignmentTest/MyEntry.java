package javaAssignmentTest;

public class MyEntry {
    private String date;
    private String title;
    private String body;

    public MyEntry(String date, String title, String body) {
        this.date = date;
        this.title = title;
        this.body = body;
    }
    public  MyEntry(String title , String body){
        this.title = title;
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "title : "+ title + "\n"+
                "body: " + body;



    }
}
