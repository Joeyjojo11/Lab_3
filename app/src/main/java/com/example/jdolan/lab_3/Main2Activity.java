package com.example.jdolan.lab_3;

//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.jdolan.lab_3.my_validation;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Help Text to be display if an Invalid phone number is entered
        final String PHONE_HELP_MSG =    "format needs to be 1 of the following: \n" +
                "08[345678] abcdefg \n" +
                "+ccc 8[345678] abcdefg \n" +
                "00 ccc 8[345678] abcdefg";

        Button ExitBtn = (Button) this.findViewById(R.id.button2);
        EditText phone2;
        phone2 = (EditText) this.findViewById(R.id.editText2);
        ImageView icon = (ImageView) this.findViewById(R.id.imageView);




        // read the passed phonenumber and display it in phone2
        String phoneno = getIntent().getStringExtra("phoneNumber");
        phone2.setText(phoneno);

        TextView ErrorTxt = (TextView) findViewById(R.id.textView2);


        if (my_validation.isPhoneNumber(phoneno, true)){
            //make sure the Error Text is blank (null)
            ErrorTxt.setText("");

            // Display a green Tick
            icon.setImageResource(R.drawable.greentick);

        }
        else {
            ErrorTxt.setText(PHONE_HELP_MSG);
            icon.setImageResource(R.drawable.redx);
        };

        // exit to page 1 if the Exit button is clicked
        ExitBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();

            }
        });
    }
}
