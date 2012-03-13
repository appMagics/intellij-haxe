// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.haxe.lang.psi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface HaxeClassDeclaration extends HaxeComponent {

  @Nullable
  public HaxeClassBody getClassBody();

  @Nullable
  public HaxeComponentName getComponentName();

  @NotNull
  public List<HaxeFakeEnumMeta> getFakeEnumMetaList();

  @Nullable
  public HaxeInheritList getInheritList();

  @NotNull
  public List<HaxeRequireMeta> getRequireMetaList();

  @Nullable
  public HaxeTypeParam getTypeParam();
}
