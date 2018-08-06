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

        button_back=(Button)findViewById(R.id.back_to_text_view_activity);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_back=new Intent(TextViewImageActivity.this,TextViewActivity.class);
                startActivity(intent_back);
            }
        });

    }



    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
