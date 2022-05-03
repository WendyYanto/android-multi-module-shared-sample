package dev.wendyyanto.androidmultimodule.di.module

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dev.wendyyanto.androidmultimodule.MainActivity
import dev.wendyyanto.featureone.utility.di.component.FeatureOneComponent
import dev.wendyyanto.featuretwo.utility.di.component.FeatureTwoComponent
import javax.inject.Singleton

@Singleton
@Component(modules = [UtilityModule::class])
interface AppComponent {

  fun inject(mainActivity: MainActivity)

  fun featureOneComponent(): FeatureOneComponent

  fun featureTwoComponent(): FeatureTwoComponent

  @Component.Builder
  interface Builder {

    @BindsInstance
    fun application(application: Application): Builder

    fun build(): AppComponent
  }
}