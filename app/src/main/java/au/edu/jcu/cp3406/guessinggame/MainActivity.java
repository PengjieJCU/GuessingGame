package au.edu.jcu.cp3406.guessinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Random;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Button;
    EditText Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button = (Button)findViewById(R.id.button);
        Text = (EditText) findViewById(R.id.text);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int random = r.nextInt(10) + 1;
                String value = Text.getText().toString();
                int finalValue = Integer.parseInt(value);
                if (Text.getText().toString().length()==0) {
                    Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                } else if (finalValue > random) {
                    Toast.makeText(getApplicationContext(), "The correct number is bigger", Toast.LENGTH_SHORT).show();
                } else if (finalValue < random) {
                    Toast.makeText(getApplicationContext(), "The correct number is lower", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Correct answer!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}