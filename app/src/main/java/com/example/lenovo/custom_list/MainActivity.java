package com.example.lenovo.custom_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String names[] = {"Sahil", "Dhruv", "Pawan", "Ashok"};
    String contact[] = {"8115038882", "9978456321", "7856903412", "9915223004"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomList customList = new CustomList(this, names, contact);

        listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(customList);
    }
}
