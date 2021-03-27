package io.giodude.one888.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import io.giodude.one888.Connection.Repositories;
import io.giodude.one888.Model.FBLiveMatchesModel;

public class FBLiveMatchesViewModel extends ViewModel {

    private MutableLiveData<List<FBLiveMatchesModel.Datum>> live;
    public Repositories repositories;

    public void init(){
        if (live != null){
            return;
        }
        repositories = Repositories.getInstance();
        live = repositories.getLIVEFB();
    }

    public LiveData<List<FBLiveMatchesModel.Datum>> getlive() {
        return live;
    }
}
