package com.example.simplevoiceassistance;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AI {
    public static String getAnswer(String question){
        ArrayList<String> answer= new ArrayList<String>();
        question= question.toLowerCase();
        switch (question){
            case "сколько времени":
            {SimpleDateFormat timeFormat= new SimpleDateFormat("hh:mm:ss");
                String time= timeFormat.format(new Date());
                answer.add("Точное время: "+ time+ "   ,чел");
                break;}
                default:
                    answer.add("Че?");
        }

        if (answer.size()>0)
        {return  String.join(",", answer);}
        else return "Почему вы молчите??????????????????";
    }
}
