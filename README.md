# intellij-wrap-html-attributes

![Build](https://github.com/cristianofromagio/intellij-wrap-html-attributes/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)

## Template ToDo list
- [x] Create a new [IntelliJ Platform Plugin Template][template] project.
- [x] Verify the [pluginGroup](/gradle.properties), [plugin ID](/src/main/resources/META-INF/plugin.xml) and [sources package](/src/main/kotlin).
- [x] Review the [Legal Agreements](https://plugins.jetbrains.com/docs/marketplace/legal-agreements.html).
- [ ] [Publish a plugin manually](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html?from=IJPluginTemplate) for the first time.
- [ ] Set the Plugin ID in the above README badges.
- [ ] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html).
- [x] Click the <kbd>Watch</kbd> button on the top of the [IntelliJ Platform Plugin Template][template] to be notified about releases containing new features and fixes.

<!-- Plugin description -->
Put every attribute of an HTML tag on a new line.


Usage: place text cursor on a tag and press (default) keymap <kbd>Ctrl</kbd> + <kbd>Alt</kbd> + <kbd>W</kbd>.


<img src="https://raw.githubusercontent.com/cristianofromagio/intellij-wrap-html-attributes/main/assets/usage.gif" border="0" width="500"/>


See `File` > `⚙️ Settings` (or <kbd>Ctrl</kbd> + <kbd>Alt</kbd> + <kbd>S</kbd>) > `Tools` > `Wrap HTML Plugin` for plugin settings.


v1.1.0 credits to [Sander Bruggeman](https://github.com/terrabythia) ([source](https://github.com/terrabythia/intellij_plugin_wrap_html_attributes))
<!-- Plugin description end -->

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "intellij-wrap-html-attributes"</kbd> >
  <kbd>Install Plugin</kbd>
  
- Manually:

  Download the [latest release](https://github.com/cristianofromagio/intellij-wrap-html-attributes/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


## Credits

The code on this repository for v1.1.0 is a direct fork of [Wrap HTML attributes on new lines](https://plugins.jetbrains.com/plugin/12766-wrap-html-attributes-on-new-lines) ([source](https://github.com/terrabythia/intellij_plugin_wrap_html_attributes)) by [Sander Bruggeman](https://github.com/terrabythia).

This repository is set to support IntelliJ-based IDEs versions starting from `2020.3` (because of '[IntelliJ project migrates to Java 11](https://blog.jetbrains.com/platform/2020/09/intellij-project-migrates-to-java-11/)').

Usage gif created with [ScreenToGif](https://github.com/NickeManarin/ScreenToGif) using [Dracula](https://github.com/dracula/jetbrains) theme.

---

Plugin version based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
