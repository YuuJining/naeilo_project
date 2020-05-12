package com.example.naeilo_project;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MainViewPagerAdapter extends FragmentStateAdapter {
        Fragment homeFragment;
        private int mPageCount;

        public MainViewPagerAdapter(FragmentActivity fragmentActivity, int pageCount) {
            super(fragmentActivity);
            this.mPageCount = pageCount;
        }

        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                    homeFragment = new HomeFragment();
                    return homeFragment;
                    default:
                        return null;
            }
        }

    @Override
    public int getItemCount() {
        return mPageCount;
    }
}
