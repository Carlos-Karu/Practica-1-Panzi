package mpanzi.net;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Declaramos los componentes
    private EditText editTextNombre, editTextPaterno, editTextMaterno;
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Definimos los componentes
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextPaterno = findViewById(R.id.editTextApPaterno);
        editTextMaterno = findViewById(R.id.editTextApMaterno);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        // Agregamos escuchador al botón de saludo
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                // nombre clave y dato
                bundle.putString("nombre", editTextNombre.getText().toString());
                bundle.putString("apellidoPaterno", editTextPaterno.getText().toString());
                bundle.putString("apellidoMaterno", editTextMaterno.getText().toString());
                // Intent del que partimos | Intent al que nos dirigimos
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                // Mandamos el bundle al intent
                intent.putExtras(bundle);
                // Lanzamos la nueva actividad
                startActivity(intent);
            }
        });

        // Agregamos escuchador al botón de salir
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}
