package com.application.app.modules.kanaler.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityKanalerBinding
import com.application.app.modules.favoritter.ui.FavoritterActivity
import com.application.app.modules.hjemmeskrm.ui.HjemmeskRmActivity
import com.application.app.modules.kanaler.`data`.viewmodel.KanalerVM
import com.application.app.modules.sg.ui.SGActivity
import com.application.app.modules.specefikkanal.ui.SpecefikKanalActivity
import kotlin.String
import kotlin.Unit

public class KanalerActivity : BaseActivity<ActivityKanalerBinding>(R.layout.activity_kanaler) {
  private val viewModel: KanalerVM by viewModels<KanalerVM>()

  public override fun setUpClicks(): Unit {
    binding.frame5.setOnClickListener {

                  val destIntent = FavoritterActivity.getIntent(this, null)
                  startActivity(destIntent)

                }
    binding.image7.setOnClickListener {

                  val destIntent = HjemmeskRmActivity.getIntent(this, null)
                  startActivity(destIntent)

                }
    binding.txtMuzaiko.setOnClickListener {

                  val destIntent = SpecefikKanalActivity.getIntent(this, null)
                  startActivity(destIntent)

                }
    binding.linear1.setOnClickListener {

                  val destIntent = SGActivity.getIntent(this, null)
                  startActivity(destIntent)

                }
    binding.frame7.setOnClickListener {

                  val destIntent = HjemmeskRmActivity.getIntent(this, null)
                  startActivity(destIntent)

                }
  }

  public override fun onInitialized(): Unit {
    binding.kanalerVM = viewModel
  }

  public companion object {
    public const val TAG: String = "KANALER_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, KanalerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
