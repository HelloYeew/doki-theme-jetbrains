package com.chrisrm.idea.themes.literature.club;

public final class MTSayoriTheme extends MTDokiDokiTheme {
  public MTSayoriTheme() {
    super("mt.sayori", "Material Sayori", false);
  }

  @Override
  protected String getBackgroundColorString() {
    return "f4fbfe";
  }

  @Override
  protected String getSecondaryBackgroundColorString() {
    return "c7f2ff";
  }

  @Override
  protected String getSecondaryForegroundColorString() {
    return "256fe2";
  }

  @Override
  protected String getSelectionForegroundColorString() {
    return "256fe2";
  }

  @Override
  protected String getSelectionBackgroundColorString() {
    return "99ebf0";
  }

  @Override
  protected String getTreeSelectionBackgroundColorString() {
    return "546eec";
  }

  @Override
  protected String getMenuBarSelectionForegroundColorString() {
    return "ffffff";
  }

  @Override
  protected String getMenuBarSelectionBackgroundColorString() {
    return "de0a22";
  }

  @Override
  protected String getNotificationsColorString() {
    return "c3e8ff";
  }

  @Override
  protected String getContrastColorString() {
    return "d8f2ff";
  }

  @Override
  protected String getEditorTabColorString() {
    return getContrastColorString();
  }
}