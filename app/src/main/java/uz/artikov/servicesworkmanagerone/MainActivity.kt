package uz.artikov.servicesworkmanagerone

import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Service turlari

        //foreground,background and bound

        //service ishga tushirish
        //startService and boundService


        //MyJobService, custom edi

        //getSystemService deb bir necha service larni chaqirib olish mumkin
        //sababi systemada mavjud

        /*   val jobScheduler = getSystemService(JOB_SCHEDULER_SERVICE) as JobScheduler

           val jobInfo = JobInfo.Builder(1, ComponentName(this, MyJobService::class.java))

           //Bu yerda bir necha service xizmatlari ko'rsatilgan
           //Manifest ga ham qo'shiladi

           val jobService =
               jobInfo.setRequiresCharging(true).setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY)
                   .setOverrideDeadline(60 * 1000).build()

           jobScheduler.schedule(jobService)
   */



    }
}