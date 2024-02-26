import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(CapacitorTapJackingPlugin)
public class CapacitorTapJackingPlugin: CAPPlugin {
    private let implementation = CapacitorTapJacking()

    @objc func setFilterTouchesWhenObscured(_ call: CAPPluginCall) {
        let value = call.getString("value") ?? ""
        call.resolve();
    }
}
