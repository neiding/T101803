package com.example.yvtc.t101803;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    final int REQUEST_CODE_INPUT=123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v){
        Intent it =new Intent(MainActivity.this ,Main2Activity.class);
        startActivityForResult(it,REQUEST_CODE_INPUT);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==REQUEST_CODE_INPUT) { // 確定
            if (resultCode==RESULT_OK) { //有這個判斷可防止沒有輸入就結束activity 沒有result 產生的error
                TextView tv = (TextView) findViewById(R.id.textView);
                String str = data.getStringExtra("myinput");
                tv.setText(str);
            }
        }
    }
}
