package anew.shayshab.com.waysofearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button8);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"clicked on button",Toast.LENGTH_SHORT).show();
                Intent i =new Intent(MainActivity.this,Activity1.class);
                startActivity(i);
            }
        });

        b1=(Button) findViewById(R.id.button9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });

        b3=(Button) findViewById(R.id.button10);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(MainActivity.this,Main3Activity.class);
                startActivity(i);
            }
        });

        b4=(Button) findViewById(R.id.button11);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(MainActivity.this,Main6Activity.class);
                startActivity(i);
            }
        });

        b5=(Button) findViewById(R.id.button12);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i =new Intent(MainActivity.this,Main7Activity.class);
                startActivity(i);
            }
        });



    }
}
