// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.aps.loop;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.utils.DateUtil;
import info.nightscout.androidaps.utils.FabricPrivacy;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoopFragment_MembersInjector implements MembersInjector<LoopFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<SP> spProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<FabricPrivacy> fabricPrivacyProvider;

  private final Provider<LoopPlugin> loopPluginProvider;

  private final Provider<DateUtil> dateUtilProvider;

  public LoopFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<SP> spProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider, Provider<LoopPlugin> loopPluginProvider,
      Provider<DateUtil> dateUtilProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.rxBusProvider = rxBusProvider;
    this.spProvider = spProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.fabricPrivacyProvider = fabricPrivacyProvider;
    this.loopPluginProvider = loopPluginProvider;
    this.dateUtilProvider = dateUtilProvider;
  }

  public static MembersInjector<LoopFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<SP> spProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider, Provider<LoopPlugin> loopPluginProvider,
      Provider<DateUtil> dateUtilProvider) {
    return new LoopFragment_MembersInjector(androidInjectorProvider, aapsLoggerProvider, rxBusProvider, spProvider, resourceHelperProvider, fabricPrivacyProvider, loopPluginProvider, dateUtilProvider);
  }

  @Override
  public void injectMembers(LoopFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectAapsLogger(instance, aapsLoggerProvider.get());
    injectRxBus(instance, rxBusProvider.get());
    injectSp(instance, spProvider.get());
    injectResourceHelper(instance, resourceHelperProvider.get());
    injectFabricPrivacy(instance, fabricPrivacyProvider.get());
    injectLoopPlugin(instance, loopPluginProvider.get());
    injectDateUtil(instance, dateUtilProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.aps.loop.LoopFragment.aapsLogger")
  public static void injectAapsLogger(LoopFragment instance, AAPSLogger aapsLogger) {
    instance.aapsLogger = aapsLogger;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.aps.loop.LoopFragment.rxBus")
  public static void injectRxBus(LoopFragment instance, RxBusWrapper rxBus) {
    instance.rxBus = rxBus;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.aps.loop.LoopFragment.sp")
  public static void injectSp(LoopFragment instance, SP sp) {
    instance.sp = sp;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.aps.loop.LoopFragment.resourceHelper")
  public static void injectResourceHelper(LoopFragment instance, ResourceHelper resourceHelper) {
    instance.resourceHelper = resourceHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.aps.loop.LoopFragment.fabricPrivacy")
  public static void injectFabricPrivacy(LoopFragment instance, FabricPrivacy fabricPrivacy) {
    instance.fabricPrivacy = fabricPrivacy;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.aps.loop.LoopFragment.loopPlugin")
  public static void injectLoopPlugin(LoopFragment instance, LoopPlugin loopPlugin) {
    instance.loopPlugin = loopPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.aps.loop.LoopFragment.dateUtil")
  public static void injectDateUtil(LoopFragment instance, DateUtil dateUtil) {
    instance.dateUtil = dateUtil;
  }
}