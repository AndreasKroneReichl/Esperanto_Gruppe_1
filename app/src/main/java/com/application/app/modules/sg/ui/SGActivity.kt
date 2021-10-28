package com.application.app.modules.sg.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySGBinding
import com.application.app.modules.favoritter.ui.FavoritterActivity
import com.application.app.modules.hjemmeskrm.ui.HjemmeskRmActivity
import com.application.app.modules.kanaler.ui.KanalerActivity
import com.application.app.modules.sg.`data`.viewmodel.SGVM
import kotlin.String
import kotlin.Unit

public class SGActivity : BaseActivity<ActivitySGBinding>(R.layout.activity_s_g) {
  private val viewModel: SGVM by viewModels<SGVM>()

  public override fun setUpClicks(): Unit {
    binding.frame5.setOnClickListener {

      val destIntent = HjemmeskRmActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.frame6.setOnClickListener {

      val destIntent = KanalerActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.frame7.setOnClickListener {

      val destIntent = FavoritterActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.sgvm = viewModel
  }

  public companion object {
    public const val TAG: String = "S_G_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SGActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
