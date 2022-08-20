package jp.masayakumagai.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {
    SharedPreferences prefs = null;
    float viewtime = 5;
    EditText editviewtime = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        prefs = getSharedPreferences("settings",Context.MODE_PRIVATE);
        viewtime = prefs.getFloat("viewtime",5);
        editviewtime = findViewById(R.id.editviewtime);
        editviewtime.setText(String.valueOf(viewtime));
//        editviewtime.addTextChangedListener(new EditEventListener("viewtime"));
    }

    @Override
    protected void onPause() {
        String type_name = "viewtime";
        super.onPause();
        SharedPreferences.Editor editor = prefs.edit();
        editor.putFloat(type_name, Float.parseFloat(editviewtime.getText().toString()));
        editor.apply();
    }

//    private class EditEventListener implements TextWatcher{
//
//        public EditEventListener(String _type_name){
//            type_name = _type_name;
//        }
//        @Override
//        public void beforeTextChanged(CharSequence s,int start,int count,int after){
//
//        }
//        @Override
//        public void onTextChanged(CharSequence s, int start,int before,int count){
//
//        }
//        @Override
//        public void afterTextChanged(Editable s){
//            System.out.println(s.toString());
//            SharedPreferences.Editor editor = prefs.edit();
//            editor.putFloat(type_name, Float.parseFloat(s.toString()));
//            editor.apply();
//        }
//    }
}