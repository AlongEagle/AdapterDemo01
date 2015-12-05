package com.xiaoshaying.adapterdemo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter<String> arrayAdapter;
    private SimpleAdapter simpleAdapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.listView);
        String [] arry_date={"项目1","项目3","项目4","项目1","项目1",};

        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arry_date);

        listView.setAdapter(arrayAdapter);
    }
}
