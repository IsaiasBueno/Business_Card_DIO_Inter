package com.isaiasbueno.business_card_dio_inter

import android.app.Application
import com.isaiasbueno.business_card_dio_inter.data.AppDatabase
import com.isaiasbueno.business_card_dio_inter.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}