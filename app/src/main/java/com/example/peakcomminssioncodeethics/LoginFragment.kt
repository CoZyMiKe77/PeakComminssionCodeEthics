package com.example.peakcomminssioncodeethics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.peakcomminssioncodeethics.fragments.DashboardFragment

class LoginFragment : Fragment() {


      override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
                                 savedInstanceState: Bundle?
      ):View? {
        // Inflate the layout for this fragment
       val view = inflater.inflate(R.layout.fragment_login,container, false)
          val logBtn : Button = view.findViewById(R.id.loginBtn)
          logBtn.setOnClickListener {
                val fragment = DashboardFragment()
              val transaction = fragmentManager?.beginTransaction()
              transaction?.replace(R.id.nav_container,fragment)?.commit()
          }

          return view
    }



}