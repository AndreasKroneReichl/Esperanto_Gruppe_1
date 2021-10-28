package com.application.app.modules.specefikkanal.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySpecefikKanalBinding
import com.application.app.modules.afspiller.ui.AfspillerActivity
import com.application.app.modules.favoritter.ui.FavoritterActivity
import com.application.app.modules.hjemmeskrm.ui.HjemmeskRmActivity
import com.application.app.modules.kanaler.ui.KanalerActivity
import com.application.app.modules.sg.ui.SGActivity
import com.application.app.modules.specefikkanal.`data`.viewmodel.SpecefikKanalVM
import kotlin.String
import kotlin.Unit

public class SpecefikKanalActivity :
    BaseActivity<ActivitySpecefikKanalBinding>(R.layout.activity_specefik_kanal) {
  private val viewModel: SpecefikKanalVM by viewModels<SpecefikKanalVM>()

  public override fun setUpClicks(): Unit {
    binding.frame7.setOnClickListener {

                      val destIntent = HjemmeskRmActivity.getIntent(this, null)
                      startActivity(destIntent)

                    }
    binding.frame8.setOnClickListener {

                      val destIntent = KanalerActivity.getIntent(this, null)
                      startActivity(destIntent)

                    }
    binding.frame9.setOnClickListener {

                      val destIntent = FavoritterActivity.getIntent(this, null)
                      startActivity(destIntent)

                    }
    binding.image1.setOnClickListener {

                      val destIntent = KanalerActivity.getIntent(this, null)
                      startActivity(destIntent)

                    }
    binding.linear5.setOnClickListener {

                      val destIntent = SGActivity.getIntent(this, null)
                      startActivity(destIntent)

                    }
    binding.txtElsendoDe2021.setOnClickListener {

                      val destIntent = AfspillerActivity.getIntent(this, null)
                      startActivity(destIntent)

                    }
    binding.image4.setOnClickListener {

                      val destIntent = AfspillerActivity.getIntent(this, null)
                      startActivity(destIntent)

                    }
  }

  public override fun onInitialized(): Unit {
    binding.specefikKanalVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SPECEFIK_KANAL_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SpecefikKanalActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
