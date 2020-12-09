package ibodov.smile.contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements ContactAdapter.OnItemClickListener {

    FloatingActionButton fab; // FloatingActionButton - это класс
    RecyclerView recyclerView;
    ContactAdapter adapter;

    //Массив с данными о контактах (это временный массив)
    Contact[] contacts = new Contact[12]; //Декларация и иниц

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.fab); // иниц. находим fab

        fab.setOnClickListener(new View.OnClickListener() { //Устанавливаем обработчик на fab
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddContactActivity.class); //Создаем намерение
                                                    //this это сам MainActivity
                                                    //AboutContactActivity это сам созданный класс
                startActivity(intent);    //Вызывем метод и вставляем туда наш интент
            }
        });

            //Массив с данными о контактах (это временный массив)
            //Заполняем массив
        setContactsArray();

            //Инициализируем recyclerView список
        initRecyclerView();

    }
        // //метод Массива с данными о контактах (это временный массив)
    private void setContactsArray() {
        contacts[0] = new Contact(1, "Islom", "Nuridinov");
        contacts[1] = new Contact(2, "Alex", "Cold");
        contacts[2] = new Contact(3, "Diana", "Sparrow");
        contacts[3] = new Contact(4, "Dean", "Winchester");
        contacts[4] = new Contact(5, "Sam", "Winchester");
        contacts[5] = new Contact(6, "Erric", "Banas");
        contacts[6] = new Contact(7, "Dominic", "Torretto");
        contacts[7] = new Contact(8, "Aiden", "Pierce");
        contacts[8] = new Contact(9, "Elliot", "Alderson");
        contacts[9] = new Contact(10, "Michel", "Rodriges");
        contacts[10] = new Contact(11, "Rachel", "Wood");
        contacts[11] = new Contact(12, "Eleonora", "Dean");
    }

    //создаем метод
    private  void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager =  //вертикальная прокрутка
            new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        //разделитель
        DividerItemDecoration itemDecoration = new DividerItemDecoration(this, linearLayoutManager.getOrientation());

        //иниц ContactAdapter
        adapter = new ContactAdapter(contacts, this); //в него передаём contacts

        recyclerView.setLayoutManager(linearLayoutManager);


        recyclerView.addItemDecoration(itemDecoration);


        recyclerView.setAdapter(adapter); // в него передаём adapter

        recyclerView.setHasFixedSize(true); // указываем что, у нас фикс. кол-во элементов
    }

    //имплемент (нажатия мышки в recyclerView)
    @Override
    public void onItemClick(int position) {
        Toast.makeText(this, "some text", Toast.LENGTH_SHORT).show();

        //сюда можно добавить дополнительные методы

    }
}