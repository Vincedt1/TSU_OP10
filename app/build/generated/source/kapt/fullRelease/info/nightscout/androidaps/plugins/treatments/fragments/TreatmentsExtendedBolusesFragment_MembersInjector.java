// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.treatments.fragments;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.interfaces.ActivePluginProvider;
import info.nightscout.androidaps.interfaces.ProfileFunction;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.plugins.general.nsclient.NSUpload;
import info.nightscout.androidaps.plugins.general.nsclient.UploadQueue;
import info.nightscout.androidaps.utils.DateUtil;
import info.nightscout.androidaps.utils.FabricPrivacy;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TreatmentsExtendedBolusesFragment_MembersInjector implements MembersInjector<TreatmentsExtendedBolusesFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<ActivePluginProvider> activePluginProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<FabricPrivacy> fabricPrivacyProvider;

  private final Provider<NSUpload> nsUploadProvider;

  private final Provider<UploadQueue> uploadQueueProvider;

  private final Provider<ProfileFunction> profileFunctionProvider;

  private final Provider<DateUtil> dateUtilProvider;

  public TreatmentsExtendedBolusesFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ActivePluginProvider> activePluginProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider, Provider<NSUpload> nsUploadProvider,
      Provider<UploadQueue> uploadQueueProvider, Provider<ProfileFunction> profileFunctionProvider,
      Provider<DateUtil> dateUtilProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.activePluginProvider = activePluginProvider;
    this.rxBusProvider = rxBusProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.fabricPrivacyProvider = fabricPrivacyProvider;
    this.nsUploadProvider = nsUploadProvider;
    this.uploadQueueProvider = uploadQueueProvider;
    this.profileFunctionProvider = profileFunctionProvider;
    this.dateUtilProvider = dateUtilProvider;
  }

  public static MembersInjector<TreatmentsExtendedBolusesFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ActivePluginProvider> activePluginProvider, Provider<RxBusWrapper> rxBusProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider, Provider<NSUpload> nsUploadProvider,
      Provider<UploadQueue> uploadQueueProvider, Provider<ProfileFunction> profileFunctionProvider,
      Provider<DateUtil> dateUtilProvider) {
    return new TreatmentsExtendedBolusesFragment_MembersInjector(androidInjectorProvider, activePluginProvider, rxBusProvider, resourceHelperProvider, fabricPrivacyProvider, nsUploadProvider, uploadQueueProvider, profileFunctionProvider, dateUtilProvider);
  }

  @Override
  public void injectMembers(TreatmentsExtendedBolusesFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectActivePlugin(instance, activePluginProvider.get());
    injectRxBus(instance, rxBusProvider.get());
    injectResourceHelper(instance, resourceHelperProvider.get());
    injectFabricPrivacy(instance, fabricPrivacyProvider.get());
    injectNsUpload(instance, nsUploadProvider.get());
    injectUploadQueue(instance, uploadQueueProvider.get());
    injectProfileFunction(instance, profileFunctionProvider.get());
    injectDateUtil(instance, dateUtilProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsExtendedBolusesFragment.activePlugin")
  public static void injectActivePlugin(TreatmentsExtendedBolusesFragment instance,
      ActivePluginProvider activePlugin) {
    instance.activePlugin = activePlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsExtendedBolusesFragment.rxBus")
  public static void injectRxBus(TreatmentsExtendedBolusesFragment instance, RxBusWrapper rxBus) {
    instance.rxBus = rxBus;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsExtendedBolusesFragment.resourceHelper")
  public static void injectResourceHelper(TreatmentsExtendedBolusesFragment instance,
      ResourceHelper resourceHelper) {
    instance.resourceHelper = resourceHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsExtendedBolusesFragment.fabricPrivacy")
  public static void injectFabricPrivacy(TreatmentsExtendedBolusesFragment instance,
      FabricPrivacy fabricPrivacy) {
    instance.fabricPrivacy = fabricPrivacy;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsExtendedBolusesFragment.nsUpload")
  public static void injectNsUpload(TreatmentsExtendedBolusesFragment instance, NSUpload nsUpload) {
    instance.nsUpload = nsUpload;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsExtendedBolusesFragment.uploadQueue")
  public static void injectUploadQueue(TreatmentsExtendedBolusesFragment instance,
      UploadQueue uploadQueue) {
    instance.uploadQueue = uploadQueue;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsExtendedBolusesFragment.profileFunction")
  public static void injectProfileFunction(TreatmentsExtendedBolusesFragment instance,
      ProfileFunction profileFunction) {
    instance.profileFunction = profileFunction;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsExtendedBolusesFragment.dateUtil")
  public static void injectDateUtil(TreatmentsExtendedBolusesFragment instance, DateUtil dateUtil) {
    instance.dateUtil = dateUtil;
  }
}