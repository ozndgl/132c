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
    //haftaiçi
    String[] haftaIciSultanBir = new String[]{"sultanbeyli kalkışı", "5,30", "7,52", "11,12", "14,12", "17,08", "20,35"};
    String[] haftaIciKartalBir = new String[]{"kartal kalkışı", "6,30", "9,25", "12,37", "15,35", "18,40", "21,55"};

    String[] haftaIciSultanIki = new String[]{"sultanbeyli kalkışı", "5,50", "08,07", "11,27", "14,29", "17,28", "21,05"};
    String[] haftaIciKartalIki = new String[]{"kartal kalkışı", "06,50", "9,40", "12,57", "15,50", "18,55", "22,20"};

    String[] haftaIciSultanUc = new String[]{"sultanbeyli kalkışı", "06,05", "08,27", "11,45", "14,53", "17,50"};
    String[] haftaIciKartalUc = new String[]{"kartal kalkışı", "07,10", "10,00", "13,12", "16,08", "19,15"};

    String[] haftaIciSultanDort = new String[]{"sultanbeyli kalkışı", "06,18", "08,55", "11,58", "15,08", "18,15"};
    String[] haftaIciKartalDort = new String[]{"kartal kalkışı", "07,30", "10,20", "13,35", "16,27", "19,35"};

    String[] haftaIciSultanBes = new String[]{"sultanbeyli kalkışı", "06,32", "09,17", "12,15", "15,25", "18,30"};
    String[] haftaIciKartalBes = new String[]{"kartal kalkışı", "07,50", "10,35", "13,50", "16,45", "19,55"};

    String[] haftaIciSultanAlti = new String[]{"sultanbeyli kalkışı", "06,45", "09,35", "12,30", "15,40", "18,50"};
    String[] haftaIciKartalAlti = new String[]{"kartal kalkışı", "08,07", "10,53", "14,10", "17,05", "20,15"};

    String[] haftaIciSultanYedi = new String[]{"sultanbeyli kalkışı", "06,58", "09,53", "12,52", "15,55", "19,15"};
    String[] haftaIciKartalYedi = new String[]{"kartal kalkışı", "08,23", "11,10", "14,30", "17,23", "20,40"};

    String[] haftaIciSultanSekiz = new String[]{"sultanbeyli kalkışı", "07,12", "10,15", "13,10", "16,10", "19,35"};
    String[] haftaIciKartalSekiz = new String[]{"kartal kalkışı", "8,40", "11,32", "14,48", "17,40", "21,00"};

    String[] haftaIciSultanDokuz = new String[]{"sultanbeyli kalkışı", "7,25", "10,35", "13,35", "16,28", "19,50"};
    String[] haftaIciKartalDokuz = new String[]{"kartal kalkışı", "8,55", "11,55", "15,02", "18,00", "21,20"};

    String[] haftaIciSultanOn = new String[]{"sultanbeyli kalkışı", "7,40", "10,52", "13,55", "16,48", "20,08"};
    String[] haftaIciKartalOn = new String[]{"kartal kalkışı", "9,10", "12,15", "15,17", "18,20", "21,38"};
    ////cumartesi
    String[] cumartesiSultanBir = new String[]{"sultanbeyli kalkışı", "5,40", "8,35", "11,43", "14,57", "18,10"};
    String[] cumartesiKartalBir = new String[]{"kartal kalkışı", "06,35", "9,55", "13,10", "16,30", "19,30"};

    String[] cumartesiSultanIki = new String[]{"sultanbeyli kalkışı", "06,05", "08,50", "12,07", "15,17", "18,30"};
    String[] cumartesiKartalIki = new String[]{"kartal kalkışı", "07,05", "10,10", "13,30", "16,50", "19,50"};

    String[] cumartesiSultanUc = new String[]{"sultanbeyli kalkışı", "06,25", "09,10", "12,22", "15,35", "18,55"};
    String[] cumartesiKartalUc = new String[]{"kartal kalkışı", "07,25", "10,30", "13,50", "17,10", "20,10"};

    String[] cumartesiSultanDort = new String[]{"sultanbeyli kalkışı", "06,45", "09,34", "12,42", "15,52", "19,15"};
    String[] cumartesiKartalDort = new String[]{"kartal kalkışı", "07,50", "10,55", "14,05", "17,30", "20,30"};

    String[] cumartesiSultanBes = new String[]{"sultanbeyli kalkışı", "07,05", "09,55", "13,05", "16,08", "19,33"};
    String[] cumartesiKartalBes = new String[]{"kartal kalkışı", "08,15", "11,15", "14,20", "17,47", "20,50"};

    String[] cumartesiSultanAlti = new String[]{"sultanbeyli kalkışı", "07,20", "10,15", "13,24", "16,30", "19,53"};
    String[] cumartesiKartalAlti = new String[]{"kartal kalkışı", "6,35", "11,35", "14,40", "18,02", "21,05"};

    String[] cumartesiSultanYedi = new String[]{"sultanbeyli kalkışı", "07,35", "10,35", "13,42", "16,45", "20,13"};
    String[] cumartesiKartalYedi = new String[]{"kartal kalkışı", "08,55", "11,55", "15,05", "18,17", "21,20"};

    String[] cumartesiSultanSekiz = new String[]{"sultanbeyli kalkışı", "07,50", "10,55", "13,57", "17,03", "20,30"};
    String[] cumartesiKartalSekiz = new String[]{"kartal kalkışı", "09,10", "12,15", "15,30", "18,30", "21,40"};

    String[] cumartesiSultanDokuz = new String[]{"sultanbeyli kalkışı", "08,05", "11,10", "14,20", "17,25", "20,50"};
    String[] cumartesiKartalDokuz = new String[]{"kartal kalkışı", "09,25", "12,35", "15,50", "18,45", "22,00"};

    String[] cumartesiSultanOn = new String[]{"sultanbeyli kalkışı", "08,20", "11,24", "14,40", "17,45", "21,10"};
    String[] cumartesiKartalOn = new String[]{"kartal kalkışı", "09,40", "12,50", "16,10", "19,10", "22,25"};
    ////pazar
    String[] pazarSultanBir = new String[]{"sultanbeyli kalkışı", "05,40", "08,37", "11,50", "14,55", "18,18"};
    String[] pazarKartalBir = new String[]{"kartal kalkışı", "06,40", "10,05", "13,10", "16,35", "19,45"};

    String[] pazarSultanIki = new String[]{"sultanbeyli kalkışı", "05,58", "08,53", "12,07", "15,20", "18,38"};
    String[] pazarKartalIki = new String[]{"kartal kalkışı", "07,00", "10,20", "13,30", "16,50", "20,05"};

    String[] pazarSultanUc = new String[]{"sultanbeyli kalkışı", "06,18", "09,07", "12,30", "15,42", "18,58"};
    String[] pazarKartalUc = new String[]{"kartal kalkışı", "07,25", "10,45", "13,50", "17,05", "20,20"};

    String[] pazarSultanDort = new String[]{"sultanbeyli kalkışı", "06,38", "09,30", "12,46", "16,00", "19,18"};
    String[] pazarKartalDort = new String[]{"kartal kalkışı", "07,50", "11,02", "14,10", "17,25", "20,40"};

    String[] pazarSultanBes = new String[]{"sultanbeyli kalkışı", "06,58", "09,55", "13,03", "16,18", "19,38"};
    String[] pazarKartalBes = new String[]{"kartal kalkışı", "08,15", "11,18", "14,30", "17,40", "21,00"};

    String[] pazarSultanAlti = new String[]{"sultanbeyli kalkışı", "07,18", "10,13", "13,25", "16,37", "19,58"};
    String[] pazarKartalAlti = new String[]{"kartal kalkışı", "06,35", "11,32", "14,55", "18,00", "21,20"};

    String[] pazarSultanYedi = new String[]{"sultanbeyli kalkışı", "07,33", "10,36", "13,40", "16,58", "20,18"};
    String[] pazarKartalYedi = new String[]{"kartal kalkışı", "08,55", "11,55", "15,15", "18,20", "21,38"};

    String[] pazarSultanSekiz = new String[]{"sultanbeyli kalkışı", "07,48", "10,55", "13,55", "17,20", "20,38"};
    String[] pazarKartalSekiz = new String[]{"kartal kalkışı", "09,10", "12,15", "15,35", "18,40", "21,58"};

    String[] pazarSultanDokuz = new String[]{"sultanbeyli kalkışı", "08,03", "11,11", "14,13", "17,43", "20,58"};
    String[] pazarKartalDokuz = new String[]{"kartal kalkışı", "09,30", "12,30", "15,55", "19,05", "22,20"};

    String[] pazarSultanOn = new String[]{"sultanbeyli kalkışı", "08,18", "11,35", "14,35", "18,00", "21,15"};
    String[] pazarKartalOn = new String[]{"kartal kalkışı", "09,45", "12,50", "16,15", "19,25", "22,35"};


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
            int deger = (yilHaneİnt + 10) - 1;
            int degerLenght = String.valueOf(deger).length();
            String degerSonRakam = String.valueOf(deger).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + deger + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);

        } else if (aracKod == 781) {
            int deger = (yilHaneİnt + 10) -0 ;
            int degerLenght = String.valueOf(deger).length();
            String degerSonRakam = String.valueOf(deger).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + deger + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);

        } else if (aracKod == 782) {
            int deger = (yilHaneİnt + 10) - 9;
            int degerLenght = String.valueOf(deger).length();
            String degerSonRakam = String.valueOf(deger).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + deger + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);
        } else if (aracKod == 783) {
            int deger = (yilHaneİnt + 10) - 8;
            int degerLenght = String.valueOf(deger).length();
            String degerSonRakam = String.valueOf(deger).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + deger + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);
        } else if (aracKod == 784) {
            int deger = (yilHaneİnt + 10) - 7;
            int degerLenght = String.valueOf(deger).length();
            String degerSonRakam = String.valueOf(deger).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + deger + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);
        } else if (aracKod == 785) {
            int deger = (yilHaneİnt + 10) - 6;
            int degerLenght = String.valueOf(deger).length();
            String degerSonRakam = String.valueOf(deger).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + deger + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);
        } else if (aracKod == 786) {
            int deger = (yilHaneİnt + 10) - 5;
            int degerLenght = String.valueOf(deger).length();
            String degerSonRakam = String.valueOf(deger).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + deger + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);
        } else if (aracKod == 787) {
            int deger = (yilHaneİnt + 10) - 4;
            int degerLenght = String.valueOf(deger).length();
            String degerSonRakam = String.valueOf(deger).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + deger + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);

        } else if (aracKod == 788) {
            int deger = (yilHaneİnt + 10) - 3;
            int degerLenght = String.valueOf(deger).length();
            String degerSonRakam = String.valueOf(deger).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + deger + "uzunluk. " + degerLenght);
            System.out.println("değer son rakam: " + degerSonRakam);
            aracSiraDeger = Integer.parseInt(degerSonRakam);
        } else if (aracKod == 789) {
            int deger = (yilHaneİnt + 10) - 2;
            int degerLenght = String.valueOf(deger).length();
            String degerSonRakam = String.valueOf(deger).substring(degerLenght - 1);
            System.out.println("çalıştığı sıra: " + deger + "uzunluk. " + degerLenght);
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


        System.out.println("haftanın günü rakam: " + haftaGunalSon);
        System.out.println("yıl günü: " + yilgun);
        System.out.println("yıl hane: " + yilHane);
        System.out.println("yil son rakamı: " + yilSonRakam);

        if (haftaUcDeger == "haftaici"){
            System.out.println("hafta içine girdi");
            switch (aracSiraDeger) {

                case 8:
                    System.out.println("8. sıra");
                    siralar.setText("bugün 8. araba");
                    ListView listsol8 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciSultanSekiz);
                    listsol8.setAdapter(solAdaptor8);
                    ListView listsag8 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciKartalSekiz);
                    listsag8.setAdapter(sagAdaptor8);
                    break;

                case 9:
                    System.out.println("9. sıra");
                    siralar.setText("bugün 9. araba");
                    ListView listsol9 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciSultanDokuz);
                    listsol9.setAdapter(solAdaptor9);
                    ListView listsag9 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciKartalDokuz);
                    listsag9.setAdapter(sagAdaptor9);
                    break;

                case 0:
                    System.out.println("10. sıra");
                    siralar.setText("bugün 10. araba");
                    ListView listsol10 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciSultanOn);
                    listsol10.setAdapter(solAdaptor10);
                    ListView listsag10 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciKartalOn);
                    listsag10.setAdapter(sagAdaptor10);
                    break;

                case 1:
                    System.out.println("1. sıra");
                    siralar.setText("bugün 1. araba");
                    ListView listsol1 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciSultanBir);
                    listsol1.setAdapter(solAdaptor1);
                    ListView listsag1 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciKartalBir);
                    listsag1.setAdapter(sagAdaptor1);
                    break;

                case 2:
                    System.out.println("2. sıra");
                    siralar.setText("bugün 2. araba");
                    ListView listsol2 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciSultanIki);
                    listsol2.setAdapter(solAdaptor2);
                    ListView listsag2 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciKartalIki);
                    listsag2.setAdapter(sagAdaptor2);
                    break;

                case 3:
                    System.out.println("3. sıra");
                    siralar.setText("bugün 3. araba");
                    ListView listsol3 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciSultanUc);
                    listsol3.setAdapter(solAdaptor3);
                    ListView listsag3 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciKartalUc);
                    listsag3.setAdapter(sagAdaptor3);
                    break;

                case 4:
                    System.out.println("4. sıra");
                    siralar.setText("bugün 4. araba");
                    ListView listsol4 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciSultanDort);
                    listsol4.setAdapter(solAdaptor4);
                    ListView listsag4 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciKartalDort);
                    listsag4.setAdapter(sagAdaptor4);
                    break;

                case 5:
                    System.out.println("5. sıra");
                    siralar.setText("bugün 5. araba");
                    ListView listsol5 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciSultanBes);
                    listsol5.setAdapter(solAdaptor5);
                    ListView listsag5 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciKartalBes);
                    listsag5.setAdapter(sagAdaptor5);
                    break;

                case 6:
                    System.out.println("6. sıra");
                    siralar.setText("bugün 6. araba");
                    ListView listsol6 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciSultanAlti);
                    listsol6.setAdapter(solAdaptor6);
                    ListView listsag6 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciKartalAlti);
                    listsag6.setAdapter(sagAdaptor6);
                    break;

                case 7:
                    System.out.println("7. sıra");
                    siralar.setText("bugün 7. araba");
                    ListView listsol7 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciSultanYedi);
                    listsol7.setAdapter(solAdaptor7);
                    ListView listsag7 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, haftaIciKartalYedi);
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
                    ArrayAdapter<String> solAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarSultanSekiz);
                    listsol8.setAdapter(solAdaptor8);
                    ListView listsag8 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarKartalSekiz);
                    listsag8.setAdapter(sagAdaptor8);
                    break;

                case 9:
                    System.out.println("9. sıra");
                    siralar.setText("bugün 9. araba");
                    ListView listsol9 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarSultanDokuz);
                    listsol9.setAdapter(solAdaptor9);
                    ListView listsag9 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarKartalDokuz);
                    listsag9.setAdapter(sagAdaptor9);
                    break;

                case 0:
                    System.out.println("10. sıra");
                    siralar.setText("bugün 10. araba");
                    ListView listsol10 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarSultanOn);
                    listsol10.setAdapter(solAdaptor10);
                    ListView listsag10 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarKartalOn);
                    listsag10.setAdapter(sagAdaptor10);
                    break;

                case 1:
                    System.out.println("1. sıra");
                    siralar.setText("bugün 1. araba");
                    ListView listsol1 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarSultanBir);
                    listsol1.setAdapter(solAdaptor1);
                    ListView listsag1 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarKartalBir);
                    listsag1.setAdapter(sagAdaptor1);
                    break;

                case 2:
                    System.out.println("2. sıra");
                    siralar.setText("bugün 2. araba");
                    ListView listsol2 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarSultanIki);
                    listsol2.setAdapter(solAdaptor2);
                    ListView listsag2 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarKartalIki);
                    listsag2.setAdapter(sagAdaptor2);
                    break;

                case 3:
                    System.out.println("3. sıra");
                    siralar.setText("bugün 3. araba");
                    ListView listsol3 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarSultanUc);
                    listsol3.setAdapter(solAdaptor3);
                    ListView listsag3 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarKartalUc);
                    listsag3.setAdapter(sagAdaptor3);
                    break;

                case 4:
                    System.out.println("4. sıra");
                    siralar.setText("bugün 4. araba");
                    ListView listsol4 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarSultanDort);
                    listsol4.setAdapter(solAdaptor4);
                    ListView listsag4 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarKartalDort);
                    listsag4.setAdapter(sagAdaptor4);
                    break;

                case 5:
                    System.out.println("5. sıra");
                    siralar.setText("bugün 5. araba");
                    ListView listsol5 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarSultanBes);
                    listsol5.setAdapter(solAdaptor5);
                    ListView listsag5 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarKartalBes);
                    listsag5.setAdapter(sagAdaptor5);
                    break;

                case 6:
                    System.out.println("6. sıra");
                    siralar.setText("bugün 6. araba");
                    ListView listsol6 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarSultanAlti);
                    listsol6.setAdapter(solAdaptor6);
                    ListView listsag6 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarKartalAlti);
                    listsag6.setAdapter(sagAdaptor6);
                    break;

                case 7:
                    System.out.println("7. sıra");
                    siralar.setText("bugün 7. araba");
                    ListView listsol7 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarSultanYedi);
                    listsol7.setAdapter(solAdaptor7);
                    ListView listsag7 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pazarKartalYedi);
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
                    ArrayAdapter<String> solAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiSultanSekiz);
                    listsol8.setAdapter(solAdaptor8);
                    ListView listsag8 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiKartalSekiz);
                    listsag8.setAdapter(sagAdaptor8);
                    break;

                case 9:
                    System.out.println("9. sıra");
                    siralar.setText("bugün 9. araba");
                    ListView listsol9 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiSultanDokuz);
                    listsol9.setAdapter(solAdaptor9);
                    ListView listsag9 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiKartalDokuz);
                    listsag9.setAdapter(sagAdaptor9);
                    break;

                case 0:
                    System.out.println("10. sıra");
                    siralar.setText("bugün 10. araba");
                    ListView listsol10 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiSultanOn);
                    listsol10.setAdapter(solAdaptor10);
                    ListView listsag10 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiKartalOn);
                    listsag10.setAdapter(sagAdaptor10);
                    break;

                case 1:
                    System.out.println("1. sıra");
                    siralar.setText("bugün 1. araba");
                    ListView listsol1 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiSultanBir);
                    listsol1.setAdapter(solAdaptor1);
                    ListView listsag1 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiKartalBir);
                    listsag1.setAdapter(sagAdaptor1);
                    break;

                case 2:
                    System.out.println("2. sıra");
                    siralar.setText("bugün 2. araba");
                    ListView listsol2 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiSultanIki);
                    listsol2.setAdapter(solAdaptor2);
                    ListView listsag2 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiKartalIki);
                    listsag2.setAdapter(sagAdaptor2);
                    break;

                case 3:
                    System.out.println("3. sıra");
                    siralar.setText("bugün 3. araba");
                    ListView listsol3 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiSultanUc);
                    listsol3.setAdapter(solAdaptor3);
                    ListView listsag3 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiKartalUc);
                    listsag3.setAdapter(sagAdaptor3);
                    break;

                case 4:
                    System.out.println("4. sıra");
                    siralar.setText("bugün 4. araba");
                    ListView listsol4 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiSultanDort);
                    listsol4.setAdapter(solAdaptor4);
                    ListView listsag4 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiKartalDort);
                    listsag4.setAdapter(sagAdaptor4);
                    break;

                case 5:
                    System.out.println("5. sıra");
                    siralar.setText("bugün 5. araba");
                    ListView listsol5 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiSultanBes);
                    listsol5.setAdapter(solAdaptor5);
                    ListView listsag5 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiKartalBes);
                    listsag5.setAdapter(sagAdaptor5);
                    break;

                case 6:
                    System.out.println("6. sıra");
                    siralar.setText("bugün 6. araba");
                    ListView listsol6 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiSultanAlti);
                    listsol6.setAdapter(solAdaptor6);
                    ListView listsag6 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiKartalAlti);
                    listsag6.setAdapter(sagAdaptor6);
                    break;

                case 7:
                    System.out.println("7. sıra");
                    siralar.setText("bugün 7. araba");
                    ListView listsol7 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiSultanYedi);
                    listsol7.setAdapter(solAdaptor7);
                    ListView listsag7 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cumartesiKartalYedi);
                    listsag7.setAdapter(sagAdaptor7);
                    break;

            }
        }

    }


    public void setting1(View view) {
        System.out.println("bastı");
        Intent intent = new Intent(getApplicationContext(), setting.class);
        startActivity(intent);
        finish();


    }
}