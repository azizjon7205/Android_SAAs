package com.example.android_saas.fragment.splash

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_saas.R
import com.example.android_saas.extention.activityNavController
import com.example.android_saas.extention.navigateSafely
import com.example.android_saas.manager.AuthManager

class SplashFragment : Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        countDownTimer()
    }

    private fun countDownTimer() {
        object : CountDownTimer(2000, 1000){
            override fun onTick(millisUntilFinished: Long) { }

            override fun onFinish() {
                when{
                    AuthManager.isAuthorized -> {
                        activityNavController().navigateSafely(R.id.action_global_mainFlowFragment)
                    }
                    !AuthManager.isAuthorized -> {
                        activityNavController().navigateSafely(R.id.action_global_loginFlowFragment)
                    }
                }
            }
        }.start()
    }
}