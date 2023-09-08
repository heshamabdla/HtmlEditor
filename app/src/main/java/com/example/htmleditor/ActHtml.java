package com.example.htmleditor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class ActHtml extends AppCompatActivity {
    Button btnBack;
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_html);

        btnBack=findViewById(R.id.back);
        wv=findViewById(R.id.web);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadData(MyVar.strHTML,"text/html;charset=utf-8",null);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }// end onCreate
}// end ActHtml class