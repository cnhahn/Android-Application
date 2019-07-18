package homework1.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button) findViewById(R.id.button1);

        Button button2 = (Button) findViewById(R.id.button2);

        Button button3 = (Button) findViewById(R.id.button3);

        //LinearLayout layout = new LinearLayout(this);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent press1 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(press1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent press2 = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(press2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

    }
}

