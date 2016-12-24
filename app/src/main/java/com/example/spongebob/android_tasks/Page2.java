package com.example.spongebob.android_tasks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        TextView name_textView=(TextView) findViewById(R.id.textView2);
        Bundle bundle=getIntent().getExtras();
        name_textView.setText(bundle.getString("name"));
    }

    public void btn_back(View view) {
        Intent intent=new Intent(Page2.this,MainActivity.class);
        startActivity(intent);
    }
}
