package jp.masayakumagai.photoframe;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link imageFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class imageFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    // TODO: Rename and change types of parameters
    private image img;
    private ImageView imageView ;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
     * @return A new instance of fragment imageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static imageFragment newInstance(image param) {
        imageFragment fragment = new imageFragment(param);
        return fragment;
    }

    public imageFragment(image _img) {
        // Required empty public constructor
        img = _img;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image, container, false);
        imageView = (ImageView) view.findViewById(R.id.imageView);
        File bitmap_file = new File(img.getPath());
        Bitmap bitmap = null;

        try (InputStream stream = new FileInputStream(bitmap_file)) {
            bitmap = BitmapFactory.decodeStream(new BufferedInputStream(stream));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }

        return view;
    }

    public ImageView getImageView() {
        return imageView;
    }
}