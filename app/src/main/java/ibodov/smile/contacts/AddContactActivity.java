package ibodov.smile.contacts;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AddContactActivity extends AppCompatActivity { // 1. Все активити наследуются то AppCompatActivity




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) { // 2. переопределяем метод onCreate
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_addcontact); //Вызывается метод setContentView и задается layout представление
    }
}
