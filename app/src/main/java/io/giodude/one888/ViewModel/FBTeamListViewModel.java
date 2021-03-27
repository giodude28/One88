package io.giodude.one888.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import io.giodude.one888.Connection.Repositories;
import io.giodude.one888.Model.FBTeamListModel;

public class FBTeamListViewModel extends ViewModel {

    private MutableLiveData<List<FBTeamListModel.Datum>> teams;
    public Repositories repositories;

    public void init(){
        if (teams != null){
            return;
        }
        repositories = Repositories.getInstance();
        teams = repositories.getTEAMFB();
    }

    public LiveData<List<FBTeamListModel.Datum>> getTEAMS(){
        return teams;
    }
}
