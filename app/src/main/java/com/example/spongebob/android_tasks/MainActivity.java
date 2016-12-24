package com.example.spongebob.android_tasks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_Done(View view) {
        EditText name_editText =(EditText)findViewById(R.id.editText);
        Intent intent=new Intent(MainActivity.this,Page2.class);
        Bundle bundle=new Bundle();
        bundle.putString("name",name_editText.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
