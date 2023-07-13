package com.example.thedicecount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    SecureRandom RandomNo = new SecureRandom();
    int numdice1 = 0;
    int numdice2 = 0;
    int numdice3 = 0;
    int numdice4 = 0;
    int numdice5 = 0;
    int numdice6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtNoOfDice1 = findViewById(R.id.txtNoOfDice1);
        TextView txtNoOfDice2 = findViewById(R.id.txtNoOfDice2);
        TextView txtNoOfDice3= findViewById(R.id.txtNoOfDice3);
        TextView txtNoOfDice4= findViewById(R.id.txtNoOfDice4);
        TextView txtNoOfDice5 = findViewById(R.id.txtNoOfDice5);
        TextView txtNoOfDice6 = findViewById(R.id.txtNoOfDice6);



        ImageView Imgdice1 = findViewById(R.id.imgdice1);
        ImageView Imgdice2 = findViewById(R.id.imgdice2);
        ImageView Imgdice3 = findViewById(R.id.imgdice3);
        ImageView Imgdice4 = findViewById(R.id.imgdice4);
        ImageView Imgdice5= findViewById(R.id.imgdice5);
        ImageView Imgdice6= findViewById(R.id.imgdice6);
        ImageView Imgdice0 = findViewById(R.id.imgdice0);

        Button btnRoll = findViewById(R.id.btnRoll);

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0 ; i<=5000 ; i++){
                    int Thenum =1 +  RandomNo.nextInt(6) ;

                    switch(Thenum){
                        case 1:
                            ++numdice1 ;
                            break;
                        case 2:
                            ++numdice2;
                            break;
                        case 3:
                            ++numdice3;
                            break;
                        case 4:
                            ++numdice4;
                            break;
                        case 5:
                            ++numdice5;
                            break;
                        case 6:
                            ++numdice6;
                            break;

                    }
                }
                txtNoOfDice1.setText(numdice1 + " ");
                txtNoOfDice2.setText(numdice2 + " ");
                txtNoOfDice3.setText(numdice3 + " ");
                txtNoOfDice4.setText(numdice4 + " ");
                txtNoOfDice5.setText(numdice5 + " ");
                txtNoOfDice6.setText(numdice6 + " ");
            }

        });





       Imgdice1.setImageResource(R.drawable.dice1);
        Imgdice2.setImageResource(R.drawable.dice2);
        Imgdice3.setImageResource(R.drawable.dice3);
        Imgdice4.setImageResource(R.drawable.dice4);
        Imgdice5.setImageResource(R.drawable.dice5);
        Imgdice6.setImageResource(R.drawable.dice6);
        Imgdice0.setImageResource(R.drawable.dicel);


    }
}