package task5.hasmukhi.admin.task5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {


    private Button btn_go;
    private Button btn_back;
    private EditText editText;

    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_two, container, false);
        btn_go=(Button) view.findViewById(R.id.fr2_btn_go);
        btn_back=(Button)view.findViewById(R.id.fr2_btn_back);
        editText=(EditText)view.findViewById(R.id.fr2_ed_name);
        final String as=getArguments().getString("edname");

        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentThree fragmentThree=new FragmentThree();
                FragmentManager fm=  getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                String ds=editText.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("edname1",as);
                bundle.putString("edname3",ds);
                fragmentThree.setArguments(bundle);
                ft.replace(R.id.main_lr_layout,fragmentThree);
                editText.setText("");
                ft.addToBackStack("");
                ft.commit();
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm= getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                fm.popBackStack();
                ft.commit();

            }
        });
        return view;
    }

}
