/*
 * Copyright 2017 JSBerrocoso
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.jsbs.sample.uitesting.app

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

  fun startFragment(fragment: Fragment) {
    val fragmentManager = supportFragmentManager
    val fragmentTransaction = fragmentManager.beginTransaction()
    fragmentTransaction.replace(R.id.container, fragment)
    fragmentTransaction.commit()
  }
}

class FakeConstants {
  companion object {
    @JvmStatic
    val SLEEP_TIME_MILLIS: Long = 3000
    @JvmStatic
    val EMAIL_OK = "santiago.berrocoso@gigigo.com"
    @JvmStatic
    val PASS_OK = "OKfakepass1"
    @JvmStatic
    val EMAIL_KO = "ko_santiago.berrocoso@gigigo.com"
    @JvmStatic
    val PASS_KO = "KOfakepass1"
  }
}
