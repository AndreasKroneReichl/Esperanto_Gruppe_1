package com.application.app.modules.startside4.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.startside4.`data`.model.StartSide4Model

public class StartSide4VM : ViewModel() {
  public val startSide4Model: MutableLiveData<StartSide4Model> = MutableLiveData(StartSide4Model())
}
