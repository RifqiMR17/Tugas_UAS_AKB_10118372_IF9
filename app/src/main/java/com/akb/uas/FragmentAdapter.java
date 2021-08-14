package com.akb.uas;
/**
 Nama : Rifqi Muhammad Rizqullah
 NIM : 10118372
 TGL : 14-8-2021
 */

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new MapsFragment();
        }
        return new InfoFragment();
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private class MapsFragment extends Fragment {
    }
}
