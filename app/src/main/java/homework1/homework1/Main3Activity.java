package homework1.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main3Activity extends AppCompatActivity {

    String Information;

    //list view variable
    ListView listView;
    ArrayAdapter<String> adapter;

    String [] string = new String[] {"1.c", "2.java", "3. c++"};

    ArrayList<String> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        arrayList = new ArrayList<String>();

        BufferedReader reader;
        try {
            FileInputStream inputFile = openFileInput("text2.txt");
            reader = new BufferedReader(new InputStreamReader(inputFile));
            String line = reader.readLine();
            while(line != null)
            {
                arrayList.add(line);
                //inclement to next string line
                line = reader.readLine();
            }
            inputFile.close();
        }catch(Exception e){
            e.printStackTrace();
        }


        listView = findViewById(R.id.list);





        //arrayList.add();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, arrayList);

        Intent intent = getIntent();

        listView.setAdapter(adapter);
    }

}