// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.general.wear;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WearFragment_MembersInjector implements MembersInjector<WearFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<WearPlugin> wearPluginProvider;

  public WearFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<WearPlugin> wearPluginProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.wearPluginProvider = wearPluginProvider;
  }

  public static MembersInjector<WearFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<WearPlugin> wearPluginProvider) {
    return new WearFragment_MembersInjector(androidInjectorProvider, wearPluginProvider);
  }

  @Override
  public void injectMembers(WearFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectWearPlugin(instance, wearPluginProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.general.wear.WearFragment.wearPlugin")
  public static void injectWearPlugin(WearFragment instance, WearPlugin wearPlugin) {
    instance.wearPlugin = wearPlugin;
  }
}