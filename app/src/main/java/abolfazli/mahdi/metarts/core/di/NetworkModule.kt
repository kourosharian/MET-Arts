package abolfazli.mahdi.metarts.core.di

import abolfazli.mahdi.metarts.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {


    @Singleton
    @Provides
    fun provideMoshi(): MoshiConverterFactory {
        return MoshiConverterFactory.create()
    }


    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
        if (BuildConfig.DEBUG) {
            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            builder.addInterceptor(loggingInterceptor)
        }
        return builder.build()
    }

    @Provides
    fun provideRetrofitBuilder(okHttpClient: OkHttpClient, moshi: MoshiConverterFactory): Retrofit {
        return Retrofit.Builder().client(okHttpClient)
            .addConverterFactory(moshi)
            .baseUrl("https://collectionapi.metmuseum.org/public/collection/v1/")
            .build()
    }




}