package com.example.maitree;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Locale;

public class French_Food extends AppCompatActivity implements TextToSpeech.OnInitListener {

    TextView t1,t2,t3;
    ImageView i1;
    ToggleButton play,language;
    Toolbar toolbar;
    TextToSpeech text_to_speech;
    TextView t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_food);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent i = getIntent();

        int id = i.getExtras().getInt("pid");
        t1 = (TextView) findViewById(R.id.Title_food);
        t2 = (TextView) findViewById(R.id.dec_place_food);
        t3 = (TextView) findViewById(R.id.extra_dec_place_food);
        i1 = (ImageView) findViewById(R.id.imageView_food);
        t4 = (TextView) findViewById(R.id.textView9);
        play = (ToggleButton) findViewById(R.id.play);
        language = (ToggleButton) findViewById(R.id.language);
        Intent checkTTSIntent = new Intent();
        checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkTTSIntent,0);

        if(id == 0)
        {
            t1.setText("Dhokla");
            t2.setText("This quaint looking joint has no airs or frills about it and is yet one of the best places to get dhokla, Khaman and Kandvi in the whole of Ahmedabad. The long queue of customers and the aroma around are evidences enough of the high on taste quotient of this place.");
            t3.setText("Photo of Dhokla (by Sri)\n" +
                            "\n" +
                            "Don’t let anything stop you from ordering plates full of khaman taman, plain Khaman, sandwich dhokla, patra, samosas and more. The treat is on for the whole day! Savour!");
            i1.setImageResource(R.drawable.four);
            play.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        play.setBackgroundResource(R.drawable.pausefilled);
                        String toSpeak = (String) t2.getText();

                        //   String toSpeak="i am playing cricket";
                        //     Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();
                        text_to_speech.setSpeechRate((float) 0.8);
                        text_to_speech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

                    } else {
                        play.setBackgroundResource(R.drawable.speaker96);
                        text_to_speech.stop();

                    }
                }
            });
            language.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        play.setChecked(false);
                        play.setBackgroundResource(R.drawable.speaker96);
                        text_to_speech.stop();
                        text_to_speech.setLanguage(Locale.FRENCH);
                        t2.setText("Avec un certain nombre de restaurants à proliférer jusqu'dans tous les coins de la ville, il est en effet difficile d'affiner au mieux du lot. Eh bien, ne supprime toutes les confusions pour voici une courte liste des doit consommer local à Ahmedabad Dhokla et Khaman Surti Khandvi chez Das Wala ce coquet recherche n'a pas de conjoint sari ou à elle et est superflu et pourtant l'un des meilleurs endroits pour obtenir Kandvi Khaman dhokla, et dans l'ensemble d'Ahmedabad. La longue file d'attente des clients et de l'arôme autour sont les preuves assez du haut sur le goût quotient de cet endroit.");
//                        t1.setText(basicdesc_french);
//                        t3.setText(extradesc_french);
                        t4.setText("French");
//                    b2.setText("Arrêter");

                    /*t2.setText("SIDI Saiyyed mosquée");
                    t1.setText("La SIDI Saiyyed mosquée, construite en 1573, est l'un des plus célèbres mosquées d'Ahmedabad. Comme l'attestent les une tablette de marbre fixé sur le mur de la mosquée, il fut construit par Sidi Saeed ou Saiyyed, un'Abyssin Sidi dans le cortège de Bilal Jhajar Khan, le général dans l'armée de la dernière Sultan Shams-ud-Din Muzaffar III de la Gujarat Shah sultanat.");
             */
                    } else {
                        play.setChecked(false);
                        play.setBackgroundResource(R.drawable.speaker96);
                        text_to_speech.stop();
                        text_to_speech.setLanguage(Locale.ENGLISH);
                       t4.setText("English");
                        t1.setText("Dhokla");
                        t2.setText("This quaint looking joint has no airs or frills about it and is yet one of the best places to get dhokla, Khaman and Kandvi in the whole of Ahmedabad. The long queue of customers and the aroma around are evidences enough of the high on taste quotient of this place.");
                        t3.setText("Photo of Dhokla (by Sri)\n" +
                                "\n" +
                                "Don’t let anything stop you from ordering plates full of khaman taman, plain Khaman, sandwich dhokla, patra, samosas and more. The treat is on for the whole day! Savour!");

                    /*i1.setImageBitmap(b1);
                    i2.setImageBitmap(b2);*/
//                    b2.setText("Stop");
                    }
                }
            });
        }
        if(id == 1)
        {
            t1.setText("Khandvi");
            t2.setText("This quaint looking joint has no airs or frills about it and is yet one of the best places to get dhokla, Khaman and Kandvi in the whole of Ahmedabad. The long queue of customers and the aroma around are evidences enough of the high on taste quotient of this place.");
            t3.setText("Photo of Khandvi (by Kirti Poddar)\n" +
                    "\n" +
                            "Address: Trade Centre, Naurang Road, Ahmedabad, Gujarat\n" +
                            "\n" +
                            "Telephone: +91-98984-06576\n" +
                            "\n" +
                            "Meal for two : INR 50\n");
            i1.setImageResource(R.drawable.one);
            play.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        play.setBackgroundResource(R.drawable.pausefilled);
                        String toSpeak = (String) t2.getText();

                        //   String toSpeak="i am playing cricket";
                        //     Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();
                        text_to_speech.setSpeechRate((float) 0.8);
                        text_to_speech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

                    } else {
                        play.setBackgroundResource(R.drawable.speaker96);
                        text_to_speech.stop();

                    }
                }
            });
            language.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        play.setChecked(false);
                        play.setBackgroundResource(R.drawable.speaker96);
                        text_to_speech.stop();
                        text_to_speech.setLanguage(Locale.FRENCH);
                        t2.setText("Avec un certain nombre de restaurants à proliférer jusqu'dans tous les coins de la ville, il est en effet difficile d'affiner au mieux du lot. Eh bien, ne supprime toutes les confusions pour voici une courte liste des doit consommer local à Ahmedabad Dhokla et Khaman Surti Khandvi chez Das Wala ce coquet recherche n'a pas de conjoint sari ou à elle et est superflu et pourtant l'un des meilleurs endroits pour obtenir Kandvi Khaman dhokla, et dans l'ensemble d'Ahmedabad. La longue file d'attente des clients et de l'arôme autour sont les preuves assez du haut sur le goût quotient de cet endroit.");

//                        t1.setText(basicdesc_french);
//                        t3.setText(extradesc_french);
                        t4.setText("French");
//                    b2.setText("Arrêter");

                    /*t2.setText("SIDI Saiyyed mosquée");
                    t1.setText("La SIDI Saiyyed mosquée, construite en 1573, est l'un des plus célèbres mosquées d'Ahmedabad. Comme l'attestent les une tablette de marbre fixé sur le mur de la mosquée, il fut construit par Sidi Saeed ou Saiyyed, un'Abyssin Sidi dans le cortège de Bilal Jhajar Khan, le général dans l'armée de la dernière Sultan Shams-ud-Din Muzaffar III de la Gujarat Shah sultanat.");
             */
                    } else {
                        play.setChecked(false);
                        play.setBackgroundResource(R.drawable.speaker96);
                        text_to_speech.stop();
                        text_to_speech.setLanguage(Locale.ENGLISH);
                        t4.setText("English");
                        t1.setText("Khandvi");
                        t2.setText("This quaint looking joint has no airs or frills about it and is yet one of the best places to get dhokla, Khaman and Kandvi in the whole of Ahmedabad. The long queue of customers and the aroma around are evidences enough of the high on taste quotient of this place.");
                        t3.setText("Photo of Khandvi (by Kirti Poddar)\n" +
                                "\n" +
                                "Address: Trade Centre, Naurang Road, Ahmedabad, Gujarat\n" +
                                "\n" +
                                "Telephone: +91-98984-06576\n" +
                                "\n" +
                                "Meal for two : INR 50\n");
                    /*i1.setImageBitmap(b1);
                    i2.setImageBitmap(b2);*/
//                    b2.setText("Stop");
                    }
                }
            });
        }
        if(id == 2)
        {
            t1.setText("Gujarati Thali");
            t2.setText("Ame Gujarati has got the most wholesome Gujarati thalis, the menu here has everything that makes for local food Bataka Nu Shak, Kathod, Puri/ Roti, Bhakhri/Thepla/Rotli, Atthanu, Sarevda, Pan/Mukhwas, Methi No Masalo and more.\"");
            t3.setText("Photo of Patra (GaneshDatta)\n" +
                    "\n" +
                    "Address: Plot Number 169, Bodakdev, Off S.G Highway, Ahmedabad, Gujarat\n" +
                    "\n" +
                    "Telephone: +91-79-29096821|29096822|29096823\n" +
                    "\n" +
                    "Meal for two : 300\n");
            i1.setImageResource(R.drawable.two);
            play.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        play.setBackgroundResource(R.drawable.pausefilled);
                        String toSpeak = (String) t2.getText();

                        //   String toSpeak="i am playing cricket";
                        //     Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();
                        text_to_speech.setSpeechRate((float) 0.8);
                        text_to_speech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

                    } else {
                        play.setBackgroundResource(R.drawable.speaker96);
                        text_to_speech.stop();

                    }
                }
            });
            language.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        play.setChecked(false);
                        play.setBackgroundResource(R.drawable.speaker96);
                        text_to_speech.stop();
                        text_to_speech.setLanguage(Locale.FRENCH);
                        t2.setText("Ame Gujarati a obtenu le plus sains en gujarati, le menu thalis ici a tout ce qui fait pour la consommation d'aliments locaux Kathod Bataka Nu Shak,Puri Thepla Bhakhri Roti,Sarevda Atthanu Rotli,Pan Masalo Methi Mukhwas, aucun et plus.");
//                        t1.setText(basicdesc_french);
//                        t3.setText(extradesc_french);
                        t4.setText("French");
//                    b2.setText("Arrêter");

                    /*t2.setText("SIDI Saiyyed mosquée");
                    t1.setText("La SIDI Saiyyed mosquée, construite en 1573, est l'un des plus célèbres mosquées d'Ahmedabad. Comme l'attestent les une tablette de marbre fixé sur le mur de la mosquée, il fut construit par Sidi Saeed ou Saiyyed, un'Abyssin Sidi dans le cortège de Bilal Jhajar Khan, le général dans l'armée de la dernière Sultan Shams-ud-Din Muzaffar III de la Gujarat Shah sultanat.");
             */
                    } else {
                        play.setChecked(false);
                        play.setBackgroundResource(R.drawable.speaker96);
                        text_to_speech.stop();
                        text_to_speech.setLanguage(Locale.ENGLISH);
                        t4.setText("English");
                        t1.setText("Gujarati Thali");
                        t2.setText("Ame Gujarati has got the most wholesome Gujarati thalis, the menu here has everything that makes for local food Bataka Nu Shak, Kathod, Puri/ Roti, Bhakhri/Thepla/Rotli, Atthanu, Sarevda, Pan/Mukhwas, Methi No Masalo and more.\"");
                        t3.setText("Photo of Patra (GaneshDatta)\n" +
                                "\n" +
                                "Address: Plot Number 169, Bodakdev, Off S.G Highway, Ahmedabad, Gujarat\n" +
                                "\n" +
                                "Telephone: +91-79-29096821|29096822|29096823\n" +
                                "\n" +
                                "Meal for two : 300\n");
                    /*i1.setImageBitmap(b1);
                    i2.setImageBitmap(b2);*/
//                    b2.setText("Stop");
                    }
                }
            });

        }
        if(id == 3)
        {
            t1.setText("Basundi");
            t2.setText("This thick, creamy dessert is made of milk that’s stirred to its thickest best, imparting it a taste and aroma that’s tantalising to say the least.");
            t3.setText("Photo of Basundi (by stu spivack)");
            i1.setImageResource(R.drawable.three);
            play.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        play.setBackgroundResource(R.drawable.pausefilled);
                        String toSpeak = (String) t2.getText();

                        //   String toSpeak="i am playing cricket";
                        //     Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();
                        text_to_speech.setSpeechRate((float) 0.8);
                        text_to_speech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

                    } else {
                        play.setBackgroundResource(R.drawable.speaker96);
                        text_to_speech.stop();

                    }
                }
            });
            language.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        play.setChecked(false);
                        play.setBackgroundResource(R.drawable.speaker96);
                        text_to_speech.stop();
                        text_to_speech.setLanguage(Locale.FRENCH);
                        t2.setText("Cette épaisse, crémeuse dessert est faite de lait c'est remué à ses meilleurs plus épaisse, donnant un avant-goût et l'arôme que c'est pour le moins alléchante.");
//                        t1.setText(basicdesc_french);
//                        t3.setText(extradesc_french);
                        t4.setText("French");
//                    b2.setText("Arrêter");

                    /*t2.setText("SIDI Saiyyed mosquée");
                    t1.setText("La SIDI Saiyyed mosquée, construite en 1573, est l'un des plus célèbres mosquées d'Ahmedabad. Comme l'attestent les une tablette de marbre fixé sur le mur de la mosquée, il fut construit par Sidi Saeed ou Saiyyed, un'Abyssin Sidi dans le cortège de Bilal Jhajar Khan, le général dans l'armée de la dernière Sultan Shams-ud-Din Muzaffar III de la Gujarat Shah sultanat.");
             */
                    } else {
                        play.setChecked(false);
                        play.setBackgroundResource(R.drawable.speaker96);
                        text_to_speech.stop();
                        text_to_speech.setLanguage(Locale.ENGLISH);
                        t4.setText("English");
                        t1.setText("Basundi");
                        t2.setText("This thick, creamy dessert is made of milk that’s stirred to its thickest best, imparting it a taste and aroma that’s tantalising to say the least.");
                        t3.setText("Photo of Basundi (by stu spivack)");
//                        i1.setImageResource(R.drawable.three);
                    /*i1.setImageBitmap(b1);
                    i2.setImageBitmap(b2);*/
//                    b2.setText("Stop");
                    }
                }
            });

        }
        if(id == 4)
        {
            t1.setText("Kebabs and Chicken");
            t2.setText("The smell of kebabsbeing made and chicken and quail being grilled is good enough to make any vegetarian want to convert.\n");
            t3.setText("Photo of Kebabs (by Emin Bashirov)\n" +
                    "\n" +
                    "Address : Bhatiyar Gully, Ahmedabad\n" +
                    "\n" +
                    "Meal for Two : INR 400\n" +
                    "\n" +
                    "There is nothing like the authentic flavours of a place, check out other places to eat in Ahmedabad along with these must eat local food in Ahmedabad.");
            i1.setImageResource(R.drawable.five);
            play.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {

                        play.setBackgroundResource(R.drawable.pausefilled);
                        String toSpeak = (String) t2.getText();

                        //   String toSpeak="i am playing cricket";
                        //     Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();
                        text_to_speech.setSpeechRate((float) 0.8);
                        text_to_speech.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

                    } else {
                        play.setBackgroundResource(R.drawable.speaker96);
                        text_to_speech.stop();

                    }
                }
            });
            language.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        play.setChecked(false);
                        play.setBackgroundResource(R.drawable.speaker96);
                        text_to_speech.stop();
                        text_to_speech.setLanguage(Locale.FRENCH);
                        t2.setText("l'odeur de kebabsbeing faites et poulet et la caille être grillés est assez bon pour faire toute végétarien souhaitez convertir.");
//                        t1.setText(basicdesc_french);
//                        t3.setText(extradesc_french);
                        t4.setText("French");
//                    b2.setText("Arrêter");

                    /*t2.setText("SIDI Saiyyed mosquée");
                    t1.setText("La SIDI Saiyyed mosquée, construite en 1573, est l'un des plus célèbres mosquées d'Ahmedabad. Comme l'attestent les une tablette de marbre fixé sur le mur de la mosquée, il fut construit par Sidi Saeed ou Saiyyed, un'Abyssin Sidi dans le cortège de Bilal Jhajar Khan, le général dans l'armée de la dernière Sultan Shams-ud-Din Muzaffar III de la Gujarat Shah sultanat.");
             */
                    } else {
                        play.setChecked(false);
                        play.setBackgroundResource(R.drawable.speaker96);
                        text_to_speech.stop();
                        text_to_speech.setLanguage(Locale.ENGLISH);
                        t4.setText("English");
                        t1.setText("Kebabs and Chicken");
                        t2.setText("The smell of kebabsbeing made and chicken and quail being grilled is good enough to make any vegetarian want to convert.\n");
                        t3.setText("Photo of Kebabs (by Emin Bashirov)\n" +
                                "\n" +
                                "Address : Bhatiyar Gully, Ahmedabad\n" +
                                "\n" +
                                "Meal for Two : INR 400\n" +
                                "\n" +
                                "There is nothing like the authentic flavours of a place, check out other places to eat in Ahmedabad along with these must eat local food in Ahmedabad.");
                    /*i1.setImageBitmap(b1);
                    i2.setImageBitmap(b2);*/
//                    b2.setText("Stop");
                    }
                }
            });
        }



    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 0) {
            if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
                //the user has the necessary data - create the TTS
                text_to_speech = new TextToSpeech(getApplicationContext(),this);
            }
            else {
                //no data - install it now
                Intent installTTSIntent = new Intent();
                installTTSIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                startActivity(installTTSIntent);
            }
        }
    }
    public void onPause(){
        if(text_to_speech !=null){
            text_to_speech.stop();

        }
        super.onPause();



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
