package io.giodude.one888.Connection;

import io.giodude.one888.Model.FBLiveMatchesModel;
import io.giodude.one888.Model.FBPastMatchesModel;
import io.giodude.one888.Model.FBPlayerListModel;
import io.giodude.one888.Model.FBTeamListModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiInterface {

    String Past_URL = "https://www.thesportsdb.com/api/v1/json/1/";

    @GET("eventspastleague.php?id=4328")
    Call<FBPastMatchesModel> getPast();

    String Live_URL = "https://sportscore1.p.rapidapi.com/sports/1/";

    @GET("events/live")
    @Headers({"x-rapidapi-host: sportscore1.p.rapidapi.com",
            "x-rapidapi-key: 07e55202eemshd454005e3a79774p103cccjsn4b32f05d3a2f",
            "useQueryString: true"})
    Call<FBLiveMatchesModel> getLive();

    String PLAYER_URL = "https://sportscore1.p.rapidapi.com/sports/1/";

    @GET("players")
    @Headers({"x-rapidapi-host: sportscore1.p.rapidapi.com",
            "x-rapidapi-key: 07e55202eemshd454005e3a79774p103cccjsn4b32f05d3a2f",
            "useQueryString: true"})
    Call<FBPlayerListModel> getPlayerList();

    String TEAM_URL = "https://sportscore1.p.rapidapi.com/sports/1/";

    @GET("teams")
    @Headers({"x-rapidapi-host: sportscore1.p.rapidapi.com",
            "x-rapidapi-key: 07e55202eemshd454005e3a79774p103cccjsn4b32f05d3a2f",
            "useQueryString: true"})
    Call<FBTeamListModel> getTeamList();
}
