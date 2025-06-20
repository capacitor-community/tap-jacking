import { TapJacking } from '@capacitor-community/tap-jacking';

window.preventOverlays = () => {
    TapJacking.preventOverlays();
}

window.enableOverlays = () => {
    TapJacking.enableOverlays();
}
