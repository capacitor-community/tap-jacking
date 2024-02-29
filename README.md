<p align="center"><br><img src="https://user-images.githubusercontent.com/236501/85893648-1c92e880-b7a8-11ea-926d-95355b8175c7.png" width="128" height="128" /></p>
<h3 align="center">Tap Jacking</h3>
<p align="center"><strong><code>@capacitor-community/tap-jacking</code></strong></p>
<p align="center">
  Tap Jacking is a technique where a malicious app tricks the user into clicking a security-relevant control (confirmation button etc.) by obscuring the UI with an overlay or by other means.

  This plugin prevents tap jacking by calling `setFilterTouchesWhenObscured(true)` (Android 11 and below) or `` (Android 12+) as described in the [Android Developer Documentation](https://developer.android.com/privacy-and-security/risks/tapjacking).

  On iOS and web this call does nothing.
</p>


## Install

```bash
npm install @capacitor-community/tap-jacking
npx cap sync
```
## Usage
```typescript
import { TapJacking } from '@capacitor-community/tap-jacking';
...
await TapJacking.preventOverlays();
```

## API

<docgen-index>

* [`preventOverlays()`](#preventoverlays)
* [`enableOverlays()`](#enableoverlays)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### preventOverlays()

```typescript
preventOverlays() => Promise<void>
```

--------------------


### enableOverlays()

```typescript
enableOverlays() => Promise<void>
```

--------------------

</docgen-api>
