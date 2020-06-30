package service;

import bean.RvBean;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    String mUrl = "https://www.wanandroid.com/";
    @GET("project/list/1/json?cid=294")
    Observable<RvBean> rvBean();
}
