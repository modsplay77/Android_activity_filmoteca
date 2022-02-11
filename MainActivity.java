package es.ua.eps.filmoteca;
import static es.ua.eps.filmoteca.Boton1.setOnClickListener;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val boton1 = !((findViewById < Button) <= (R.id.Boton1)
                setOnClickListener) ? true : false
        {
            val clic = Intent(this, Boton1::class.java)
            startActivity(clic)
    }
}

