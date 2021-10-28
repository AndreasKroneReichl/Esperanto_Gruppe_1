package com.application.app.modules.startside4.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityStartSide4Binding
import com.application.app.modules.hjemmeskrm.ui.HjemmeskRmActivity
import com.application.app.modules.startside3.ui.StartSide3Activity
import com.application.app.modules.startside4.`data`.viewmodel.StartSide4VM
import kotlin.String
import kotlin.Unit

public class StartSide4Activity :
    BaseActivity<ActivityStartSide4Binding>(R.layout.activity_start_side_4) {
  private val viewModel: StartSide4VM by viewModels<StartSide4VM>()

  public override fun setUpClicks(): Unit {
    binding.frame1.setOnClickListener {

          val destIntent = HjemmeskRmActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.image1.setOnClickListener {

          val destIntent = StartSide3Activity.getIntent(this, null)
          startActivity(destIntent)

        }
  }

  public override fun onInitialized(): Unit {
    binding.startSide4VM = viewModel
  }

  public companion object {
    public const val TAG: String = "START_SIDE4ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, StartSide4Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
