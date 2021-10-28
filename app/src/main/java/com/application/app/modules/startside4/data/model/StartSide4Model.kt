package com.application.app.modules.startside4.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class StartSide4Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPremuApudPor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_premu_apud_por)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSekva: String? = MyApp.getInstance().resources.getString(R.string.lbl_sekva)

)
