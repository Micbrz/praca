package com.example.projekt.Login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.projekt.R
import com.google.firebase.auth.FirebaseAuth


class LoginFragment : Fragment() {
    private val fbAuth = FirebaseAuth.getInstance()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupLoginClick()
        setupRegistrationClick()
    }

    private fun setupRegistrationClick() {

    }

    private fun setupLoginClick() {
        val email = email
        fbAuth.signInWithEmailAndPassword(email,)
    }


}