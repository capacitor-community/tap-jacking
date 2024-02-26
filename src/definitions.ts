export interface CapacitorTapJackingPlugin {
  setFilterTouchesWhenObscured(options: { value: boolean }): Promise<void>;
}
