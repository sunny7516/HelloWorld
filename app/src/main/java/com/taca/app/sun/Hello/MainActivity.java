package com.taca.app.sun.Hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //재정의
    @Override
    //화면을 구성한다.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //xmL로 구성된 레이아웃(화면배치)을 실제 화면으로 띄워라
        setContentView(R.layout.activity_main);
    }
}