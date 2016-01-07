package ibs.ctdm.simplemvc2.Controller;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import ibs.ctdm.simplemvc2.model.MessageModel;

public class MainActivity extends AppCompatActivity implements ListAdapter{

    //View
    ListView _messageListView = null;

    //Data Model
    MessageModel _messageModel = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        _messageModel = new MessageModel();
        _messageModel .addMessage("Hi A");
        _messageModel .addMessage("Hi B");
        _messageModel .addMessage("Hi C");
        _messageModel .addMessage("Hi D");
        _messageModel .addMessage("Hi E");

        //TODO: Connect model to controller

        //Create view hierarchy
        _messageListView = new ListView(this);
        _messageListView.setAdapter(this);
        setContentView(_messageListView);

    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return _messageModel .getCount();
    }

    @Override
    public Object getItem(int position) {
        return _messageModel .getMessage(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView  messageView = new TextView(this);
        messageView.setText(_messageModel .getMessage(position));

        return messageView;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
