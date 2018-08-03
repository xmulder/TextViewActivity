package com.example.rindou11.textviewactivity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_view_activity);

        Button change_color_button=(Button)findViewById(R.id.button_change_color);
        final TextView text_view_test_1=(TextView)findViewById(R.id.text_view_text);
        change_color_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_view_test_1.setTextColor(Color.rgb(255,0,0));
            }
        });
    }
}
