package fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gaojichonci01_2.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import adapter.RvAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private RecyclerView rv;
    private SmartRefreshLayout sml;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_home, container, false);
            initView(view);
            initData();
        return view;
    }

    private void initData() {

    }

    private void initView(View view) {
        rv = view.findViewById(R.id.rv);
        sml = view.findViewById(R.id.sml);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        final RvAdapter rvAdapter = new RvAdapter(getActivity());
        rv.setAdapter(rvAdapter);
    }
}
