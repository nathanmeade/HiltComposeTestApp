package com.meadetechnologies.hiltcomposetestapp

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    @Named("someRandomString")
    fun someRandomString(): String {
        return "aodfhgo"
    }

    @Singleton
    @Provides
    @Named("someRandomString2")
    fun someRandomString2(): String {
        return "aodfhgo2"
    }
}
