// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps.queue.commands;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import info.nightscout.androidaps.interfaces.ActivePluginProvider;
import info.nightscout.androidaps.interfaces.CommandQueueProvider;
import info.nightscout.androidaps.logging.AAPSLogger;
import info.nightscout.androidaps.plugins.general.smsCommunicator.SmsCommunicatorPlugin;
import info.nightscout.androidaps.utils.resources.ResourceHelper;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CommandSetProfile_MembersInjector implements MembersInjector<CommandSetProfile> {
  private final Provider<AAPSLogger> aapsLoggerProvider;

  private final Provider<ResourceHelper> resourceHelperProvider;

  private final Provider<SmsCommunicatorPlugin> smsCommunicatorPluginProvider;

  private final Provider<ActivePluginProvider> activePluginProvider;

  private final Provider<CommandQueueProvider> commandQueueProvider;

  public CommandSetProfile_MembersInjector(Provider<AAPSLogger> aapsLoggerProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<SmsCommunicatorPlugin> smsCommunicatorPluginProvider,
      Provider<ActivePluginProvider> activePluginProvider,
      Provider<CommandQueueProvider> commandQueueProvider) {
    this.aapsLoggerProvider = aapsLoggerProvider;
    this.resourceHelperProvider = resourceHelperProvider;
    this.smsCommunicatorPluginProvider = smsCommunicatorPluginProvider;
    this.activePluginProvider = activePluginProvider;
    this.commandQueueProvider = commandQueueProvider;
  }

  public static MembersInjector<CommandSetProfile> create(Provider<AAPSLogger> aapsLoggerProvider,
      Provider<ResourceHelper> resourceHelperProvider,
      Provider<SmsCommunicatorPlugin> smsCommunicatorPluginProvider,
      Provider<ActivePluginProvider> activePluginProvider,
      Provider<CommandQueueProvider> commandQueueProvider) {
    return new CommandSetProfile_MembersInjector(aapsLoggerProvider, resourceHelperProvider, smsCommunicatorPluginProvider, activePluginProvider, commandQueueProvider);
  }

  @Override
  public void injectMembers(CommandSetProfile instance) {
    Command_MembersInjector.injectAapsLogger(instance, aapsLoggerProvider.get());
    Command_MembersInjector.injectResourceHelper(instance, resourceHelperProvider.get());
    injectSmsCommunicatorPlugin(instance, smsCommunicatorPluginProvider.get());
    injectActivePlugin(instance, activePluginProvider.get());
    injectCommandQueue(instance, commandQueueProvider.get());
  }

  @InjectedFieldSignature("info.nightscout.androidaps.queue.commands.CommandSetProfile.smsCommunicatorPlugin")
  public static void injectSmsCommunicatorPlugin(CommandSetProfile instance,
      SmsCommunicatorPlugin smsCommunicatorPlugin) {
    instance.smsCommunicatorPlugin = smsCommunicatorPlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.queue.commands.CommandSetProfile.activePlugin")
  public static void injectActivePlugin(CommandSetProfile instance,
      ActivePluginProvider activePlugin) {
    instance.activePlugin = activePlugin;
  }

  @InjectedFieldSignature("info.nightscout.androidaps.queue.commands.CommandSetProfile.commandQueue")
  public static void injectCommandQueue(CommandSetProfile instance,
      CommandQueueProvider commandQueue) {
    instance.commandQueue = commandQueue;
  }
}