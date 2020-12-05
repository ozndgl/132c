package ozndgl.ozandgl.a132c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.a132c.R;

public class SettingsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    SharedPreferences sharedPreferences;
    String secilen;
    int aracKodint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        sharedPreferences = this.getSharedPreferences("ozndgl.ozandgl.a132c", Context.MODE_PRIVATE);
        aracKodint = sharedPreferences.getInt("aracKod",0);

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.numbers, android.R.layout.simple_list_item_1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        secilen = parent.getItemAtPosition(position).toString();
        //Toast.makeText(parent.getContext(),"seçilen araç kodu: "+secilen,Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(parent.getContext(),"seçim yap ",Toast.LENGTH_LONG).show();
    }

    public void kaydetButton (View view){
        sharedPreferences.edit().putInt("arackod",Integer.parseInt(secilen)).apply();

        System.out.println("kaydete basıldı");
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
        Toast.makeText(getApplicationContext(),"C-"+secilen+" seçildi",Toast.LENGTH_LONG).show();
    }
}