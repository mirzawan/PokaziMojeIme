package com.mirzahadzic.pokazimojeime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Ovo su hendleri za widgete
    private Button showButton;
    private TextView nameText;
    private EditText enterName;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Povezivanje widgeta sa hendlerom preko id-a koristeci findViewById metod
        showButton=findViewById(R.id.button2);
        nameText=findViewById(R.id.textView);
        enterName = findViewById(R.id.nameTextEditor);


        //Preko hendlera na widgetu se mogu pozivati metodi za akcije i mijenjanje protpertija

       // na buttonu smo kreirali osluskivac koji ocekuje klik, u tijelu metoda je opisana funckija//
        // onClick koja kao parametar prima view na kojem je pozvana i u tijelu se definise kod //
        //koji ce se izvrsiti kada se listener aktivira odnosno kada se desi klik na dugmetu//

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //definisan objekat name tipa string u koji ce se smjestit uneseni text u widget preko metode getText()

                String name = enterName.getText().toString();

                // obicnim if statementom provjeravamo da li je text objekat prazan te ako je prazan pravimo upozorenje
                if (name.isEmpty()){
                    nameText.setText("Ja nemam imena");
                }else {
                    nameText.setText("Moje ime je " + name);
                }

            }
        });


    }
}