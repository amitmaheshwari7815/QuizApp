package com.cioc.amit.hero;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;

/**
 * Created by amit on 3/6/18.
 */

public class Popup extends Activity {
EditText e1,e2,e3;
RadioButton r1,r2,r3;
ImageButton imageButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        imageButton = (ImageButton) findViewById(R.id.Next);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Popup.this, Question4.class);
                startActivity(intent);
            }
        });
    }
}
