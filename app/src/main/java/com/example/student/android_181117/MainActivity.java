package com.example.student.android_181117;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Switch sw1;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(listener);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(listener);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(listener);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(listener);
        sw1 = (Switch) findViewById(R.id.sw);
    }
    Button.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button tmp = (Button) findViewById(v.getId());
            str=tmp.getText().toString();
            if(sw1.isChecked()){
                Toast toast = Toast.makeText(MainActivity.this, "你按了"+str, Toast.LENGTH_SHORT);
                toast.show();
            }
            else {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("確認視窗");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setMessage("你按了"+str);
                builder.setPositiveButton("確認",null);
                builder.show();
            }
        }
    };
}
