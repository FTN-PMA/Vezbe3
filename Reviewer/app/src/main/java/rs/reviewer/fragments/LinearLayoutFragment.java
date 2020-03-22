package rs.reviewer.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import rs.reviewer.R;

public class LinearLayoutFragment extends Fragment {

	public static LinearLayoutFragment newInstance() {
        return new LinearLayoutFragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle data) {
        View view = inflater.inflate(R.layout.linear_layout, vg, false);

        /*
         * Kada dobijemo referencu, dalje mozemo da radimo sa tom komponenom sta zelimo.
         * Za razliku od aktivnosti, koja direktno ima findViewById metodu, posto nenjamo
         * tj 'lepimo' fragment zanci da dinamicki pravimo odredjen layout. Taj layout
         * ce biti smesten unutar view objekta, i zato moramo da koristimo findViewById metodu
         * nad tek cutanim layout-om.
         * */
        TextView textView = view.findViewById(R.id.linearTitle);
        textView.setText(R.string.linearlayout);

        return view;
	}

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Toast.makeText(getActivity(), "onActivityCreated()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Toast.makeText(getActivity(), "onAttach()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getActivity(), "onDestroyView()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getActivity(), "onDeatach()", Toast.LENGTH_SHORT).show();
    }
}