// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.general.maintenance;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.MainApp;
import info.nightscout.androidaps.interfaces.ImportExportPrefsInterface;
import info.nightscout.androidaps.plugins.general.food.FoodPlugin;
import info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MaintenanceFragment_MembersInjector implements MembersInjector<MaintenanceFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<MaintenancePlugin> maintenancePluginProvider;

  private final Provider<MainApp> mainAppProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<TreatmentsPlugin> treatmentsPluginProvider;

  private final Provider<FoodPlugin> foodPluginProvider;

  private final Provider<ImportExportPrefsInterface> importExportPrefsProvider;

  public MaintenanceFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<MaintenancePlugin> maintenancePluginProvider, Provider<MainApp> mainAppProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<TreatmentsPlugin> treatmentsPluginProvider, Provider<FoodPlugin> foodPluginProvider,
      Provider<ImportExportPrefsInterface> importExportPrefsProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.maintenancePluginProvider = maintenancePluginProvider;
    this.mainAppProvider = mainAppProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.treatmentsPluginProvider = treatmentsPluginProvider;
    this.foodPluginProvider = foodPluginProvider;
    this.importExportPrefsProvider = importExportPrefsProvider;
  }

  public static MembersInjector<MaintenanceFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<MaintenancePlugin> maintenancePluginProvider, Provider<MainApp> mainAppProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<TreatmentsPlugin> treatmentsPluginProvider, Provider<FoodPlugin> foodPluginProvider,
      Provider<ImportExportPrefsInterface> importExportPrefsProvider) {
    return new MaintenanceFragment_MembersInjector(androidInjectorProvider, maintenancePluginProvider, mainAppProvider, resourceHelperProvider, treatmentsPluginProvider, foodPluginProvider, importExportPrefsProvider);
  }

  @Override
  public void injectMembers(MaintenanceFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectMaintenancePlugin(instance, maintenancePluginProvider.get());
    injectMainApp(instance, mainAppProvider.get());
    injectResourceHelper(instance, resourceHelperProvider.get());
    injectTreatmentsPlugin(instance, treatmentsPluginProvider.get());
    injectFoodPlugin(instance, foodPluginProvider.get());
    injectImportExportPrefs(instance, importExportPrefsProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.maintenance.MaintenanceFragment.maintenancePlugin")
  public static void injectMaintenancePlugin(MaintenanceFragment instance,
      MaintenancePlugin maintenancePlugin) {
    instance.maintenancePlugin = maintenancePlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.maintenance.MaintenanceFragment.mainApp")
  public static void injectMainApp(MaintenanceFragment instance, MainApp mainApp) {
    instance.mainApp = mainApp;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.maintenance.MaintenanceFragment.resourceHelper")
  public static void injectResourceHelper(MaintenanceFragment instance,
      ResourceHelper resourceHelper) {
    instance.resourceHelper = resourceHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.maintenance.MaintenanceFragment.treatmentsPlugin")
  public static void injectTreatmentsPlugin(MaintenanceFragment instance,
      TreatmentsPlugin treatmentsPlugin) {
    instance.treatmentsPlugin = treatmentsPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.maintenance.MaintenanceFragment.foodPlugin")
  public static void injectFoodPlugin(MaintenanceFragment instance, FoodPlugin foodPlugin) {
    instance.foodPlugin = foodPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.maintenance.MaintenanceFragment.importExportPrefs")
  public static void injectImportExportPrefs(MaintenanceFragment instance,
      ImportExportPrefsInterface importExportPrefs) {
    instance.importExportPrefs = importExportPrefs;
  }
}