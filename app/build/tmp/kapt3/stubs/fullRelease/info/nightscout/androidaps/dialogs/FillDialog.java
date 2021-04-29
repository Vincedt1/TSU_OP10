package info.nightscout.androidaps.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u0002052\u0006\u00102\u001a\u000203H\u0016J\u001a\u00107\u001a\u0002052\u0006\u00108\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0018\u00109\u001a\u0002052\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u00020?H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u0006@"}, d2 = {"Linfo/nightscout/androidaps/dialogs/FillDialog;", "Linfo/nightscout/androidaps/dialogs/DialogFragmentWithDate;", "()V", "_binding", "Linfo/nightscout/androidaps/databinding/DialogFillBinding;", "activePlugin", "Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "getActivePlugin", "()Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;", "setActivePlugin", "(Linfo/nightscout/androidaps/interfaces/ActivePluginProvider;)V", "binding", "getBinding", "()Linfo/nightscout/androidaps/databinding/DialogFillBinding;", "commandQueue", "Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;", "getCommandQueue", "()Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;", "setCommandQueue", "(Linfo/nightscout/androidaps/interfaces/CommandQueueProvider;)V", "constraintChecker", "Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;", "getConstraintChecker", "()Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;", "setConstraintChecker", "(Linfo/nightscout/androidaps/plugins/configBuilder/ConstraintChecker;)V", "ctx", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "setCtx", "(Landroid/content/Context;)V", "nsUpload", "Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;", "getNsUpload", "()Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;", "setNsUpload", "(Linfo/nightscout/androidaps/plugins/general/nsclient/NSUpload;)V", "resourceHelper", "Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "getResourceHelper", "()Linfo/nightscout/androidaps/utils/resources/ResourceHelper;", "setResourceHelper", "(Linfo/nightscout/androidaps/utils/resources/ResourceHelper;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onSaveInstanceState", "onViewCreated", "view", "requestPrimeBolus", "insulin", "", "notes", "", "submit", "", "app_fullRelease"})
public final class FillDialog extends info.nightscout.androidaps.dialogs.DialogFragmentWithDate {
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker constraintChecker;
    @javax.inject.Inject()
    public info.nightscout.androidaps.utils.resources.ResourceHelper resourceHelper;
    @javax.inject.Inject()
    public android.content.Context ctx;
    @javax.inject.Inject()
    public info.nightscout.androidaps.plugins.general.nsclient.NSUpload nsUpload;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.CommandQueueProvider commandQueue;
    @javax.inject.Inject()
    public info.nightscout.androidaps.interfaces.ActivePluginProvider activePlugin;
    private info.nightscout.androidaps.databinding.DialogFillBinding _binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker getConstraintChecker() {
        return null;
    }
    
    public final void setConstraintChecker(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.configBuilder.ConstraintChecker p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.utils.resources.ResourceHelper getResourceHelper() {
        return null;
    }
    
    public final void setResourceHelper(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.utils.resources.ResourceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getCtx() {
        return null;
    }
    
    public final void setCtx(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.plugins.general.nsclient.NSUpload getNsUpload() {
        return null;
    }
    
    public final void setNsUpload(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.plugins.general.nsclient.NSUpload p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.CommandQueueProvider getCommandQueue() {
        return null;
    }
    
    public final void setCommandQueue(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.CommandQueueProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final info.nightscout.androidaps.interfaces.ActivePluginProvider getActivePlugin() {
        return null;
    }
    
    public final void setActivePlugin(@org.jetbrains.annotations.NotNull()
    info.nightscout.androidaps.interfaces.ActivePluginProvider p0) {
    }
    
    private final info.nightscout.androidaps.databinding.DialogFillBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public boolean submit() {
        return false;
    }
    
    private final void requestPrimeBolus(double insulin, java.lang.String notes) {
    }
    
    public FillDialog() {
        super();
    }
}