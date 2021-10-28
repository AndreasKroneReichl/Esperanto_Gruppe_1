package com.application.app.modules.favoritter.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class FavoritterModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPlejSatataj: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_plej_satataj)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtKanaloj: String? = MyApp.getInstance().resources.getString(R.string.lbl_kanaloj)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtKanaloj1: String? = MyApp.getInstance().resources.getString(R.string.lbl_kanaloj)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtElsendo: String? = MyApp.getInstance().resources.getString(R.string.lbl_elsendo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSercu: String? = MyApp.getInstance().resources.getString(R.string.lbl_sercu)
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
  public var txtKanaloj2: String? = MyApp.getInstance().resources.getString(R.string.lbl_kanaloj)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHejmo: String? = MyApp.getInstance().resources.getString(R.string.lbl_hejmo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtVarsoviaVento: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_varsovia_vento)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPolaRetradio: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_pola_retradio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtKernpunkto: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kernpunkto)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtVinilkosmo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_vinilkosmo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPriSano: String? = MyApp.getInstance().resources.getString(R.string.lbl_pri_sano)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtElsendoDe2021: String? =
      MyApp.getInstance().resources.getString(R.string.msg_elsendo_de_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtElsendoDe20213: String? =
      MyApp.getInstance().resources.getString(R.string.msg_elsendo_de_20213)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtElsendoDe20214: String? =
      MyApp.getInstance().resources.getString(R.string.msg_elsendo_de_20214)

)
