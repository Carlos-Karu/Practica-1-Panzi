package mpanzi.net;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText editText2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText2 = findViewById(R.id.editText2);
        button3 = findViewById(R.id.button3);

        Bundle bundle = this.getIntent().getExtras();
        String nombre = bundle.get("nombre").toString();
        String apellidoPaterno = bundle.get("apellidoPaterno").toString();
        String apellidoMaterno = bundle.get("apellidoMaterno").toString();

        editText2.setText(String.format("%s %s %s", nombre, apellidoPaterno, apellidoMaterno));

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // finalizamos la activity
            }
        });
    }
}
