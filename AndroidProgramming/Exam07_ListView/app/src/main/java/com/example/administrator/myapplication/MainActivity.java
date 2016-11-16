package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lightList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //R은 res 폴더를 의미 (Resource 참조)
        lightList = (ListView) findViewById(R.id.lightList);
        fillItems();
    }

    public void fillItems()
    {
        List<Light> list = new ArrayList<>();
        list.add(new Light(R.drawable.light1,"인테리어 조명1","거실등으로 사용하면 좋습니다.검은색 테두리와 백열등의 조화가 이쁩니다."));
        list.add(new Light(R.drawable.light2,"인테리어 조명2","욕실등으로 사용하면 좋습니다.검은색 테두리와 백열등의 조화가 이쁩니다."));
        list.add(new Light(R.drawable.light3,"인테리어 조명3","자녀방등으로 사용하면 좋습니다.검은색 테두리와 백열등의 조화가 이쁩니다."));
        list.add(new Light(R.drawable.light4,"인테리어 조명4","현관등으로 사용하면 좋습니다.검은색 테두리와 백열등의 조화가 이쁩니다."));
        list.add(new Light(R.drawable.light5,"인테리어 조명5","안방등으로 사용하면 좋습니다.검은색 테두리와 백열등의 조화가 이쁩니다."));
        list.add(new Light(R.drawable.light1,"인테리어 조명6","거실등으로 사용하면 좋습니다.검은색 테두리와 백열등의 조화가 이쁩니다."));
        list.add(new Light(R.drawable.light2,"인테리어 조명7","욕실등으로 사용하면 좋습니다.검은색 테두리와 백열등의 조화가 이쁩니다."));
        list.add(new Light(R.drawable.light3,"인테리어 조명8","자녀방등으로 사용하면 좋습니다.검은색 테두리와 백열등의 조화가 이쁩니다."));
        list.add(new Light(R.drawable.light4,"인테리어 조명9","현관등으로 사용하면 좋습니다.검은색 테두리와 백열등의 조화가 이쁩니다."));
        list.add(new Light(R.drawable.light5,"인테리어 조명10","안방등으로 사용하면 좋습니다.검은색 테두리와 백열등의 조화가 이쁩니다."));


        LightAdapter lightAdapter = new LightAdapter(this);
        lightAdapter.setList(list);

        lightList.setAdapter(lightAdapter);
    }
}
