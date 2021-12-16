package com.example.peakcomminssioncodeethics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.peakcomminssioncodeethics.fragments.DashboardFragment
import com.example.peakcomminssioncodeethics.fragments.NotificationsFragment
import com.example.peakcomminssioncodeethics.fragments.ProfileFragment

class DashboardActivity : AppCompatActivity() {

    private val dashboardFragment = DashboardFragment()
    private val notificationsFragment = NotificationsFragment()
    private val profileFragment = ProfileFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_dashboard)

        replaceFragment(dashboardFragment)
    }

    private fun replaceFragment(fragment: Fragment){
        if (fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()

        }
    }
}