package cc.littlelove

import android.app.Activity

/**
 * @author kevin
 * @date 2022/12/28
 */
object ActivityCollector {
    private val activities = ArrayList<Activity>()

    fun addActivity(activity: Activity)
    {
        activities.add(activity)
    }

    fun removeActivity(activity: Activity)
    {
        activities.remove(activity)
    }

    fun finishAll()
    {
        for (activity in activities)
        {
            if (!activity.isFinishing)
            {
                activity.finish()
            }
        }
        activities.clear()
        android.os.Process.killProcess(android.os.Process.myPid())
    }
}