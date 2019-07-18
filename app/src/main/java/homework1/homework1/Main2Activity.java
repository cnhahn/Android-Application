package homework1.homework1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class Main2Activity extends AppCompatActivity {

    String FILE_NAME = "text2.txt";

    EditText editText1;
    Spinner spinner1;
    EditText editText2;

    Button button;

    FileOutputStream outputStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText1 = (EditText)findViewById(R.id.editText1);
        spinner1 =  (Spinner)findViewById(R.id.spinner1);
        editText2 = (EditText)findViewById(R.id.editText2);

        button = (Button)findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                //Intent intent2 = new Intent(Main2Activity.this, Main3Activity.class);

                String text = "Painting by " + editText1.getText().toString();
                text += " in the year " + spinner1.getSelectedItem().toString() + ".";
                text += " Photograph taken by " + editText2.getText().toString() + "." + "\n";

                try {
                    outputStream = openFileOutput(FILE_NAME, Context.MODE_APPEND);
                    outputStream.write(text.getBytes());
                    outputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //intent2.putExtra("Information",text);
                //startActivity(intent2);
                startActivity(intent);

            }
        });

    }

}
