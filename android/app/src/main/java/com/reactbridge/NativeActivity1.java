package com.reactbridge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NativeActivity1 extends AppCompatActivity {

    EditText et;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native1);

        et = (EditText) findViewById(R.id.et);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NativeActivity1.this, MainActivity.class);
                intent.putExtra("data",et.getText().toString());
                startActivity(intent);
            }
        });

    }
}
