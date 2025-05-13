// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "CapacitorCommunityTapJacking",
    platforms: [.iOS(.v14)],
    products: [
        .library(
            name: "CapacitorCommunityTapJacking",
            targets: ["CapacitorTapJackingPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", exact: "7.1.0")
    ],
    targets: [
        .target(
            name: "CapacitorTapJackingPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/CapacitorTapJackingPlugin"),
        .testTarget(
            name: "CapacitorTapJackingPluginTests",
            dependencies: ["CapacitorTapJackingPlugin"],
            path: "ios/Tests/CapacitorTapJackingPluginTests")
    ]
)
