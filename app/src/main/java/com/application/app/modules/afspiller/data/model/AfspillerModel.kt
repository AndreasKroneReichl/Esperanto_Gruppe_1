package com.application.app.modules.afspiller.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class AfspillerModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtElsendoDe2021: String? =
      MyApp.getInstance().resources.getString(R.string.msg_elsendo_de_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPriLaDanEro: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pri_la_dan_ero)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtElsendoDe2022: String? =
      MyApp.getInstance().resources.getString(R.string.msg_elsendo_de_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHejmo: String? = MyApp.getInstance().resources.getString(R.string.lbl_hejmo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtKanaloj: String? = MyApp.getInstance().resources.getString(R.string.lbl_kanaloj)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPlajSatataj: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_plaj_satataj)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSercu: String? = MyApp.getInstance().resources.getString(R.string.lbl_sercu)

)
