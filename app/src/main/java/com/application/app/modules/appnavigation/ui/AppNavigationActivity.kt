package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.afspiller.ui.AfspillerActivity
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.favoritter.ui.FavoritterActivity
import com.application.app.modules.hjemmeskrm.ui.HjemmeskRmActivity
import com.application.app.modules.kanaler.ui.KanalerActivity
import com.application.app.modules.sg.ui.SGActivity
import com.application.app.modules.specefikkanal.ui.SpecefikKanalActivity
import com.application.app.modules.splash.ui.SplashActivity
import com.application.app.modules.startside3.ui.StartSide3Activity
import com.application.app.modules.startside4.ui.StartSide4Activity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun setUpClicks(): Unit {
    binding.linear3.setOnClickListener {

      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear6.setOnClickListener {

      val destIntent = HjemmeskRmActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear11.setOnClickListener {

      val destIntent = SpecefikKanalActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear4.setOnClickListener {

      val destIntent = StartSide3Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear5.setOnClickListener {

      val destIntent = StartSide4Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear8.setOnClickListener {

      val destIntent = AfspillerActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear9.setOnClickListener {

      val destIntent = SGActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear10.setOnClickListener {

      val destIntent = FavoritterActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear7.setOnClickListener {

      val destIntent = KanalerActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.appNavigationVM = viewModel
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
