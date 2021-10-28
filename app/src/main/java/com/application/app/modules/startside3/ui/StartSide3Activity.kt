package com.application.app.modules.startside3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityStartSide3Binding
import com.application.app.modules.splash.ui.SplashActivity
import com.application.app.modules.startside3.`data`.viewmodel.StartSide3VM
import com.application.app.modules.startside4.ui.StartSide4Activity
import kotlin.String
import kotlin.Unit

public class StartSide3Activity :
    BaseActivity<ActivityStartSide3Binding>(R.layout.activity_start_side_3) {
  private val viewModel: StartSide3VM by viewModels<StartSide3VM>()

  public override fun setUpClicks(): Unit {
    binding.image1.setOnClickListener {

      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image.setOnClickListener {

      val destIntent = StartSide4Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.startSide3VM = viewModel
  }

  public companion object {
    public const val TAG: String = "START_SIDE3ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, StartSide3Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
