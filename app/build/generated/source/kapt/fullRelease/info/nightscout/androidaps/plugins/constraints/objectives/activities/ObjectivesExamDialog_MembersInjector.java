// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.plugins.constraints.objectives.activities;

import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerDialogFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.plugins.bus.RxBusWrapper;
import info.nightscout.androidaps.utils.DateUtil;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ObjectivesExamDialog_MembersInjector implements MembersInjector<ObjectivesExamDialog> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<RxBusWrapper> rxBusProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<DateUtil> dateUtilProvider;

  public ObjectivesExamDialog_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<RxBusWrapper> rxBusProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<DateUtil> dateUtilProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.rxBusProvider = rxBusProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.dateUtilProvider = dateUtilProvider;
  }

  public static MembersInjector<ObjectivesExamDialog> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<RxBusWrapper> rxBusProvider, Provider<ResourceHelper> resourceHelperProvider,
      Provider<DateUtil> dateUtilProvider) {
    return new ObjectivesExamDialog_MembersInjector(androidInjectorProvider, rxBusProvider, resourceHelperProvider, dateUtilProvider);
  }

  @Override
  public void injectMembers(ObjectivesExamDialog instance) {
    DaggerDialogFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectRxBus(instance, rxBusProvider.get());
    injectResourceHelper(instance, resourceHelperProvider.get());
    injectDateUtil(instance, dateUtilProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.constraints.objectives.activities.ObjectivesExamDialog.rxBus")
  public static void injectRxBus(ObjectivesExamDialog instance, RxBusWrapper rxBus) {
    instance.rxBus = rxBus;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.constraints.objectives.activities.ObjectivesExamDialog.resourceHelper")
  public static void injectResourceHelper(ObjectivesExamDialog instance,
      ResourceHelper resourceHelper) {
    instance.resourceHelper = resourceHelper;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.plugins.constraints.objectives.activities.ObjectivesExamDialog.dateUtil")
  public static void injectDateUtil(ObjectivesExamDialog instance, DateUtil dateUtil) {
    instance.dateUtil = dateUtil;
  }
}