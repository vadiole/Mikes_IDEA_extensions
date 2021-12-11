
## Mike's IDEA extensions

[![IntelliJ IDEA Plugin](https://img.shields.io/jetbrains/plugin/v/12690-mike-s-idea-extensions?label=plugin&logo=intellij-idea)](https://plugins.jetbrains.com/plugin/12690-mike-s-idea-extensions/)
[![IntelliJ IDEA Plugin](https://img.shields.io/jetbrains/plugin/d/12690-mike-s-idea-extensions?logo=intellij-idea)](https://plugins.jetbrains.com/plugin/12690-mike-s-idea-extensions/)

<!-- start plugin.xml -->

Some great inspections, quickfixes, tools.

  <h3>UAST (Java + Kotlin) inspections</h3>
  <ul>
    <li>Atomic can be replaced with volatile</li>
    <li>Allocation should be cached (Enum.values(), new Gson(), ...)</li>
    <li>BigDecimal instantiation can be replaced with constant <em>by <a href="https://github.com/stokito/">stokito</a></em></li>
    <li>BigDecimal.compareTo(ZERO) can be replaced with signum() <em>by <a href="https://github.com/stokito/">stokito</a></em></li>
  </ul>

  <h3>Kotlin inspections</h3>
  <ul>
    <li>Heavyweight property delegation</li>
    <li>Declaration name is Java keyword</li>
    <li>Inline function leaks anonymous declaration which will be inlined to the call-site if called from another module</li>
    <li>Anonymous function won't be inlined;
      function cannot be inlined if it is a receiver of an extension function</li>
    <li>Nullable argument to string concatenation</li>
  </ul>

  <h3>Android inspections</h3>
  <ul>
    <li><code>&lt;include layout="?themeAttribute"&gt;</code> requires Marshmallow</li>
    <li><code>&lt;drawable android:tint&gt;</code> requires Lollipop</li>
    <li><code>@TargetApi</code> should be replaced with <code>@RequiresApi</code></li>
    <li>Use of reflective <code>ObjectAnimator</code>/<code>PropertyValuesHolder</code></li>
    <li>Use of attributes like <code>android.R.attr.enabled</code> in context where state attributes expected, like <code>android.R.attr.state_enabled</code></li>
    <li><code>Color.parseColor(&lt;constant expression&gt;)</code> should be replaced with an integer literal</li>
    <li>Useless Drawable element (single-item layer-lists, insetless insets, empty shapes, and vector elements: empty paths and clip-paths, invisible paths, useless clip-paths and groups, attributes with no effect)</li>
  </ul>

  <h3>Editor tweaks</h3>
  <ul>
    <li>Upcast to interface, e. g.<br/>putExtra(list<code> as Serializable</code>) (Java Only)</li>
    <li>Method override from superclass, e. g.<br/>@Override <code>from Runnable</code>,<br/>override <code>Runnable</code> fun run()</li>
    <li>ARGB Color swatches in gutter for Android (Java & Kotlin)</li>
  </ul>

<!-- end plugin.xml -->

  [Plugin page on JetBrains marketplace](https://plugins.jetbrains.com/plugin/12690-mike-s-idea-extensions)
