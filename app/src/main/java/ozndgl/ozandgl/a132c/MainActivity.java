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
    int haftaİleri ;
    String haftaIleriStr;

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
        TextView ertesiGunView = (TextView)findViewById(R.id.ertesiView);


        System.out.println("haftagunalson: " + haftaGunalSon);
        System.out.println("haftagunal hatalı: " + haftagunal);
        System.out.println("yıl günü: " + yilgun);
        System.out.println("yıl hane: " + yilHane);
        System.out.println("yil son rakamı: " + yilSonRakam);

        System.out.println("hafta ileri :"+haftaİleri);

        sharedPreferences = this.getSharedPreferences("ozndgl.ozandgl.a132c", Context.MODE_PRIVATE);
        aracKod = sharedPreferences.getInt("arackod", 0);
        arac.setText("C-" + aracKod);
        System.out.println("gelen veri: " + aracKod);


        switch (haftaGunalSon) {
            case 1:
                haftaİleri = 2;
                haftaIleriStr = "Pazartesi: ";
                break;

            case 2:
                haftaİleri = 3;
                haftaIleriStr = "Salı: ";
                break;

            case 3:
                haftaİleri = 4;
                haftaIleriStr = "Çarşamba: ";
                break;

            case 4:
                haftaİleri = 5;
                haftaIleriStr = "Perşembe: ";
                break;

            case 5:
                haftaİleri = 6;
                haftaIleriStr = "Cuma: ";
                break;

            case 6:
                haftaİleri = 7;
                haftaIleriStr = "Cumartesi: ";
                break;

            case 7:
                haftaİleri = 1;
                haftaIleriStr = "Pazar: ";
                break;
        }

        if (aracKod == 0) {
            System.out.println("lütfen araç seçiniz");
            Toast.makeText(getApplicationContext(), "lütfen ayarlardan araç kodu seçiniz", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
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
            int gun = (yilHaneİnt + 10) - 0;
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


        if (haftaUcDeger == "haftaici") {
            System.out.println("hafta içine girdi");
            switch (aracSiraDeger) {

                case 8:
                    System.out.println("8. sıra");
                    siralar.setText("bugün 8. araba");
                    ListView listsol8 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciSultanSekiz);
                    listsol8.setAdapter(solAdaptor8);
                    ListView listsag8 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciKartalSekiz);
                    listsag8.setAdapter(sagAdaptor8);
                    if((haftaİleri ==3|| haftaİleri ==4|| haftaİleri ==5|| haftaİleri ==6)) {
                        System.out.println(Saatler.haftaIciSultanDokuz[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanDokuz[1]);
                    }
                    if((haftaİleri ==7)) {
                        System.out.println(Saatler.cumartesiSultanDokuz[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.cumartesiSultanDokuz[1]);
                    }

                    break;

                case 9:
                    System.out.println("9. sıra");
                    siralar.setText("bugün 9. araba");
                    ListView listsol9 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciSultanDokuz);
                    listsol9.setAdapter(solAdaptor9);
                    ListView listsag9 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciKartalDokuz);
                    listsag9.setAdapter(sagAdaptor9);
                    if((haftaİleri ==3|| haftaİleri ==4|| haftaİleri ==5|| haftaİleri ==6)) {
                        System.out.println(Saatler.haftaIciSultanOn[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanOn[1]);
                    }
                    if((haftaİleri ==7)) {
                        System.out.println(Saatler.cumartesiSultanOn[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.cumartesiSultanOn[1]);
                    }
                    break;

                case 0:
                    System.out.println("10. sıra");
                    siralar.setText("bugün 10. araba");
                    ListView listsol10 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciSultanOn);
                    listsol10.setAdapter(solAdaptor10);
                    ListView listsag10 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciKartalOn);
                    listsag10.setAdapter(sagAdaptor10);
                    if((haftaİleri ==3|| haftaİleri ==4|| haftaİleri ==5|| haftaİleri ==6)) {
                        System.out.println(Saatler.haftaIciSultanBir[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanBir[1]);
                    }
                    if((haftaİleri ==7)) {
                        System.out.println(Saatler.cumartesiSultanBir[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.cumartesiSultanBir[1]);
                    }
                    break;

                case 1:
                    System.out.println("1. sıra");
                    siralar.setText("bugün 1. araba");
                    ListView listsol1 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciSultanBir);
                    listsol1.setAdapter(solAdaptor1);
                    ListView listsag1 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciKartalBir);
                    listsag1.setAdapter(sagAdaptor1);
                    if((haftaİleri ==3|| haftaİleri ==4|| haftaİleri ==5|| haftaİleri ==6)) {
                        System.out.println(Saatler.haftaIciSultanIki[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanIki[1]);
                    }
                    if((haftaİleri ==7)) {
                        System.out.println(Saatler.cumartesiSultanIki[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.cumartesiSultanIki[1]);
                    }
                    break;

                case 2:
                    System.out.println("2. sıra");
                    siralar.setText("bugün 2. araba");
                    ListView listsol2 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciSultanIki);
                    listsol2.setAdapter(solAdaptor2);
                    ListView listsag2 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciKartalIki);
                    listsag2.setAdapter(sagAdaptor2);
                    if((haftaİleri ==3|| haftaİleri ==4|| haftaİleri ==5|| haftaİleri ==6)) {
                        System.out.println(Saatler.haftaIciSultanUc[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanUc[1]);
                    }
                    if((haftaİleri ==7)) {
                        System.out.println(Saatler.cumartesiSultanUc[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.cumartesiSultanUc[1]);
                    }
                    break;

                case 3:
                    System.out.println("3. sıra");
                    siralar.setText("bugün 3. araba");
                    ListView listsol3 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciSultanUc);
                    listsol3.setAdapter(solAdaptor3);
                    ListView listsag3 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciKartalUc);
                    listsag3.setAdapter(sagAdaptor3);
                    if((haftaİleri ==3|| haftaİleri ==4|| haftaİleri ==5|| haftaİleri ==6)) {
                        System.out.println(Saatler.haftaIciSultanDort[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanDort[1]);
                    }
                    if((haftaİleri ==7)) {
                        System.out.println(Saatler.cumartesiSultanDort[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.cumartesiSultanDort[1]);
                    }
                    break;

                case 4:
                    System.out.println("4. sıra");
                    siralar.setText("bugün 4. araba");
                    ListView listsol4 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciSultanDort);
                    listsol4.setAdapter(solAdaptor4);
                    ListView listsag4 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciKartalDort);
                    listsag4.setAdapter(sagAdaptor4);
                    if((haftaİleri ==3|| haftaİleri ==4|| haftaİleri ==5|| haftaİleri ==6)) {
                        System.out.println(Saatler.haftaIciSultanBes[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanBes[1]);
                    }
                    if((haftaİleri ==7)) {
                        System.out.println(Saatler.cumartesiSultanBes[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.cumartesiSultanBes[1]);
                    }
                    break;

                case 5:
                    System.out.println("5. sıra");
                    siralar.setText("bugün 5. araba");
                    ListView listsol5 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciSultanBes);
                    listsol5.setAdapter(solAdaptor5);
                    ListView listsag5 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciKartalBes);
                    listsag5.setAdapter(sagAdaptor5);
                    if((haftaİleri ==3|| haftaİleri ==4|| haftaİleri ==5|| haftaİleri ==6)) {
                        System.out.println(Saatler.haftaIciSultanAlti[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanAlti[1]);
                    }
                    if((haftaİleri ==7)) {
                        System.out.println(Saatler.cumartesiSultanAlti[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.cumartesiSultanAlti[1]);
                    }
                    break;

                case 6:
                    System.out.println("6. sıra");
                    siralar.setText("bugün 6. araba");
                    ListView listsol6 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciSultanAlti);
                    listsol6.setAdapter(solAdaptor6);
                    ListView listsag6 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciKartalAlti);
                    listsag6.setAdapter(sagAdaptor6);
                    if((haftaİleri ==3|| haftaİleri ==4|| haftaİleri ==5|| haftaİleri ==6)) {
                        System.out.println(Saatler.haftaIciSultanYedi[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanYedi[1]);
                    }
                    if((haftaİleri ==7)) {
                        System.out.println(Saatler.cumartesiSultanYedi[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.cumartesiSultanYedi[1]);
                    }
                    break;

                case 7:
                    System.out.println("7. sıra");
                    siralar.setText("bugün 7. araba");
                    ListView listsol7 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciSultanYedi);
                    listsol7.setAdapter(solAdaptor7);
                    ListView listsag7 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.haftaIciKartalYedi);
                    listsag7.setAdapter(sagAdaptor7);
                    if((haftaİleri ==3|| haftaİleri ==4|| haftaİleri ==5|| haftaİleri ==6)) {
                        System.out.println(Saatler.haftaIciSultanSekiz[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanSekiz[1]);
                    }
                    if((haftaİleri ==7)) {
                        System.out.println(Saatler.cumartesiSultanSekiz[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.cumartesiSultanSekiz[1]);
                    }
                    break;
            }
        }
        if (haftaUcDeger == "pazar") {
            System.out.println("pazara girdi");
            switch (aracSiraDeger) {

                case 8:
                    System.out.println("8. sıra");
                    siralar.setText("bugün 8. araba");
                    ListView listsol8 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarSultanSekiz);
                    listsol8.setAdapter(solAdaptor8);
                    ListView listsag8 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarKartalSekiz);
                    listsag8.setAdapter(sagAdaptor8);
                    if((haftaİleri ==2)) {
                        System.out.println(Saatler.haftaIciSultanDokuz[1]);
                        ertesiGunView.setText("yarın kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanDokuz[1]);
                    }
                    break;

                case 9:
                    System.out.println("9. sıra");
                    siralar.setText("bugün 9. araba");
                    ListView listsol9 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarSultanDokuz);
                    listsol9.setAdapter(solAdaptor9);
                    ListView listsag9 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarKartalDokuz);
                    listsag9.setAdapter(sagAdaptor9);
                    if((haftaİleri ==2)) {
                        System.out.println(Saatler.haftaIciSultanOn[1]);
                        ertesiGunView.setText("yarın kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanOn[1]);
                    }

                    break;

                case 0:
                    System.out.println("10. sıra");
                    siralar.setText("bugün 10. araba");
                    ListView listsol10 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarSultanOn);
                    listsol10.setAdapter(solAdaptor10);
                    ListView listsag10 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarKartalOn);
                    listsag10.setAdapter(sagAdaptor10);
                    if((haftaİleri ==2)) {
                        System.out.println(Saatler.haftaIciSultanBir[1]);
                        ertesiGunView.setText("yarın kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanBir[1]);
                    }
                    break;

                case 1:
                    System.out.println("1. sıra");
                    siralar.setText("bugün 1. araba");
                    ListView listsol1 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarSultanBir);
                    listsol1.setAdapter(solAdaptor1);
                    ListView listsag1 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarKartalBir);
                    listsag1.setAdapter(sagAdaptor1);
                    if((haftaİleri ==2)) {
                        System.out.println(Saatler.haftaIciSultanIki[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanIki[1]);
                    }
                    break;

                case 2:
                    System.out.println("2. sıra");
                    siralar.setText("bugün 2. araba");
                    ListView listsol2 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarSultanIki);
                    listsol2.setAdapter(solAdaptor2);
                    ListView listsag2 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarKartalIki);
                    listsag2.setAdapter(sagAdaptor2);
                    if((haftaİleri ==2)) {
                        System.out.println(Saatler.haftaIciSultanUc[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanUc[1]);
                    }
                    break;

                case 3:
                    System.out.println("3. sıra");
                    siralar.setText("bugün 3. araba");
                    ListView listsol3 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarSultanUc);
                    listsol3.setAdapter(solAdaptor3);
                    ListView listsag3 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarKartalUc);
                    listsag3.setAdapter(sagAdaptor3);
                    if((haftaİleri ==2)) {
                        System.out.println(Saatler.haftaIciSultanDort[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanDort[1]);
                    }
                    break;

                case 4:
                    System.out.println("4. sıra");
                    siralar.setText("bugün 4. araba");
                    ListView listsol4 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarSultanDort);
                    listsol4.setAdapter(solAdaptor4);
                    ListView listsag4 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarKartalDort);
                    listsag4.setAdapter(sagAdaptor4);
                    if((haftaİleri ==2)) {
                        System.out.println(Saatler.haftaIciSultanBes[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanBes[1]);
                    }
                    break;

                case 5:
                    System.out.println("5. sıra");
                    siralar.setText("bugün 5. araba");
                    ListView listsol5 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarSultanBes);
                    listsol5.setAdapter(solAdaptor5);
                    ListView listsag5 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarKartalBes);
                    listsag5.setAdapter(sagAdaptor5);
                    if((haftaİleri ==2)) {
                        System.out.println(Saatler.haftaIciSultanAlti[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanAlti[1]);
                    }
                    break;

                case 6:
                    System.out.println("6. sıra");
                    siralar.setText("bugün 6. araba");
                    ListView listsol6 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarSultanAlti);
                    listsol6.setAdapter(solAdaptor6);
                    ListView listsag6 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarKartalAlti);
                    listsag6.setAdapter(sagAdaptor6);
                    if((haftaİleri ==2)) {
                        System.out.println(Saatler.haftaIciSultanYedi[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanYedi[1]);
                    }
                    break;

                case 7:
                    System.out.println("7. sıra");
                    siralar.setText("bugün 7. araba");
                    ListView listsol7 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarSultanYedi);
                    listsol7.setAdapter(solAdaptor7);
                    ListView listsag7 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.pazarKartalYedi);
                    listsag7.setAdapter(sagAdaptor7);
                    if((haftaİleri ==2)) {
                        System.out.println(Saatler.haftaIciSultanSekiz[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.haftaIciSultanSekiz[1]);
                    }
                    break;

            }
        }
        if (haftaUcDeger == "cumartesi") {
            System.out.println("cumartesiye girdi");
            switch (aracSiraDeger) {

                case 8:
                    System.out.println("8. sıra");
                    siralar.setText("bugün 8. araba");
                    ListView listsol8 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiSultanSekiz);
                    listsol8.setAdapter(solAdaptor8);
                    ListView listsag8 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor8 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiKartalSekiz);
                    listsag8.setAdapter(sagAdaptor8);
                    if((haftaİleri ==1)) {
                        System.out.println(Saatler.pazarSultanDokuz[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.pazarSultanDokuz[1]);
                    }
                    break;

                case 9:
                    System.out.println("9. sıra");
                    siralar.setText("bugün 9. araba");
                    ListView listsol9 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiSultanDokuz);
                    listsol9.setAdapter(solAdaptor9);
                    ListView listsag9 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor9 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiKartalDokuz);
                    listsag9.setAdapter(sagAdaptor9);
                    if((haftaİleri ==1)) {
                        System.out.println(Saatler.pazarSultanOn[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.pazarSultanOn[1]);
                    }
                    break;

                case 0:
                    System.out.println("10. sıra");
                    siralar.setText("bugün 10. araba");
                    ListView listsol10 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiSultanOn);
                    listsol10.setAdapter(solAdaptor10);
                    ListView listsag10 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor10 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiKartalOn);
                    listsag10.setAdapter(sagAdaptor10);
                    if((haftaİleri ==1)) {
                        System.out.println(Saatler.pazarSultanBir[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.pazarSultanBir[1]);
                    }
                    break;

                case 1:
                    System.out.println("1. sıra");
                    siralar.setText("bugün 1. araba");
                    ListView listsol1 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiSultanBir);
                    listsol1.setAdapter(solAdaptor1);
                    ListView listsag1 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiKartalBir);
                    listsag1.setAdapter(sagAdaptor1);
                    if((haftaİleri ==1)) {
                        System.out.println(Saatler.pazarSultanIki[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.pazarSultanIki[1]);
                    }
                    break;

                case 2:
                    System.out.println("2. sıra");
                    siralar.setText("bugün 2. araba");
                    ListView listsol2 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiSultanIki);
                    listsol2.setAdapter(solAdaptor2);
                    ListView listsag2 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiKartalIki);
                    listsag2.setAdapter(sagAdaptor2);
                    if((haftaİleri ==1)) {
                        System.out.println(Saatler.pazarSultanUc[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.pazarSultanUc[1]);
                    }
                    break;

                case 3:
                    System.out.println("3. sıra");
                    siralar.setText("bugün 3. araba");
                    ListView listsol3 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiSultanUc);
                    listsol3.setAdapter(solAdaptor3);
                    ListView listsag3 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiKartalUc);
                    listsag3.setAdapter(sagAdaptor3);
                    if((haftaİleri ==1)) {
                        System.out.println(Saatler.pazarSultanDort[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.pazarSultanDort[1]);
                    }
                    break;

                case 4:
                    System.out.println("4. sıra");
                    siralar.setText("bugün 4. araba");
                    ListView listsol4 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiSultanDort);
                    listsol4.setAdapter(solAdaptor4);
                    ListView listsag4 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiKartalDort);
                    listsag4.setAdapter(sagAdaptor4);
                    if((haftaİleri ==1)) {
                        System.out.println(Saatler.pazarSultanBes[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.pazarSultanBes[1]);
                    }
                    break;

                case 5:
                    System.out.println("5. sıra");
                    siralar.setText("bugün 5. araba");
                    ListView listsol5 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiSultanBes);
                    listsol5.setAdapter(solAdaptor5);
                    ListView listsag5 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor5 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiKartalBes);
                    listsag5.setAdapter(sagAdaptor5);
                    if((haftaİleri ==1)) {
                        System.out.println(Saatler.pazarSultanAlti[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.pazarSultanAlti[1]);
                    }
                    break;

                case 6:
                    System.out.println("6. sıra");
                    siralar.setText("bugün 6. araba");
                    ListView listsol6 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiSultanAlti);
                    listsol6.setAdapter(solAdaptor6);
                    ListView listsag6 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor6 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiKartalAlti);
                    listsag6.setAdapter(sagAdaptor6);
                    if((haftaİleri ==1)) {
                        System.out.println(Saatler.pazarSultanYedi[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.pazarSultanYedi[1]);
                    }
                    break;

                case 7:
                    System.out.println("7. sıra");
                    siralar.setText("bugün 7. araba");
                    ListView listsol7 = (ListView) findViewById(R.id.listSol);
                    ArrayAdapter<String> solAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiSultanYedi);
                    listsol7.setAdapter(solAdaptor7);
                    ListView listsag7 = (ListView) findViewById(R.id.listSag);
                    ArrayAdapter<String> sagAdaptor7 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Saatler.cumartesiKartalYedi);
                    listsag7.setAdapter(sagAdaptor7);
                    if((haftaİleri ==1)) {
                        System.out.println(Saatler.pazarSultanSekiz[1]);
                        ertesiGunView.setText("Yarın Kalkış: "+haftaIleriStr+ Saatler.pazarSultanSekiz[1]);
                    }
                    break;

            }
        }


    }











    public void setting1(View view) {
        System.out.println("ayarlar pencerisi açıldı");
        Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
        startActivity(intent);
        finish();


    }
}