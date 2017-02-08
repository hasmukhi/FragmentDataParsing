package task5.hasmukhi.admin.task5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentThree extends Fragment {


    public FragmentThree() {
        // Required empty public constructor
    }

    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_three, container, false);

        TextView text1=(TextView) view.findViewById(R.id.fr3_txt_name1);
        TextView text2=(TextView) view.findViewById(R.id.fr3_txt_name2);
        String name1=getArguments().getString("edname1");
        String name2=getArguments().getString("edname3");
        text1.setText(name1);
        text2.setText(name2);
        btn=(Button) view.findViewById(R.id.fr3_btn_back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                fm.popBackStack();
                ft.commit();
            }
        });
        return view;
    }

}
