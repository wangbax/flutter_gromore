package net.niuxiaoer.flutter_gromore.utils

import android.app.Activity
import android.app.Application
import android.os.Bundle

/**
 * BaseActivityLifecycleCallbacks
 *
 * @author wt
 * @create 2024-04-14 17:15
 */
abstract class BaseActivityLifecycleCallbacks : Application.ActivityLifecycleCallbacks {
  override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
    // no op
  }

  override fun onActivityStarted(activity: Activity) {
    // no op
  }

  override fun onActivityResumed(activity: Activity) {
    // no op
  }

  override fun onActivityPaused(activity: Activity) {
    // no op
  }

  override fun onActivityStopped(activity: Activity) {
    // no op
  }

  override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
    // no op
  }

  override fun onActivityDestroyed(activity: Activity) {
    // no op
  }
}