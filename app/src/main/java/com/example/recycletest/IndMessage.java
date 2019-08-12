package com.example.recycletest;

import java.util.ArrayList;
import java.util.List;

public class IndMessage {
    private static IndMessage ourInstance = null;

    private String mContactName;
    private String mContactMessage;
    private List<IndMessage> mIndMessages = new ArrayList<>();


    public static IndMessage getInstance(){
        if(ourInstance == null){
            ourInstance = new IndMessage();
            ourInstance.generateData();
        }
        return ourInstance;
    }

    public IndMessage(){
        //nothing done here
    }

    public IndMessage(String contactName, String contactMessage){
        mContactName = contactName;
        mContactMessage = contactMessage;
    }

    private void generateData(){
        for (int i = 0; i < 30; i++){
            IndMessage indMessage = new IndMessage("Emmanuel Julius",
                    "Here I am, making a difference as always");
            mIndMessages.add(indMessage);
        }
    }

    public List<IndMessage> getIndMessages(){
        return mIndMessages;
    }
}
