package com.example.yura.fragmentcontextmenu;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MyFragment extends Fragment {
    public static final int IDM_A = 101;
    public static final int IDM_B = 102;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_1, container, false);
        Button button = (Button)root.findViewById(R.id.button_long_press);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getActivity(), "Мяу!", Toast.LENGTH_LONG)
                        .show();
            }
        });

        registerForContextMenu(button);
        return root;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(Menu.NONE, IDM_A, Menu.NONE, "Menu A");
        menu.add(Menu.NONE, IDM_B, Menu.NONE, "Menu B");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case IDM_A:
                Toast.makeText(getActivity(), "Выбран пункт А", Toast.LENGTH_LONG)
                        .show();
                return true;
            case IDM_B:
                Toast.makeText(getActivity(), "Выбран пункт B", Toast.LENGTH_LONG)
                        .show();
                return true;
        }
        return super.onContextItemSelected(item);
    }
}
