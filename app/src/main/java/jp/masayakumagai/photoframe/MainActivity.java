package jp.masayakumagai.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_play).setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v.getId() == R.id.button_play){
            Intent intent = new Intent(MainActivity.this, FullscreenActivity.class);
            startActivity(intent);
            Snackbar.make(v,"OK", Snackbar.LENGTH_SHORT).show();
        }
    }
}