// Generated by Dagger (https://dagger.dev).
package info.nightscout.androidaps;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Config_Factory implements Factory<Config> {
  @Override
  public Config get() {
    return newInstance();
  }

  public static Config_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Config newInstance() {
    return new Config();
  }

  private static final class InstanceHolder {
    private static final Config_Factory INSTANCE = new Config_Factory();
  }
}