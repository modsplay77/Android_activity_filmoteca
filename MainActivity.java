package es.ua.eps.filmoteca;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    private Button mBoton;
    private Context mCont=this;

   // private Context mCont=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBoton = (Button) findViewById(R.id.Boton);
        mBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCont,pelis.class);
                startActivity(intent);
            }
    });

    }
}


