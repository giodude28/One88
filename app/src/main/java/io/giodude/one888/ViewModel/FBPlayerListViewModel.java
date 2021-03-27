package io.giodude.one888.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import io.giodude.one888.Connection.Repositories;
import io.giodude.one888.Model.FBPlayerListModel;

public class FBPlayerListViewModel extends ViewModel {

    private MutableLiveData<List<FBPlayerListModel.Datum>> players;
    public Repositories repositories;


    public void init(){
        if (players != null){
            return;
        }

        repositories = Repositories.getInstance();
        players = repositories.getPLAYERFB();
    }


    public LiveData<List<FBPlayerListModel.Datum>> getPlayers(){
        return players;
    }
}
