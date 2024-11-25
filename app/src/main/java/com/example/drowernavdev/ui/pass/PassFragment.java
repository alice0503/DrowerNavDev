package com.example.drowernavdev.ui.pass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.drowernavdev.databinding.FragmentPassBinding;

public class PassFragment extends Fragment {

    private FragmentPassBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PassViewModel passViewModel =
                new ViewModelProvider(this).get(PassViewModel.class);

        binding = FragmentPassBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPass;
        passViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}