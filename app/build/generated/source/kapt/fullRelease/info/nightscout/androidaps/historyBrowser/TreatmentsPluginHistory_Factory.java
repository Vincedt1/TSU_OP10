// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.historyBrowser;

import android.content.Context;
import dagger.android.HasAndroidInjector;
import dagger.internal.Factory;
import info.nightscout.androidaps.interfaces.ActivePluginProvider;
import info.nightscout.androidaps.interfaces.ProfileFunction;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.plugins.general.nsclient.NSUpload;
import info.nightscout.androidaps.plugins.general.nsclient.UploadQueue;
import info.nightscout.androidaps.utils.DateUtil;
import info.nightscout.androidaps.utils.FabricPrivacy;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TreatmentsPluginHistory_Factory implements Factory<TreatmentsPluginHistory> {
  private final Provider<HasAndroidInjector> injectorProvider;

  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<Context> contextProvider;

  private final Provider<SP> spProvider;

  private final Provider<ProfileFunction> profileFunctionProvider;

  private final Provider<ActivePluginProvider> activePluginProvider;

  private final Provider<NSUpload> nsUploadProvider;

  private final Provider<FabricPrivacy> fabricPrivacyProvider;

  private final Provider<DateUtil> dateUtilProvider;

  private final Provider<UploadQueue> uploadQueueProvider;

  public TreatmentsPluginHistory_Factory(Provider<HasAndroidInjector> injectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<ResourceHelper> resourceHelperProvider, Provider<Context> contextProvider,
      Provider<SP> spProvider, Provider<ProfileFunction> profileFunctionProvider,
      Provider<ActivePluginProvider> activePluginProvider, Provider<NSUpload> nsUploadProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider, Provider<DateUtil> dateUtilProvider,
      Provider<UploadQueue> uploadQueueProvider) {
    this.injectorProvider = injectorProvider;
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.rxBusProvider = rxBusProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.contextProvider = contextProvider;
    this.spProvider = spProvider;
    this.profileFunctionProvider = profileFunctionProvider;
    this.activePluginProvider = activePluginProvider;
    this.nsUploadProvider = nsUploadProvider;
    this.fabricPrivacyProvider = fabricPrivacyProvider;
    this.dateUtilProvider = dateUtilProvider;
    this.uploadQueueProvider = uploadQueueProvider;
  }

  @Override
  public TreatmentsPluginHistory get() {
    return newInstance(injectorProvider.get(), aapsLoggerProvider.get(), rxBusProvider.get(), resourceHelperProvider.get(), contextProvider.get(), spProvider.get(), profileFunctionProvider.get(), activePluginProvider.get(), nsUploadProvider.get(), fabricPrivacyProvider.get(), dateUtilProvider.get(), uploadQueueProvider.get());
  }

  public static TreatmentsPluginHistory_Factory create(
      Provider<HasAndroidInjector> injectorProvider, Provider<AAPSLogger> aapsLoggerProvider,
      Provider<RxBusWrapper> rxBusProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<Context> contextProvider, Provider<SP> spProvider,
      Provider<ProfileFunction> profileFunctionProvider,
      Provider<ActivePluginProvider> activePluginProvider, Provider<NSUpload> nsUploadProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider, Provider<DateUtil> dateUtilProvider,
      Provider<UploadQueue> uploadQueueProvider) {
    return new TreatmentsPluginHistory_Factory(injectorProvider, aapsLoggerProvider, rxBusProvider, resourceHelperProvider, contextProvider, spProvider, profileFunctionProvider, activePluginProvider, nsUploadProvider, fabricPrivacyProvider, dateUtilProvider, uploadQueueProvider);
  }

  public static TreatmentsPluginHistory newInstance(HasAndroidInjector injector,
      AAPSLogger aapsLogger, RxBusWrapper rxBus, ResourceHelper resourceHelper, Context context,
      SP sp, ProfileFunction profileFunction, ActivePluginProvider activePlugin, NSUpload nsUpload,
      FabricPrivacy fabricPrivacy, DateUtil dateUtil, UploadQueue uploadQueue) {
    return new TreatmentsPluginHistory(injector, aapsLogger, rxBus, resourceHelper, context, sp, profileFunction, activePlugin, nsUpload, fabricPrivacy, dateUtil, uploadQueue);
  }
}