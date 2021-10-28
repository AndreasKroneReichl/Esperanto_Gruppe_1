package com.application.app.modules.afspiller.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAfspillerBinding
import com.application.app.modules.afspiller.`data`.viewmodel.AfspillerVM
import com.application.app.modules.favoritter.ui.FavoritterActivity
import com.application.app.modules.hjemmeskrm.ui.HjemmeskRmActivity
import com.application.app.modules.kanaler.ui.KanalerActivity
import com.application.app.modules.sg.ui.SGActivity
import com.application.app.modules.specefikkanal.ui.SpecefikKanalActivity
import kotlin.String
import kotlin.Unit

public class AfspillerActivity : BaseActivity<ActivityAfspillerBinding>(R.layout.activity_afspiller)
    {
  private val viewModel: AfspillerVM by viewModels<AfspillerVM>()

  public override fun setUpClicks(): Unit {
    binding.frame6.setOnClickListener {

      val destIntent = HjemmeskRmActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.frame7.setOnClickListener {

      val destIntent = KanalerActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.frame8.setOnClickListener {

      val destIntent = FavoritterActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.image1.setOnClickListener {

      val destIntent = SpecefikKanalActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear6.setOnClickListener {

      val destIntent = SGActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.afspillerVM = viewModel
  }

  public companion object {
    public const val TAG: String = "AFSPILLER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AfspillerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
