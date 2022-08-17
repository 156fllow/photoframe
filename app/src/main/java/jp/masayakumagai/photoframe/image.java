package jp.masayakumagai.photoframe;

public class image {
    String id;
    String title;
    String path;

    public image(String _id,String _title,String _path){
        id = _id;
        title = _title;
        path = _path;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPath() {
        return path;
    }
}
