package com.example.maitree;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.vstechlab.easyfonts.EasyFonts;

import java.util.Locale;

public class FrenchActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    TextView t1,t2,t3,t4;

    Dbhelper dbhelper;
    int count = 1;
    ImageView i1,i2;
    ToggleButton toggleButton,play;
    TextToSpeech text_to_speech;
    private int MY_DATA_CHECK_CODE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french);
        Intent i = getIntent();
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        dbhelper = new Dbhelper(getApplicationContext());
        String id = i.getExtras().getString("pid");

        Place p1 = new Place();
        p1 = dbhelper.getplacedetail(id);
        Place p2= new Place();
        int k=Integer.parseInt(id);
        k=k+24;
        String id_french= String.valueOf(k);

        p2=dbhelper.getplacedetail(id_french);

        final String name = p1.getPlacename();

        final String basicdesc = p1.getPlacedesc();
        final String extradesc = p1.getPlaceextra();
        final String basicdesc_french = p2.getPlacedesc();
        final String extradesc_french = p2.getPlaceextra();
        t4 = (TextView) findViewById(R.id.textView9);
//
       /* byte[] pic1 = p1.getPlaceimage1();
        final byte[] pic2 = p1.getPlaceimage2();
        final Bitmap b1 = BitmapFactory.decodeByteArray(pic1,0,pic1.length);
        final Bitmap b2 = BitmapFactory.decodeByteArray(pic2,0,pic2.length);*/

        /*Bitmap akshardham1 = BitmapFactory.decodeResource(getResources(),R.drawable.akshardham1);
        Bitmap akshardham2 = BitmapFactory.decodeResource(getResources(),R.drawable.akshardham2);
        Bitmap akshardham3 = BitmapFactory.decodeResource(getResources(),R.drawable.akshardham3);
        Bitmap gandhi1 = BitmapFactory.decodeResource(getResources(),R.drawable.gandhi1);
        Bitmap gandhi2 = BitmapFactory.decodeResource(getResources(),R.drawable.gandhi2);
        Bitmap gandhi3 = BitmapFactory.decodeResource(getResources(),R.drawable.gandhi3);
        Bitmap guj1 = BitmapFactory.decodeResource(getResources(),R.drawable.guj1);
        Bitmap guj2 = BitmapFactory.decodeResource(getResources(),R.drawable.guj2);
        Bitmap guj3 = BitmapFactory.decodeResource(getResources(),R.drawable.guj3);
        Bitmap hathee1 = BitmapFactory.decodeResource(getResources(),R.drawable.hathi1);
        Bitmap hathee2 = BitmapFactory.decodeResource(getResources(),R.drawable.hathi2);
//        Bitmap hathee3 = BitmapFactory.decodeResource(getResources(),R.drawable.hathi3);
        Bitmap garden1 = BitmapFactory.decodeResource(getResources(),R.drawable.garden1);
        Bitmap garden2 = BitmapFactory.decodeResource(getResources(),R.drawable.garden2);
        Bitmap garden3 = BitmapFactory.decodeResource(getResources(),R.drawable.garden3);
        Bitmap delwara1 = BitmapFactory.decodeResource(getResources(),R.drawable.dilwara1);
//        Bitmap delwara2 = BitmapFactory.decodeResource(getResources(),R.drawable.dilwara2);
//        Bitmap delwara3 = BitmapFactory.decodeResource(getResources(),R.drawable.dilwara3);*/




//        b2 = (Button) findViewById(R.id.i);
//        i1 = (ImageButton) findViewById(R.id.imageButton);
        i1 = (ImageView) findViewById(R.id.imageView);
        i2 = (ImageView) findViewById(R.id.imageView1);
        t1 = (TextView) findViewById(R.id.dec_place);
        t2 = (TextView) findViewById(R.id.Title);
        t3 = (TextView) findViewById(R.id.extra_dec_place);
        play = (ToggleButton) findViewById(R.id.toggleButton);

        t1.setTypeface(EasyFonts.droidSerifRegular(this));
        t2.setTypeface(EasyFonts.droidSerifBold(this));
        t3.setTypeface(EasyFonts.droidSerifRegular(this));
        toggleButton= (ToggleButton) findViewById(R.id.tb);
        Intent checkTTSIntent = new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent, MY_DATA_CHECK_CODE);
        t2.setText(name);
        t1.setText(basicdesc);
        t3.setText(extradesc);

        int k1=Integer.parseInt(id);
        //System.gc();
        switch (k1)
        {

            case 101:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.akshardham1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.akshardham3));
                break;
            }

            case 102:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.gandhi1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.garden3));
                break;
            }
            case 103:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.guj1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.guj2));
                break;
            }
            case 104:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.garden1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.garden2));
                break;
            }
            case 105:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.vintage1));
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.vintage2));
                break;
            }
            case 106:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.hathi1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.hathi2));
                break;
            }
            case 107:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.kalam1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.kalam2));
                break;
            }
            case 108:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.sardar1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.sardar2));
                break;
            }
            case 109:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.triba1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.triba2));
                break;
            }
            case 110:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.modhera1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.modhera2));
                break;
            }
            case 111:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.mountabu1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.mountabu2));
                break;
            }
            case 112:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.patola1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.patola2));
                break;
            }
            case 113:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.rani1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.rani2));
                break;
            }
            case 114:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.blind1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.blind2));
                break;
            }
            case 115:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.dilwara1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.dilwara2));
                break;
            }
            case 116:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.nakki1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.nakki2));
                break;
            }
            case 117:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.sarkhejroza1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.sarkhejroza2));
                break;
            }
            case 118:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.sunset1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.sunset2));
                break;
            }
            case 119:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.toadrock1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.toadrock2));
                break;
            }
            case 120:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.vishala1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.vishal32));
                break;
            }
            case 121:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.katal1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.katal2));
                break;
            }
            case 122:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.uttarayan1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.uttarayan2));
                break;
            }
            case 123:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.serenity));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.serenity2));
                break;
            }
            case 124:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.iskonimage1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.iskonimage2));
                break;

            }
            case 201:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.adalaj1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.adalaj2));
                break;

            }
            case 202:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.kankaria1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.kankaria2));
                break;

            }
            case 203:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.riverfrontpark1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.riverfrontpark2));
                break;

            }
            case 204:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.sciencecity1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.sciencecity2));
                break;

            }
            case 205:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ravivari1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ravivari2));
                break;

            }
            case 206:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.thol1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.thol2));
                break;

            }
            case 207:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.nal1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.nal2));
                break;

            }
            case 208:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.mn1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.mn2));
                break;

            }
            case 209:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.law1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.law2));
                break;

            }
            case 210:
            {
                i1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.iim1));
                i2.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.iim2));
                break;
            }




        }

       /* i1.setImageBitmap(b1);
        i2.setImageBitmap(b2);*/
        play.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    play.setBackgroundResource(R.drawable.pausefilled);
                    String toSpeak = (String) t1.getText();
                    toSpeak=toSpeak+t3.getText();
                    //   String toSpeak="i am playing cricket";
                    //     Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();
//                    text_to_speech.setPitch();
                    text_to_speech.setSpeechRate((float)0.8);
//                    text_to_speech.setPitch()
                    text_to_speech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

                } else {
                    play.setBackgroundResource(R.drawable.speaker96);
                    text_to_speech.stop();

                }
            }
        });
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    play.setChecked(false);
                    play.setBackgroundResource(R.drawable.speaker96);
                    text_to_speech.stop();
                   text_to_speech.setLanguage(Locale.FRENCH);
                    t2.setText(name);
                    t1.setText(basicdesc_french);
                    t3.setText(extradesc_french);
                    t4.setText("French");
//                    b2.setText("Arrêter");

                    /*t2.setText("SIDI Saiyyed mosquée");
                    t1.setText("La SIDI Saiyyed mosquée, construite en 1573, est l'un des plus célèbres mosquées d'Ahmedabad. Comme l'attestent les une tablette de marbre fixé sur le mur de la mosquée, il fut construit par Sidi Saeed ou Saiyyed, un'Abyssin Sidi dans le cortège de Bilal Jhajar Khan, le général dans l'armée de la dernière Sultan Shams-ud-Din Muzaffar III de la Gujarat Shah sultanat.");
             */   } else {
                    play.setChecked(false);
                    play.setBackgroundResource(R.drawable.speaker96);
                    text_to_speech.stop();
                    text_to_speech.setLanguage(Locale.ENGLISH);
                    t4.setText("English");
                    t2.setText(name);
                    t1.setText(basicdesc);
                    t3.setText(extradesc);
                    /*i1.setImageBitmap(b1);
                    i2.setImageBitmap(b2);*/
//                    b2.setText("Stop");
            }
            }
        });


    }
        public void onPause(){
            if(text_to_speech !=null){
                text_to_speech.stop();

            }
            super.onPause();



    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == MY_DATA_CHECK_CODE) {
            if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
                //the user has the necessary data - create the TTS
                text_to_speech = new TextToSpeech(this, this);
            }
            else {
                //no data - install it now
                Intent installTTSIntent = new Intent();
                installTTSIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                startActivity(installTTSIntent);
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


    }



    @Override
    public void onInit(int initStatus) {
        if (initStatus == TextToSpeech.SUCCESS) {

            if(text_to_speech.isLanguageAvailable(Locale.US)==TextToSpeech.LANG_AVAILABLE)
                text_to_speech.setLanguage(Locale.US);

        }
        else if (initStatus == TextToSpeech.ERROR) {

            Toast.makeText(this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();

        }
    }
}
