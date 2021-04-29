// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.pump.virtual;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.plugins.treatments.TreatmentsPlugin;
import info.nightscout.androidaps.utils.FabricPrivacy;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class VirtualPumpFragment_MembersInjector implements MembersInjector<VirtualPumpFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<FabricPrivacy> fabricPrivacyProvider;

  private final Provider<VirtualPumpPlugin> virtualPumpPluginProvider;

  private final Provider<TreatmentsPlugin> treatmentsPluginProvider;

  public VirtualPumpFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<RxBusWrapper> rxBusProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider,
      Provider<VirtualPumpPlugin> virtualPumpPluginProvider,
      Provider<TreatmentsPlugin> treatmentsPluginProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.rxBusProvider = rxBusProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.fabricPrivacyProvider = fabricPrivacyProvider;
    this.virtualPumpPluginProvider = virtualPumpPluginProvider;
    this.treatmentsPluginProvider = treatmentsPluginProvider;
  }

  public static MembersInjector<VirtualPumpFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<RxBusWrapper> rxBusProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<FabricPrivacy> fabricPrivacyProvider,
      Provider<VirtualPumpPlugin> virtualPumpPluginProvider,
      Provider<TreatmentsPlugin> treatmentsPluginProvider) {
    return new VirtualPumpFragment_MembersInjector(androidInjectorProvider, rxBusProvider, resourceHelperProvider, fabricPrivacyProvider, virtualPumpPluginProvider, treatmentsPluginProvider);
  }

  @Override
  public void injectMembers(VirtualPumpFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectRxBus(instance, rxBusProvider.get());
    injectResourceHelper(instance, resourceHelperProvider.get());
    injectFabricPrivacy(instance, fabricPrivacyProvider.get());
    injectVirtualPumpPlugin(instance, virtualPumpPluginProvider.get());
    injectTreatmentsPlugin(instance, treatmentsPluginProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.pump.virtual.VirtualPumpFragment.rxBus")
  public static void injectRxBus(VirtualPumpFragment instance, RxBusWrapper rxBus) {
    instance.rxBus = rxBus;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.pump.virtual.VirtualPumpFragment.resourceHelper")
  public static void injectResourceHelper(VirtualPumpFragment instance,
      ResourceHelper resourceHelper) {
    instance.resourceHelper = resourceHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.pump.virtual.VirtualPumpFragment.fabricPrivacy")
  public static void injectFabricPrivacy(VirtualPumpFragment instance,
      FabricPrivacy fabricPrivacy) {
    instance.fabricPrivacy = fabricPrivacy;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.pump.virtual.VirtualPumpFragment.virtualPumpPlugin")
  public static void injectVirtualPumpPlugin(VirtualPumpFragment instance,
      VirtualPumpPlugin virtualPumpPlugin) {
    instance.virtualPumpPlugin = virtualPumpPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.pump.virtual.VirtualPumpFragment.treatmentsPlugin")
  public static void injectTreatmentsPlugin(VirtualPumpFragment instance,
      TreatmentsPlugin treatmentsPlugin) {
    instance.treatmentsPlugin = treatmentsPlugin;
  }
}