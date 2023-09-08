package com.example.htmleditor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btnRun,btnNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.code);
        btnRun=findViewById(R.id.Run);
        btnNew=findViewById(R.id.New);

        String strStartHtml="" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "   input{\n" +
                "   font-size:10px; \n" +
                "   width:250px;\n" +
                "   color:blue; \n" +
                "   background:lightblue; \n" +
                "   }\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Test About HTML</h1> \n" +
                "<input id='txt' />\n <br /> \n" +
                "<input type='submit' onclick='window.txt.value+=7;'>\n" +
                "</body>\n" +
                "</html>"
                ;

        editText.setText(strStartHtml);

      final Intent myAct=new Intent(this,ActHtml.class);
        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyVar.strHTML=editText.getText()+"";// strHTML is static
                startActivity(myAct);
            }//end onClick
        });

        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strNewtHtml="" +
                        "<html>\n" +
                        "<head>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>";
                editText.setText(strNewtHtml);

            }// end onClick
        });

    }//end onCreate
}//end Class
