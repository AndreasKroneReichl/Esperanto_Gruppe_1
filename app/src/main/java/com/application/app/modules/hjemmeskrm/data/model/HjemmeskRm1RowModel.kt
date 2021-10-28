package com.application.app.modules.hjemmeskrm.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class HjemmeskRm1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtElsendoDe2021: String? =
      MyApp.getInstance().resources.getString(R.string.msg_elsendo_de_2021)

)
