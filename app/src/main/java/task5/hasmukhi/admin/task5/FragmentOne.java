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
public class FragmentOne extends Fragment {

    private Button btn1;
    private EditText editText;
    private String name;
    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_one, container, false);
        btn1=(Button) view.findViewById(R.id.fr1_btn1);
        editText=(EditText)view.findViewById(R.id.fr1_ed_name);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTwo fragmentTwo=new FragmentTwo();
                FragmentManager fm=  getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                name=editText.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("edname",name);
                fragmentTwo.setArguments(bundle);
                ft.replace(R.id.main_lr_layout,fragmentTwo);
                editText.setText("");
                ft.addToBackStack("");
                ft.commit();
            }
        });
        return view;
    }

}
