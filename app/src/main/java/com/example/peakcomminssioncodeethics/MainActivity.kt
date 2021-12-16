package com.example.peakcomminssioncodeethics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main2)


        var viewPager = findViewById(R.id.viewPager) as ViewPager
        var tablayout = findViewById(R.id.tablayout) as TabLayout

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(RegisterFragment(),title = "Register")
        fragmentAdapter.addFragment(LoginFragment(),title = "Login")

        viewPager.adapter = fragmentAdapter
        tablayout.setupWithViewPager(viewPager)

   }

    private fun replaceFragment(fragment: Fragment){

        if (fragment !=null){


        }
    }

}