package com.example.jdolan.lab_3;


import android.content.Intent;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    //


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button validate = (Button) findViewById(R.id.button);

        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phone_validate(v);

            }
        });

    }




    public void phone_validate(View v1) {
       // ImageView imageView = (ImageView)findViewById(R.id.imageView);
        Intent A2Intent = new Intent (v1.getContext(), Main2Activity.class);
        EditText phone = (EditText) findViewById(R.id.editText);
        // pass the entered phone number to the next activity
        //A2Intent.putExtra("phoneNumber", tv2.getText());
        String ph = phone.getText().toString();
        A2Intent.putExtra("phoneNumber", ph);

        // start the next activity/page
        startActivity(A2Intent);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}


/*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item); */
// }


