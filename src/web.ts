import { WebPlugin } from '@capacitor/core';

import type { CapacitorTapJackingPlugin } from './definitions';

export class CapacitorTapJackingWeb extends WebPlugin implements CapacitorTapJackingPlugin {
  async preventOverlays(): Promise<void> {
    return Promise.resolve();
  }
  async enableOverlays(): Promise<void> {
    return Promise.resolve();
  }
}
