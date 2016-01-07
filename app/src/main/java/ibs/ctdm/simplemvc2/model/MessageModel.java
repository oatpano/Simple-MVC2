package ibs.ctdm.simplemvc2.model;

import java.util.ArrayList;

/**
 * Created by vanirut on 07-Jan-16.
 */
public class MessageModel {

    ArrayList<String> _message = null;

    public MessageModel(){
        //TODO: Make message list persistant!!
        _message = new ArrayList<String>();
    }

    public int getCount(){
        return _message.size();
    }

    public String getMessage(int messageIndex){
        return _message.get(messageIndex);
    }

    public void addMessage(String message){
        _message.add(message);
    }

    public void removeMessage(int messageIndex){
        _message.remove(messageIndex);
    }
}
