// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.dialogs;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerDialogFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.MainApp;
import info.nightscout.androidaps.interfaces.ProfileFunction;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker;
import info.nightscout.androidaps.plugins.general.nsclient.NSUpload;
import info.nightscout.androidaps.plugins.iob.iobCobCalculator.IobCobCalculatorPlugin;
import info.nightscout.androidaps.plugins.treatments.CarbsGenerator;
import info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin;
import info.nightscout.androidaps.utils.DateUtil;
import info.nightscout.androidaps.utils.DefaultValueHelper;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CarbsDialog_MembersInjector implements MembersInjector<CarbsDialog> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<SP> spProvider;

  private final Provider<DateUtil> dateUtilProvider;

  private final Provider<MainApp> mainAppProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<ConstraintChecker> constraintCheckerProvider;

  private final Provider<DefaultValueHelper> defaultValueHelperProvider;

  private final Provider<TreatmentsPlugin> treatmentsPluginProvider;

  private final Provider<ProfileFunction> profileFunctionProvider;

  private final Provider<IobCobCalculatorPlugin> iobCobCalculatorPluginProvider;

  private final Provider<NSUpload> nsUploadProvider;

  private final Provider<CarbsGenerator> carbsGeneratorProvider;

  public CarbsDialog_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<SP> spProvider,
      Provider<DateUtil> dateUtilProvider, Provider<MainApp> mainAppProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<ConstraintChecker> constraintCheckerProvider,
      Provider<DefaultValueHelper> defaultValueHelperProvider,
      Provider<TreatmentsPlugin> treatmentsPluginProvider,
      Provider<ProfileFunction> profileFunctionProvider,
      Provider<IobCobCalculatorPlugin> iobCobCalculatorPluginProvider,
      Provider<NSUpload> nsUploadProvider, Provider<CarbsGenerator> carbsGeneratorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.spProvider = spProvider;
    this.dateUtilProvider = dateUtilProvider;
    this.mainAppProvider = mainAppProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.constraintCheckerProvider = constraintCheckerProvider;
    this.defaultValueHelperProvider = defaultValueHelperProvider;
    this.treatmentsPluginProvider = treatmentsPluginProvider;
    this.profileFunctionProvider = profileFunctionProvider;
    this.iobCobCalculatorPluginProvider = iobCobCalculatorPluginProvider;
    this.nsUploadProvider = nsUploadProvider;
    this.carbsGeneratorProvider = carbsGeneratorProvider;
  }

  public static MembersInjector<CarbsDialog> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<SP> spProvider,
      Provider<DateUtil> dateUtilProvider, Provider<MainApp> mainAppProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<ConstraintChecker> constraintCheckerProvider,
      Provider<DefaultValueHelper> defaultValueHelperProvider,
      Provider<TreatmentsPlugin> treatmentsPluginProvider,
      Provider<ProfileFunction> profileFunctionProvider,
      Provider<IobCobCalculatorPlugin> iobCobCalculatorPluginProvider,
      Provider<NSUpload> nsUploadProvider, Provider<CarbsGenerator> carbsGeneratorProvider) {
    return new CarbsDialog_MembersInjector(androidInjectorProvider, aapsLoggerProvider, spProvider, dateUtilProvider, mainAppProvider, resourceHelperProvider, constraintCheckerProvider, defaultValueHelperProvider, treatmentsPluginProvider, profileFunctionProvider, iobCobCalculatorPluginProvider, nsUploadProvider, carbsGeneratorProvider);
  }

  @Override
  public void injectMembers(CarbsDialog instance) {
    DaggerDialogFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    DialogFragmentWithDate_MembersInjector.injectAapsLogger(instance, aapsLoggerProvider.get());
    DialogFragmentWithDate_MembersInjector.injectSp(instance, spProvider.get());
    DialogFragmentWithDate_MembersInjector.injectDateUtil(instance, dateUtilProvider.get());
    injectMainApp(instance, mainAppProvider.get());
    injectResourceHelper(instance, resourceHelperProvider.get());
    injectConstraintChecker(instance, constraintCheckerProvider.get());
    injectDefaultValueHelper(instance, defaultValueHelperProvider.get());
    injectTreatmentsPlugin(instance, treatmentsPluginProvider.get());
    injectProfileFunction(instance, profileFunctionProvider.get());
    injectIobCobCalculatorPlugin(instance, iobCobCalculatorPluginProvider.get());
    injectNsUpload(instance, nsUploadProvider.get());
    injectCarbsGenerator(instance, carbsGeneratorProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.dialogs.CarbsDialog.mainApp")
  public static void injectMainApp(CarbsDialog instance, MainApp mainApp) {
    instance.mainApp = mainApp;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.dialogs.CarbsDialog.resourceHelper")
  public static void injectResourceHelper(CarbsDialog instance, ResourceHelper resourceHelper) {
    instance.resourceHelper = resourceHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.dialogs.CarbsDialog.constraintChecker")
  public static void injectConstraintChecker(CarbsDialog instance,
      ConstraintChecker constraintChecker) {
    instance.constraintChecker = constraintChecker;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.dialogs.CarbsDialog.defaultValueHelper")
  public static void injectDefaultValueHelper(CarbsDialog instance,
      DefaultValueHelper defaultValueHelper) {
    instance.defaultValueHelper = defaultValueHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.dialogs.CarbsDialog.treatmentsPlugin")
  public static void injectTreatmentsPlugin(CarbsDialog instance,
      TreatmentsPlugin treatmentsPlugin) {
    instance.treatmentsPlugin = treatmentsPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.dialogs.CarbsDialog.profileFunction")
  public static void injectProfileFunction(CarbsDialog instance, ProfileFunction profileFunction) {
    instance.profileFunction = profileFunction;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.dialogs.CarbsDialog.iobCobCalculatorPlugin")
  public static void injectIobCobCalculatorPlugin(CarbsDialog instance,
      IobCobCalculatorPlugin iobCobCalculatorPlugin) {
    instance.iobCobCalculatorPlugin = iobCobCalculatorPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.dialogs.CarbsDialog.nsUpload")
  public static void injectNsUpload(CarbsDialog instance, NSUpload nsUpload) {
    instance.nsUpload = nsUpload;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.dialogs.CarbsDialog.carbsGenerator")
  public static void injectCarbsGenerator(CarbsDialog instance, CarbsGenerator carbsGenerator) {
    instance.carbsGenerator = carbsGenerator;
  }
}