package com.uniritter.unibook;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Health extends AppCompatActivity {

    private Button healthTipButton;
    private TextView healthTipText;

    private String[] healthTips = {
            "Beba água  \n" +
                    "Pode parecer um aviso simples, mas beber água é fundamental para a manutenção das funções vitais do organismo e para evitar a desidratação. Então, nada de passar horas sem beber água. Carregue sempre a sua garrafinha, principalmente se você morar em regiões mais quentes!",

            "Movimente-se \n" +
                    "A ideia de ficar bastante tempo sentado ou optar sempre pelo elevador podem parecer bem atrativas, mas, se formos avaliar todos os riscos que o sedentarismo causa à saúde, você não permaneceria com essa ideia por bastante tempo.  \n" +
                    "Se o seu trabalho exige que você fique sentado por muitas horas, programe horários para levantar e dar uma volta no ambiente em volta. \n" +
                    "Além disso, também é importante adotar o hábito de praticar atividades físicas, de acordo com suas necessidades e recomendações médicas. Alguns exemplos de atividades possíveis de serem feitas são: natação, caminhada, dança, corrida, artes marciais, etc. ",

            "Use protetor solar  \n" +
                    "Cuidado com o sol!",

            "Ria mais \n" +
                    "O riso diminui o estresse, promove o bem-estar e fortalece as relações sociais. ",

            "Alimente-se bem \n" +
                    "O debate sobre alimentação saudável não acontece por acaso. A alimentação saudável é primordial para evitar complicações cardiovasculares e combater o aumento desequilibrado do peso, por exemplo.",

            "Durma bem \n" +
                    "Você está dormindo bem? A qualidade do sono tem influência direta nos resultados das funções desempenhadas ao longo do dia. Uma noite incompleta de sono pode desencadear irritação, atraso de tarefas e sonolência durante o dia. Portanto, para evitar esses males, teste e descubra a quantidade de horas de sono adequadas ao seu organismo.",

            "Diminua o estresse \n" +
                    "Respire fundo e relaxe.",

            "Dialogue \n" +
                    "Uma conversa amigável e compreensiva conserva relações. Ouça, fale, entenda!",

            "Faça um check-up \n" +
                    "Quer garantir dias mais saudáveis? Faça um check-up. Com ele você terá acesso às informações sobre sua saúde, como nível de colesterol, diabetes, análise do funcionamento dos rins, coração e outros órgãos do corpo. Previna-se, faça seus exames de rotina.",

            "Reserve um tempo para você  \n" +
                    "Em meio à correria diária, os cuidados consigo mesmo também devem ser priorizados, seja para a realização de uma leitura, um passeio, cuidados com a beleza ou momentos de descanso. Ter tempo para si mesmo garante mais vigor!",

            "Elimine os hábitos prejudiciais \n" +
                    "Repense os seus hábitos e analise o que precisa ser eliminado e modificado. Você está utilizando excessivamente as redes sociais? Está utilizando celular no trânsito? Deixou de visitar seus familiares? Tornou-se sedentário? É possível transformar-se positivamente a qualquer momento. Avalie em quais aspectos a sua vida precisa de mudanças e tenha mais disposição física e mental!"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Full screen
        requestWindowFeature(Window.FEATURE_OPTIONS_PANEL);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.health);

        healthTipButton = findViewById(R.id.btnHealthTip);
        healthTipText = findViewById(R.id.healthTip);

        healthTipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random = new Random();
                int tipRandom = random.nextInt(healthTips.length);

                healthTipText.setText(healthTips[tipRandom]);
            }
        });


    }

}
