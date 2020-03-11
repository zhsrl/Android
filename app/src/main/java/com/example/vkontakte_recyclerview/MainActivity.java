package com.example.vkontakte_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.vkontakte_recyclerview.RecyclerViewAdapterFeed;
import com.example.vkontakte_recyclerview.FeedModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity{

    BottomNavigationView bottomNavigation;
    RecyclerView recView;
    ArrayList<FeedModel>feedModelArrayList=new ArrayList<>();
    RecyclerViewAdapterFeed adapterFeed;
    private TypeFaceUtil TypefaceUtil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigation = findViewById(R.id.bottom_navigation);
        TypefaceUtil.overrideFont(getApplicationContext(), "SANS_SERIF", "fonts/MontserratSemiBold.ttf");

        populaterecyclerview();

        recView = (RecyclerView) findViewById(R.id.recy_feed);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setLayoutManager(layoutManager);

        adapterFeed = new RecyclerViewAdapterFeed(this,feedModelArrayList);
        recView.setAdapter(adapterFeed);


    }


    private void populaterecyclerview() {
        FeedModel fm1 = new FeedModel("Motivation Portal | Мотивация" , "два часа назад" , "" ,"16" , R.drawable.profile1 , R.drawable.post2 ,"3" , "14", "4");
        FeedModel fm2 = new FeedModel("Шерлок - Sherlock" ,"три часа назад", "Попробуем...","104",R.drawable.profile3,R.drawable.post_sherlock,"41","5","16");
        FeedModel fm3 = new FeedModel("Topsify","2 марта 15:31","#TopsifyXBTS","761",R.drawable.profile2,R.drawable.post_topsify,"58","45","48K");
        FeedModel fm4 = new FeedModel("dev/null","27 февраля 21:47","Программист:интерфейс интуитивно понятен,тут каждый разберется.","3K",R.drawable.profile4,R.drawable.post_dev,"48","77","180K");
        FeedModel fm5 = new FeedModel("ITProger", "26 фервраля 00:15",null,"763",R.drawable.profile5,R.drawable.post5,"160","35","14K");
        FeedModel fm6 = new FeedModel("Цени жизни","10 января 04:59","Узнали?","3K",R.drawable.profile6,R.drawable.post6,"73","253","412");
        FeedModel fm7 = new FeedModel("Designer / Photoshop / Illustrator","6 января 15:22","- Фоны\n" +
                "\n" +
                "#фоны@desiignertm","23",R.drawable.profile7,R.drawable.post7,"2",null,"4");
        FeedModel fm8 = new FeedModel("Цени жизни","3 января 12:41","Выбирай!","342",R.drawable.profile6,R.drawable.post8,"171","104","66");
        FeedModel fm9 = new FeedModel("Я тебя люблю","1 января 00:56",null,"3K",R.drawable.profile9,R.drawable.post9,"677","34","1K");
        FeedModel fm10 = new FeedModel("dev/null","1 января 12:01","Когда написал 10 строк кода и они работают","4K",R.drawable.profile4,R.drawable.post10,"433","72","18K");

        feedModelArrayList.add(fm1);
        feedModelArrayList.add(fm2);
        feedModelArrayList.add(fm3);
        feedModelArrayList.add(fm4);
        feedModelArrayList.add(fm5);
        feedModelArrayList.add(fm6);
        feedModelArrayList.add(fm7);
        feedModelArrayList.add(fm8);
        feedModelArrayList.add(fm9);
        feedModelArrayList.add(fm10);

    }

}
