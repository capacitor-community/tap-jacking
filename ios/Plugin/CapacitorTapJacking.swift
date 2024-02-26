import Foundation

@objc public class CapacitorTapJacking: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
