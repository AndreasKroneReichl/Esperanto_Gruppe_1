package com.application.app.modules.hjemmeskrm.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class HjemmeskRmModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtKioNovas: String? = MyApp.getInstance().resources.getString(R.string.lbl_kio_novas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLastatempaLuda: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lastatempa_luda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtElsendoDe20212: String? =
      MyApp.getInstance().resources.getString(R.string.msg_elsendo_de_20212)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEsperanto2019: String? =
      MyApp.getInstance().resources.getString(R.string.msg_esperanto_2019)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtE32aTelepatio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_e32a_telepatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt24102021Ange: String? =
      MyApp.getInstance().resources.getString(R.string.msg_24_10_2021_ange)
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
