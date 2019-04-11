package com.example.primeraaplicacion;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int cont=0;
    /******************************************************/
    Button   BotonContador;
    Button   BotonCerrar;
    Button   BotonRestar;
    TextView TextoContador;
    /*****************************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**************************************/
        BotonContador = (Button)findViewById(R.id.BotonContar);
        BotonRestar   = (Button)findViewById(R.id.BotonRestar);
        BotonCerrar   = (Button)findViewById(R.id.BotonCerrar);
        BotonContador.setOnClickListener(this);
        BotonRestar.setOnClickListener(this);
        BotonCerrar.setOnClickListener(this);
        TextoContador = (TextView)findViewById(R.id.ContadorTxt);
        /**************************************/
    }//fin onCreate
    @Override
    public void onClick(View v) {
            switch(v.getId()){
                case R.id.BotonContar:
                    Toast.makeText(getApplicationContext(), "Sumando", Toast.LENGTH_SHORT).show();
                    cont++;
                    TextoContador.setText(String.valueOf(cont));
                break;
                case R.id.BotonRestar:
                    Toast.makeText(getApplicationContext(), "Restando", Toast.LENGTH_SHORT).show();
                    cont--;
                    TextoContador.setText(String.valueOf(cont));
                 break;
                case R.id.BotonCerrar:
                    Toast.makeText(getApplicationContext(), "Adiós", Toast.LENGTH_SHORT).show();
                    //onDestroy();
                    onStop();
                 break;
            }//switch
    }//fin onClick
}//fin MainActivity
