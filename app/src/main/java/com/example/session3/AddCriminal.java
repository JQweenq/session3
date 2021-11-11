package com.example.session3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//import android.view.WindowManager;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//import android.widget.PopupMenu;
//import android.widget.TextView;

import java.util.List;

public class AddCriminal extends AppCompatActivity {

/*    private PopupMenu PM;
    private TextView number, date, detective, client, category, description;
    private ArrayAdapter<Case> adapter;
    private List<Case> Cases;
    ListView listView;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

/*
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Cases);
        listView.setAdapter(adapter);*/

//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_add_criminal);

        /*number = (TextView)findViewById(R.id.number);
        date = (TextView)findViewById(R.id.date);
        detective = (TextView)findViewById(R.id.detective);
        client = (TextView)findViewById(R.id.client);
//        category = (TextView)findViewById(R.id.categoty);
        description = (TextView)findViewById(R.id.description);*/

    }
    public void back(){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void cancel(View view){
        back();
    }// COMMIT

    public void done(View view){
/*        Case _case = new Case(number.getText().toString(),
                date.getText().toString(),
                detective.getText().toString(),
                client.getText().toString(),
                description.getText().toString()
        );
        Cases.add(_case);*/
        back();
    }

}