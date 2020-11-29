package ozndgl.ozandgl.a132c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

import com.example.a132c.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    int aracKod;
    String haftaUcDeger;
    int aracSiraDeger;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar haftalar = Calendar.getInstance();
        int haftagunal = (Calendar.DAY_OF_WEEK);
        int haftaGunalSon = haftalar.get(haftagunal);
        Date tarih = new Date();

        SimpleDateFormat bugun = new SimpleDateFormat("D");
        String yilgun = bugun.format(tarih);


        int yilHane = yilgun.length();
        String yilSonRakam = yilgun.substring(yilHane - 1);
        int yilHaneİnt = Integer.parseInt(yilSonRakam);
        TextView siralar = (TextView) findViewById(R.id.sira);
        TextView haftaGunler = (TextView) findViewById(R.id.gun);
        TextView arac = (TextView) findViewById(R.id.arac);


        System.out.println("haftanın günü rakam: " + haftaGunalSon);
        System.out.println("yıl günü: " + yilgun);
        System.out.println("yıl hane: " + yilHane);
        System.out.println("yil son rakamı: " + yilSonRakam);

        sharedPreferences = this.getSharedPreferences("com.example.a132c", Context.MODE_PRIVATE);
        aracKod = sharedPreferences.getInt("arackod", 0);
        arac.setText("C-" + aracKod);
        System.out.println("gelen veri: " + aracKod);
        if (aracKod == 0) {
            System.out.println("lütfen araç seçiniz");
            Toast.makeText(getApplicationContext(), "lütfen ayarlardan araç kodu seçiniz", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(), setting.class);
            startActivity(intent);
            finish();
        } else if (aracKod == 780) {
            int gun = (yilHaneİnt + 10) - 1;
            int gunLenght = String.valueOf(gun).length();
            String degerSonRakam = String.valueOf(gun).substring(gunLenght - 1);
            System.out.println("çalıştığı sıra: " + gun + "uzunluk. " + gunLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);

        } else if (aracKod == 781) {
            int gun = (yilHaneİnt + 10) -0 ;
            int degerLenght = String.valueOf(gun).length();
            String degerSonRakam = String.valueOf(gun).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + gun + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);

        } else if (aracKod == 782) {
            int gun = (yilHaneİnt + 10) - 9;
            int degerLenght = String.valueOf(gun).length();
            String degerSonRakam = String.valueOf(gun).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + gun + " uzunluk: " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);
        } else if (aracKod == 783) {
            int gun = (yilHaneİnt + 10) - 8;
            int degerLenght = String.valueOf(gun).length();
            String degerSonRakam = String.valueOf(gun).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + gun + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);
        } else if (aracKod == 784) {
            int gun = (yilHaneİnt + 10) - 7;
            int degerLenght = String.valueOf(gun).length();
            String degerSonRakam = String.valueOf(gun).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + gun + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);
        } else if (aracKod == 785) {
            int gun = (yilHaneİnt + 10) - 6;
            int degerLenght = String.valueOf(gun).length();
            String degerSonRakam = String.valueOf(gun).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + gun + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);
        } else if (aracKod == 786) {
            int gun = (yilHaneİnt + 10) - 5;
            int degerLenght = String.valueOf(gun).length();
            String degerSonRakam = String.valueOf(gun).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + gun + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);
        } else if (aracKod == 787) {
            int gun = (yilHaneİnt + 10) - 4;
            int degerLenght = String.valueOf(gun).length();
            String degerSonRakam = String.valueOf(gun).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + gun + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);

        } else if (aracKod == 788) {
            int gun = (yilHaneİnt + 10) - 3;
            int degerLenght = String.valueOf(gun).length();
            String degerSonRakam = String.valueOf(gun).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + gun + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);
        } else if (aracKod == 789) {
            int gun = (yilHaneİnt + 10) - 2;
            int degerLenght = String.valueOf(gun).length();
            String degerSonRakam = String.valueOf(gun).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + gun + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);

        }



        switch (haftaGunalSon) {


            case 1:
                System.out.println("PAZAR");
                haftaGunler.setText("PAZAR");
                haftaUcDeger = "pazar";
                break;

            case 2:
                System.out.println("HAFTAİÇİ (PAZARTESİ)");
                haftaGunler.setText("HAFTAİÇİ (PAZARTESİ)");
                haftaUcDeger = "haftaici";
                break;

            case 3:
                System.out.println("HAFTAİÇİ (SALI)");
                haftaGunler.setText("HAFTAİÇİ (SALI)");
                haftaUcDeger = "haftaici";
                break;

            case 4:
                System.out.println("HAFTAİÇİ (ÇARŞAMBA)");
                haftaGunler.setText("HAFTAİÇİ (ÇARŞAMBA)");
                haftaUcDeger = "haftaici";
                break;

            case 5:
                System.out.println("HAFTAİÇİ (PERŞEMBE)");
                haftaGunler.setText("HAFTAİÇİ (PERŞEMBE)");
                haftaUcDeger = "haftaici";
                break;

            case 6:
                System.out.println("HAFTAİÇİ (CUMA)");
                haftaGunler.setText("HAFTAİÇİ (CUMA)");
                haftaUcDeger = "haftaici";
                break;

            case 7:
                System.out.println("CUMARTESİ");
                haftaGunler.setText("CUMARTESİ");
                haftaUcDeger = "cumartesi";
                break;

        }



        if (haftaUcDeger == "haftaici"){
            System.out.println("hafta içine girdi");
            switch (aracSiraDeger) {

                case 8:
                    System.out.println("8. sıra");
                    siralar.setText("bugün 8. araba");
                    ListView listsol8 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciSultanSekiz);
                    listsol8.setAdapter(solAdaptor8);
                    ListView listsag8 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciKartalSekiz);
                    listsag8.setAdapter(sagAdaptor8);
                    break;

                case 9:
                    System.out.println("9. sıra");
                    siralar.setText("bugün 9. araba");
                    ListView listsol9 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciSultanDokuz);
                    listsol9.setAdapter(solAdaptor9);
                    ListView listsag9 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciKartalDokuz);
                    listsag9.setAdapter(sagAdaptor9);
                    break;

                case 0:
                    System.out.println("10. sıra");
                    siralar.setText("bugün 10. araba");
                    ListView listsol10 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciSultanOn);
                    listsol10.setAdapter(solAdaptor10);
                    ListView listsag10 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciKartalOn);
                    listsag10.setAdapter(sagAdaptor10);
                    break;

                case 1:
                    System.out.println("1. sıra");
                    siralar.setText("bugün 1. araba");
                    ListView listsol1 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciSultanBir);
                    listsol1.setAdapter(solAdaptor1);
                    ListView listsag1 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciKartalBir);
                    listsag1.setAdapter(sagAdaptor1);
                    break;

                case 2:
                    System.out.println("2. sıra");
                    siralar.setText("bugün 2. araba");
                    ListView listsol2 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciSultanIki);
                    listsol2.setAdapter(solAdaptor2);
                    ListView listsag2 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciKartalIki);
                    listsag2.setAdapter(sagAdaptor2);
                    break;

                case 3:
                    System.out.println("3. sıra");
                    siralar.setText("bugün 3. araba");
                    ListView listsol3 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciSultanUc);
                    listsol3.setAdapter(solAdaptor3);
                    ListView listsag3 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciKartalUc);
                    listsag3.setAdapter(sagAdaptor3);
                    break;

                case 4:
                    System.out.println("4. sıra");
                    siralar.setText("bugün 4. araba");
                    ListView listsol4 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciSultanDort);
                    listsol4.setAdapter(solAdaptor4);
                    ListView listsag4 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciKartalDort);
                    listsag4.setAdapter(sagAdaptor4);
                    break;

                case 5:
                    System.out.println("5. sıra");
                    siralar.setText("bugün 5. araba");
                    ListView listsol5 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciSultanBes);
                    listsol5.setAdapter(solAdaptor5);
                    ListView listsag5 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciKartalBes);
                    listsag5.setAdapter(sagAdaptor5);
                    break;

                case 6:
                    System.out.println("6. sıra");
                    siralar.setText("bugün 6. araba");
                    ListView listsol6 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciSultanAlti);
                    listsol6.setAdapter(solAdaptor6);
                    ListView listsag6 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciKartalAlti);
                    listsag6.setAdapter(sagAdaptor6);
                    break;

                case 7:
                    System.out.println("7. sıra");
                    siralar.setText("bugün 7. araba");
                    ListView listsol7 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciSultanYedi);
                    listsol7.setAdapter(solAdaptor7);
                    ListView listsag7 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.haftaIciKartalYedi);
                    listsag7.setAdapter(sagAdaptor7);
                    break;

            }
        }
        if (haftaUcDeger == "pazar"){
            System.out.println("pazara girdi");
            switch (aracSiraDeger) {

                case 8:
                    System.out.println("8. sıra");
                    siralar.setText("bugün 8. araba");
                    ListView listsol8 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarSultanSekiz);
                    listsol8.setAdapter(solAdaptor8);
                    ListView listsag8 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarKartalSekiz);
                    listsag8.setAdapter(sagAdaptor8);
                    break;

                case 9:
                    System.out.println("9. sıra");
                    siralar.setText("bugün 9. araba");
                    ListView listsol9 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarSultanDokuz);
                    listsol9.setAdapter(solAdaptor9);
                    ListView listsag9 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarKartalDokuz);
                    listsag9.setAdapter(sagAdaptor9);
                    break;

                case 0:
                    System.out.println("10. sıra");
                    siralar.setText("bugün 10. araba");
                    ListView listsol10 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarSultanOn);
                    listsol10.setAdapter(solAdaptor10);
                    ListView listsag10 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarKartalOn);
                    listsag10.setAdapter(sagAdaptor10);
                    break;

                case 1:
                    System.out.println("1. sıra");
                    siralar.setText("bugün 1. araba");
                    ListView listsol1 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarSultanBir);
                    listsol1.setAdapter(solAdaptor1);
                    ListView listsag1 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarKartalBir);
                    listsag1.setAdapter(sagAdaptor1);
                    break;

                case 2:
                    System.out.println("2. sıra");
                    siralar.setText("bugün 2. araba");
                    ListView listsol2 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarSultanIki);
                    listsol2.setAdapter(solAdaptor2);
                    ListView listsag2 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarKartalIki);
                    listsag2.setAdapter(sagAdaptor2);
                    break;

                case 3:
                    System.out.println("3. sıra");
                    siralar.setText("bugün 3. araba");
                    ListView listsol3 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarSultanUc);
                    listsol3.setAdapter(solAdaptor3);
                    ListView listsag3 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarKartalUc);
                    listsag3.setAdapter(sagAdaptor3);
                    break;

                case 4:
                    System.out.println("4. sıra");
                    siralar.setText("bugün 4. araba");
                    ListView listsol4 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarSultanDort);
                    listsol4.setAdapter(solAdaptor4);
                    ListView listsag4 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarKartalDort);
                    listsag4.setAdapter(sagAdaptor4);
                    break;

                case 5:
                    System.out.println("5. sıra");
                    siralar.setText("bugün 5. araba");
                    ListView listsol5 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarSultanBes);
                    listsol5.setAdapter(solAdaptor5);
                    ListView listsag5 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarKartalBes);
                    listsag5.setAdapter(sagAdaptor5);
                    break;

                case 6:
                    System.out.println("6. sıra");
                    siralar.setText("bugün 6. araba");
                    ListView listsol6 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarSultanAlti);
                    listsol6.setAdapter(solAdaptor6);
                    ListView listsag6 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarKartalAlti);
                    listsag6.setAdapter(sagAdaptor6);
                    break;

                case 7:
                    System.out.println("7. sıra");
                    siralar.setText("bugün 7. araba");
                    ListView listsol7 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarSultanYedi);
                    listsol7.setAdapter(solAdaptor7);
                    ListView listsag7 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.pazarKartalYedi);
                    listsag7.setAdapter(sagAdaptor7);
                    break;

            }
        }
        if (haftaUcDeger == "cumartesi"){
            System.out.println("cumartesiye girdi");
            switch (aracSiraDeger) {

                case 8:
                    System.out.println("8. sıra");
                    siralar.setText("bugün 8. araba");
                    ListView listsol8 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiSultanSekiz);
                    listsol8.setAdapter(solAdaptor8);
                    ListView listsag8 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiKartalSekiz);
                    listsag8.setAdapter(sagAdaptor8);
                    break;

                case 9:
                    System.out.println("9. sıra");
                    siralar.setText("bugün 9. araba");
                    ListView listsol9 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiSultanDokuz);
                    listsol9.setAdapter(solAdaptor9);
                    ListView listsag9 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiKartalDokuz);
                    listsag9.setAdapter(sagAdaptor9);
                    break;

                case 0:
                    System.out.println("10. sıra");
                    siralar.setText("bugün 10. araba");
                    ListView listsol10 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiSultanOn);
                    listsol10.setAdapter(solAdaptor10);
                    ListView listsag10 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiKartalOn);
                    listsag10.setAdapter(sagAdaptor10);
                    break;

                case 1:
                    System.out.println("1. sıra");
                    siralar.setText("bugün 1. araba");
                    ListView listsol1 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiSultanBir);
                    listsol1.setAdapter(solAdaptor1);
                    ListView listsag1 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiKartalBir);
                    listsag1.setAdapter(sagAdaptor1);
                    break;

                case 2:
                    System.out.println("2. sıra");
                    siralar.setText("bugün 2. araba");
                    ListView listsol2 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiSultanIki);
                    listsol2.setAdapter(solAdaptor2);
                    ListView listsag2 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiKartalIki);
                    listsag2.setAdapter(sagAdaptor2);
                    break;

                case 3:
                    System.out.println("3. sıra");
                    siralar.setText("bugün 3. araba");
                    ListView listsol3 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiSultanUc);
                    listsol3.setAdapter(solAdaptor3);
                    ListView listsag3 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiKartalUc);
                    listsag3.setAdapter(sagAdaptor3);
                    break;

                case 4:
                    System.out.println("4. sıra");
                    siralar.setText("bugün 4. araba");
                    ListView listsol4 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiSultanDort);
                    listsol4.setAdapter(solAdaptor4);
                    ListView listsag4 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiKartalDort);
                    listsag4.setAdapter(sagAdaptor4);
                    break;

                case 5:
                    System.out.println("5. sıra");
                    siralar.setText("bugün 5. araba");
                    ListView listsol5 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiSultanBes);
                    listsol5.setAdapter(solAdaptor5);
                    ListView listsag5 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiKartalBes);
                    listsag5.setAdapter(sagAdaptor5);
                    break;

                case 6:
                    System.out.println("6. sıra");
                    siralar.setText("bugün 6. araba");
                    ListView listsol6 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiSultanAlti);
                    listsol6.setAdapter(solAdaptor6);
                    ListView listsag6 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiKartalAlti);
                    listsag6.setAdapter(sagAdaptor6);
                    break;

                case 7:
                    System.out.println("7. sıra");
                    siralar.setText("bugün 7. araba");
                    ListView listsol7 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiSultanYedi);
                    listsol7.setAdapter(solAdaptor7);
                    ListView listsag7 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, saatler.cumartesiKartalYedi);
                    listsag7.setAdapter(sagAdaptor7);
                    break;

            }
        }

    }
    public void yarin(){

    }
    public void setting1(View view) {
        System.out.println("bastı");
        Intent intent = new Intent(getApplicationContext(), setting.class);
        startActivity(intent);
        finish();


    }
}