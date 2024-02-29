export interface CapacitorTapJackingPlugin {
  preventOverlays(): Promise<void>;
  enableOverlays(): Promise<void>;
}
