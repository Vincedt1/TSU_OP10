// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.treatments.fragments;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.interfaces.ProfileFunction;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.plugins.general.nsclient.NSUpload;
import info.nightscout.androidaps.plugins.general.nsclient.UploadQueue;
import info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin;
import info.nightscout.androidaps.utils.DateUtil;
import info.nightscout.androidaps.utils.FabricPrivacy;
import info.nightscout.androidaps.utils.buildHelper.BuildHelper;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TreatmentsBolusFragment_MembersInjector implements MembersInjector<TreatmentsBolusFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<SP> spProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<FabricPrivacy> fabricPrivacyProvider;

  private final Provider<TreatmentsPlugin> treatmentsPluginProvider;

  private final Provider<ProfileFunction> profileFunctionProvider;

  private final Provider<NSUpload> nsUploadProvider;

  private final Provider<UploadQueue> uploadQueueProvider;

  private final Provider<DateUtil> dateUtilProvider;

  private final Provider<BuildHelper> buildHelperProvider;

  public TreatmentsBolusFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<RxBusWrapper> rxBusProvider, Provider<SP> spProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider,
      Provider<TreatmentsPlugin> treatmentsPluginProvider,
      Provider<ProfileFunction> profileFunctionProvider, Provider<NSUpload> nsUploadProvider,
      Provider<UploadQueue> uploadQueueProvider, Provider<DateUtil> dateUtilProvider,
      Provider<BuildHelper> buildHelperProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.rxBusProvider = rxBusProvider;
    this.spProvider = spProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.fabricPrivacyProvider = fabricPrivacyProvider;
    this.treatmentsPluginProvider = treatmentsPluginProvider;
    this.profileFunctionProvider = profileFunctionProvider;
    this.nsUploadProvider = nsUploadProvider;
    this.uploadQueueProvider = uploadQueueProvider;
    this.dateUtilProvider = dateUtilProvider;
    this.buildHelperProvider = buildHelperProvider;
  }

  public static MembersInjector<TreatmentsBolusFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<RxBusWrapper> rxBusProvider, Provider<SP> spProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider,
      Provider<TreatmentsPlugin> treatmentsPluginProvider,
      Provider<ProfileFunction> profileFunctionProvider, Provider<NSUpload> nsUploadProvider,
      Provider<UploadQueue> uploadQueueProvider, Provider<DateUtil> dateUtilProvider,
      Provider<BuildHelper> buildHelperProvider) {
    return new TreatmentsBolusFragment_MembersInjector(androidInjectorProvider, rxBusProvider, spProvider, resourceHelperProvider, fabricPrivacyProvider, treatmentsPluginProvider, profileFunctionProvider, nsUploadProvider, uploadQueueProvider, dateUtilProvider, buildHelperProvider);
  }

  @Override
  public void injectMembers(TreatmentsBolusFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectRxBus(instance, rxBusProvider.get());
    injectSp(instance, spProvider.get());
    injectResourceHelper(instance, resourceHelperProvider.get());
    injectFabricPrivacy(instance, fabricPrivacyProvider.get());
    injectTreatmentsPlugin(instance, treatmentsPluginProvider.get());
    injectProfileFunction(instance, profileFunctionProvider.get());
    injectNsUpload(instance, nsUploadProvider.get());
    injectUploadQueue(instance, uploadQueueProvider.get());
    injectDateUtil(instance, dateUtilProvider.get());
    injectBuildHelper(instance, buildHelperProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsBolusFragment.rxBus")
  public static void injectRxBus(TreatmentsBolusFragment instance, RxBusWrapper rxBus) {
    instance.rxBus = rxBus;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsBolusFragment.sp")
  public static void injectSp(TreatmentsBolusFragment instance, SP sp) {
    instance.sp = sp;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsBolusFragment.resourceHelper")
  public static void injectResourceHelper(TreatmentsBolusFragment instance,
      ResourceHelper resourceHelper) {
    instance.resourceHelper = resourceHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsBolusFragment.fabricPrivacy")
  public static void injectFabricPrivacy(TreatmentsBolusFragment instance,
      FabricPrivacy fabricPrivacy) {
    instance.fabricPrivacy = fabricPrivacy;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsBolusFragment.treatmentsPlugin")
  public static void injectTreatmentsPlugin(TreatmentsBolusFragment instance,
      TreatmentsPlugin treatmentsPlugin) {
    instance.treatmentsPlugin = treatmentsPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsBolusFragment.profileFunction")
  public static void injectProfileFunction(TreatmentsBolusFragment instance,
      ProfileFunction profileFunction) {
    instance.profileFunction = profileFunction;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsBolusFragment.nsUpload")
  public static void injectNsUpload(TreatmentsBolusFragment instance, NSUpload nsUpload) {
    instance.nsUpload = nsUpload;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsBolusFragment.uploadQueue")
  public static void injectUploadQueue(TreatmentsBolusFragment instance, UploadQueue uploadQueue) {
    instance.uploadQueue = uploadQueue;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsBolusFragment.dateUtil")
  public static void injectDateUtil(TreatmentsBolusFragment instance, DateUtil dateUtil) {
    instance.dateUtil = dateUtil;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.treatments.fragments.TreatmentsBolusFragment.buildHelper")
  public static void injectBuildHelper(TreatmentsBolusFragment instance, BuildHelper buildHelper) {
    instance.buildHelper = buildHelper;
  }
}