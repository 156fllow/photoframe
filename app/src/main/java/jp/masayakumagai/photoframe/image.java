package jp.masayakumagai.photoframe;

import android.net.Uri;

public class image {
    Uri uri;
    long id;
    String title;
    String path;

    public image(Uri _uri,long _id, String _title, String _path){
        uri = _uri;
        id = _id;
        title = _title;
        path = _path;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPath() {
        return path;
    }

    public Uri getUri(){return uri;}

//    public static image getTestdata(){
//        return new image("31","j21kdr82","/storage/emulated/0/DCIM/j21kdr82.bmp");
//    }
}
