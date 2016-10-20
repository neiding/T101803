package com.example.yvtc.t101803;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.yvtc.t101803.R.id.editText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void click2(View v){
        EditText et=(EditText) findViewById(editText);
        String str=et.getText().toString();

        Intent it=new Intent();
        it.putExtra("myinput", str);
        setResult(RESULT_OK, it);
        finish();


    }
}
