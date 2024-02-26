import { WebPlugin } from '@capacitor/core';

import type { CapacitorTapJackingPlugin } from './definitions';

export class CapacitorTapJackingWeb
  extends WebPlugin
  implements CapacitorTapJackingPlugin
{
  async setFilterTouchesWhenObscured(options: { value: boolean }): Promise<void> {
    if (!options) {
      console.log(`options have not been specified`);
    }
  }
}
