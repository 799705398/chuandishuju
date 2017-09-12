package com.example.dage.chuandishuju;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class chuandishuju extends AppCompatActivity {
    TextView editText;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuandishuju);
        Button bt1=(Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(chuandishuju.this,chuandishuju2.class);
                EditText editText1 =(EditText)findViewById(R.id.editText1);
                intent.putExtra("sendto2",editText1.getText().toString());
                startActivityForResult(intent,0);

            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //   if( resultCode==0){
        String str=data.getStringExtra("sendto1");
        editText=(TextView) findViewById(R.id.textView2);
        editText.setText(str);
        //  }

    }

}