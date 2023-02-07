package com.owasp.reverser.ui.lessons;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.owasp.reverser.databinding.FragmentLessonBinding;
/**
 * This file is part of the Security Shepherd Project.
 *
 * <p>The Security Shepherd project is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.<br>
 *
 * <p>The Security Shepherd project is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE. See the GNU General Public License for more details.<br>
 *
 * <p>You should have received a copy of the GNU General Public License along with the Security
 * Shepherd project. If not, see <http://www.gnu.org/licenses/>.
 *
 * @author Sean Duggan
 */

public class LessonFragment extends Fragment {

    private FragmentLessonBinding binding;
    static String Serial = Build.SERIAL;
    static String Model = Build.MODEL;
    static String ID = "test";
    static String Manufacturer = Build.MANUFACTURER;
    static String Brand = Build.BRAND;
    static String Type = Build.TYPE;
    static String User = Build.USER;
    static String Incremental = Build.VERSION.INCREMENTAL;
    static String SDK = Build.VERSION.SDK;
    static String Board = Build.BOARD;
    static String Host = Build.HOST;
    static String Fingerprint = Build.FINGERPRINT;
    static String Release = Build.VERSION.RELEASE;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LessonModel LessonModel = new ViewModelProvider(this).get(LessonModel.class);

        binding = FragmentLessonBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textViewSerial = binding.textViewSerial;
        final TextView textViewBuild = binding.textViewBuild;

        LessonModel.getSerialText().observe(getViewLifecycleOwner(), textViewSerial::setText);
        LessonModel.getModelText().observe(getViewLifecycleOwner(), textViewBuild::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}

