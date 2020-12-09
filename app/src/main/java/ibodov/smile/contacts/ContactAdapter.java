package ibodov.smile.contacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

//реализация адаптера
public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> { // ContactAdapter наследуется от
    // RecyclerView.Adapter который будет работать ContactAdapter.ContactViewHolder

    // Создания Массива который состоит из объектов класса Contact
    private Contact[] localContacts; // иниц будет в MainActivity/ localContacts - 1вый

   // private OnItemClickListener localListener;

    public ContactAdapter(Contact[] contacts, OnItemClickListener listener) { // Создаём Конструктор который будет принимать массив контактов./ 2ой параметр это MainActivity
        localContacts = new Contact[contacts.length];
     //   localListener = listener;

        for (int i=0; i<contacts.length; i++) {
            localContacts[i] = contacts[i];
        }
    }

    //2. имплиминтируем (реализуем) 3 метода
   @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        return new  ContactViewHolder(view); //Возвращаем новый созданный ContactViewHolder и передаём наш созданный view
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        holder.textView.setText(localContacts[position].getName() + " " + localContacts[position].getLastName()); // holder-это ContactViewHolder/ обращ. к localContacts на позицию position, и вытаскиваем getName.
    }

    @Override
    public int getItemCount() {
        return localContacts.length; // сюда возвращаем количество элементов массива
    }

    //1. Создаем ViewHolder - Java Представление в RecycleView
    //Это вложенный класс (Необходимо про иниц. конструктор)
    class ContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textView;    //Декларация. Наш тествю который постоянно меняется

        public ContactViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView); //иниц. нашего тествю

            itemView.setOnClickListener(this); //при нажатии
        }

        // Это Имплиментировает класс ContactViewHolder
        @Override
        public void onClick(View view) {
       //     localListener.onItemClick(getAdapterPosition());
        }
    }

    //Интерфейс между ContactAdapter и MainActivity
    interface OnItemClickListener {
        public void onItemClick(int position);
    }
}
