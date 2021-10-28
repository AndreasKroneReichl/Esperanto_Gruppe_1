package com.application.app.modules.hjemmeskrm.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class HjemmeskRm2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtE33aSekretajN: String? =
      MyApp.getInstance().resources.getString(R.string.msg_e33a_sekretaj_n)

)
