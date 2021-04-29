// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.general.automation.dialogs;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerDialogFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.MainApp;
import info.nightscout.androidaps.dialogs.DialogFragmentWithDate_MembersInjector;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.general.automation.AutomationPlugin;
import info.nightscout.androidaps.utils.DateUtil;
import info.nightscout.androidaps.utils.sharedPreferences.SP;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChooseTriggerDialog_MembersInjector implements MembersInjector<ChooseTriggerDialog> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<SP> spProvider;

  private final Provider<DateUtil> dateUtilProvider;

  private final Provider<AutomationPlugin> automationPluginProvider;

  private final Provider<MainApp> mainAppProvider;

  public ChooseTriggerDialog_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<SP> spProvider,
      Provider<DateUtil> dateUtilProvider, Provider<AutomationPlugin> automationPluginProvider,
      Provider<MainApp> mainAppProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.spProvider = spProvider;
    this.dateUtilProvider = dateUtilProvider;
    this.automationPluginProvider = automationPluginProvider;
    this.mainAppProvider = mainAppProvider;
  }

  public static MembersInjector<ChooseTriggerDialog> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<AAPSLogger> aapsLoggerProvider, Provider<SP> spProvider,
      Provider<DateUtil> dateUtilProvider, Provider<AutomationPlugin> automationPluginProvider,
      Provider<MainApp> mainAppProvider) {
    return new ChooseTriggerDialog_MembersInjector(androidInjectorProvider, aapsLoggerProvider, spProvider, dateUtilProvider, automationPluginProvider, mainAppProvider);
  }

  @Override
  public void injectMembers(ChooseTriggerDialog instance) {
    DaggerDialogFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    DialogFragmentWithDate_MembersInjector.injectAapsLogger(instance, aapsLoggerProvider.get());
    DialogFragmentWithDate_MembersInjector.injectSp(instance, spProvider.get());
    DialogFragmentWithDate_MembersInjector.injectDateUtil(instance, dateUtilProvider.get());
    injectAutomationPlugin(instance, automationPluginProvider.get());
    injectMainApp(instance, mainAppProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.dialogs.ChooseTriggerDialog.automationPlugin")
  public static void injectAutomationPlugin(ChooseTriggerDialog instance,
      AutomationPlugin automationPlugin) {
    instance.automationPlugin = automationPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.automation.dialogs.ChooseTriggerDialog.mainApp")
  public static void injectMainApp(ChooseTriggerDialog instance, MainApp mainApp) {
    instance.mainApp = mainApp;
  }
}