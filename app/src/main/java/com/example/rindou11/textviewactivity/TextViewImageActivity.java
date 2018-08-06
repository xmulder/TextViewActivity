package com.example.rindou11.textviewactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.rindou11.textviewactivity.R.layout.text_view_activity;
import static com.example.rindou11.textviewactivity.R.layout.text_view_image_activity;

public class TextViewImageActivity extends AppCompatActivity {

    private Button button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_view_image_activity);

        button_back=(Button)findViewById(R.id.button_intent_to_image_activity);

    }



    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
