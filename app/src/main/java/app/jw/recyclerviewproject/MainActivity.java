package app.jw.recyclerviewproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //RecyclerView 기본 설정
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this, 1));
        recyclerAdapter = new RecyclerAdapter();
        recyclerView.setAdapter(recyclerAdapter);


        //RecyclerView에 데이터 삽입(Item은 데이터 하나 넣을 때마다 호출)
        Item item = new Item();
        item.setProductName("이름");
        item.setProductCategory("카테고리");
        item.setProductDate("날짜");
        recyclerAdapter.addItem(item);


        //recyclerView에 데이터 다 넣었으면 호출
        recyclerAdapter.notifyDataSetChanged();


    }
}
