package com.application.app.modules.startside3.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class StartSide3Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAuskultuKieV: String? =
      MyApp.getInstance().resources.getString(R.string.msg_auskultu_kie_v)

)
