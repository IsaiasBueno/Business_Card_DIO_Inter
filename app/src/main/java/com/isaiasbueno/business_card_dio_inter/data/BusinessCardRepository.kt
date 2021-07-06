package com.isaiasbueno.business_card_dio_inter.data

import com.isaiasbueno.business_card_dio_inter.data.BusinessCard
import com.isaiasbueno.business_card_dio_inter.data.BusinessCardDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class BusinessCardRepository(private val dao: BusinessCardDao) {

    fun insert(businessCard: BusinessCard) = runBlocking {
        launch(Dispatchers.IO) {
            dao.insert(businessCard)
        }
    }

    fun getAll() = dao.getAll()

}