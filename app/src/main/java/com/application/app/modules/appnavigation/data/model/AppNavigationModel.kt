package com.application.app.modules.appnavigation.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStartSideFull: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_start_side_full)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStartSide3: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_start_side_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStartSide4: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_start_side_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHjemmeskRm: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_hjemmesk_rm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtKanaler: String? = MyApp.getInstance().resources.getString(R.string.lbl_kanaler)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAfspiller: String? = MyApp.getInstance().resources.getString(R.string.lbl_afspiller)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSG: String? = MyApp.getInstance().resources.getString(R.string.lbl_s_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFavoritter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_favoritter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSpecefikKanal: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_specefik_kanal)

)
