// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.general.overview;

import dagger.android.HasAndroidInjector;
import dagger.internal.Factory;
import info.nightscout.androidaps.Config;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.plugins.general.overview.notifications.NotificationStore;
import info.nightscout.androidaps.utils.FabricPrivacy;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OverviewPlugin_Factory implements Factory<OverviewPlugin> {
  private final Provider<HasAndroidInjector> injectorProvider;

  private final Provider<NotificationStore> notificationStoreProvider;

  private final Provider<FabricPrivacy> fabricPrivacyProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<SP> spProvider;

  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<Config> configProvider;

  public OverviewPlugin_Factory(Provider<HasAndroidInjector> injectorProvider,
      Provider<NotificationStore> notificationStoreProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<SP> spProvider, Provider<AAPSLogger> aapsLoggerProvider,
      Provider<ResourceHelper> resourceHelperProvider, Provider<Config> configProvider) {
    this.injectorProvider = injectorProvider;
    this.notificationStoreProvider = notificationStoreProvider;
    this.fabricPrivacyProvider = fabricPrivacyProvider;
    this.rxBusProvider = rxBusProvider;
    this.spProvider = spProvider;
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.configProvider = configProvider;
  }

  @Override
  public OverviewPlugin get() {
    return newInstance(injectorProvider.get(), notificationStoreProvider.get(), fabricPrivacyProvider.get(), rxBusProvider.get(), spProvider.get(), aapsLoggerProvider.get(), resourceHelperProvider.get(), configProvider.get());
  }

  public static OverviewPlugin_Factory create(Provider<HasAndroidInjector> injectorProvider,
      Provider<NotificationStore> notificationStoreProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<SP> spProvider, Provider<AAPSLogger> aapsLoggerProvider,
      Provider<ResourceHelper> resourceHelperProvider, Provider<Config> configProvider) {
    return new OverviewPlugin_Factory(injectorProvider, notificationStoreProvider, fabricPrivacyProvider, rxBusProvider, spProvider, aapsLoggerProvider, resourceHelperProvider, configProvider);
  }

  public static OverviewPlugin newInstance(HasAndroidInjector injector,
      NotificationStore notificationStore, FabricPrivacy fabricPrivacy, RxBusWrapper rxBus, SP sp,
      AAPSLogger aapsLogger, ResourceHelper resourceHelper, Config config) {
    return new OverviewPlugin(injector, notificationStore, fabricPrivacy, rxBus, sp, aapsLogger, resourceHelper, config);
  }
}