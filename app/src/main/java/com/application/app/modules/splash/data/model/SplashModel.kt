package com.application.app.modules.splash.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SplashModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtBonvenon: String? = MyApp.getInstance().resources.getString(R.string.lbl_bonvenon)

)
