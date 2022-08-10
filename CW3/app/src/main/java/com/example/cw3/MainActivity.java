package com.example.cw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Object EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ed1 = findViewById(R.id.edittext1);
        EditText ed2 = findViewById(R.id.edittext2);
        Button b = findViewById(R.id.button);
        TextView t = findViewById(R.id.textView2);




        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(ed1.getText().toString());
                int num2 = Integer.parseInt(ed2.getText().toString());

                int result = num1+num2;

                t.setText(String.valueOf(result));
            }


});
}}