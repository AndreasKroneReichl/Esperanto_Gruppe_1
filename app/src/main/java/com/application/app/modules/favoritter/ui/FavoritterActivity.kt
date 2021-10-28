package com.application.app.modules.favoritter.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityFavoritterBinding
import com.application.app.modules.afspiller.ui.AfspillerActivity
import com.application.app.modules.favoritter.`data`.viewmodel.FavoritterVM
import com.application.app.modules.hjemmeskrm.ui.HjemmeskRmActivity
import com.application.app.modules.kanaler.ui.KanalerActivity
import com.application.app.modules.sg.ui.SGActivity
import com.application.app.modules.specefikkanal.ui.SpecefikKanalActivity
import kotlin.String
import kotlin.Unit

public class FavoritterActivity :
    BaseActivity<ActivityFavoritterBinding>(R.layout.activity_favoritter) {
  private val viewModel: FavoritterVM by viewModels<FavoritterVM>()

  public override fun setUpClicks(): Unit {
    binding.frame3.setOnClickListener {

              val destIntent = HjemmeskRmActivity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.frame2.setOnClickListener {

              val destIntent = KanalerActivity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.linear1.setOnClickListener {

              val destIntent = SGActivity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.image3.setOnClickListener {

              val destIntent = SpecefikKanalActivity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.txtElsendoDe2021.setOnClickListener {

              val destIntent = AfspillerActivity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public override fun onInitialized(): Unit {
    binding.favoritterVM = viewModel
  }

  public companion object {
    public const val TAG: String = "FAVORITTER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FavoritterActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
