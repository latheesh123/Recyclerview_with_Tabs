package virupakshi.latheesh.com.week2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;


    private Button button;


private EditText editText;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Bundle extras = getIntent().getExtras();

        String text1=extras.getString("text1");

        String text2=extras.getString("text2");



        button=(Button)findViewById(R.id.button);


        textView1=(TextView)findViewById(R.id.text1);

        textView2=(TextView)findViewById(R.id.text2);

editText=(EditText)findViewById(R.id.editText);

           final String value=editText.getText().toString();



        textView1.setText(text1);
        textView2.setText(text2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                onBackPressed();

Toast.makeText(SecondActivity.this,value,Toast.LENGTH_LONG).show();


            }
        });

    }
}
