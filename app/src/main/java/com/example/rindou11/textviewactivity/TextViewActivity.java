package com.example.rindou11.textviewactivity;

import android.content.Intent;
import android.graphics.Color;
import android.renderscript.Script;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TextViewActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button_change_color;
    private Button button_edit_text_to_toast;
    private Button intent_to_second_activity_button;

    private EditText editText1;
    private TextView text_view_test_1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_view_activity);

        button_change_color=(Button)findViewById(R.id.button_change_color);
        button_edit_text_to_toast =(Button)findViewById(R.id.edit_text_to_toast);
        intent_to_second_activity_button=(Button)findViewById(R.id.button_intent_to_image_activity);

        text_view_test_1=(TextView)findViewById(R.id.text_view_text);
        editText1=(EditText)findViewById(R.id.edit_text_1);


        button_edit_text_to_toast.setOnClickListener((View.OnClickListener)this);
        button_change_color.setOnClickListener((View.OnClickListener)this);
        intent_to_second_activity_button.setOnClickListener((View.OnClickListener)this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.edit_text_to_toast:
                String editString=editText1.getText().toString();
                if (editString != null && !editString.equals("")){
                    Toast.makeText(TextViewActivity.this,editString,Toast.LENGTH_SHORT).show();
                }
                else {
                    AlertDialog.Builder alert_dialog=new AlertDialog.Builder(TextViewActivity.this);
                    alert_dialog.setTitle("Alert");
                    alert_dialog.setMessage("Please input something in Edit View.");
                    alert_dialog.setCancelable(true);
                    alert_dialog.show();

                }
                break;
            case R.id.button_change_color:
                text_view_test_1.setTextColor(Color.rgb(47,79,79));
                break;
            case R.id.button_intent_to_image_activity:
                Intent intent_image=new Intent("android.intent.action.IMAGELAUNCH");
                intent_image.addCategory("android.intent.category.IMAGEACTIVITY");
                startActivity(intent_image);
                break;
            default:
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
