import { registerPlugin } from '@capacitor/core';

import type { CapacitorTapJackingPlugin } from './definitions';

const TapJacking = registerPlugin<CapacitorTapJackingPlugin>(
  'TapJacking',
  {
    web: () => import('./web').then(m => new m.CapacitorTapJackingWeb()),
  },
);

export * from './definitions';
export { TapJacking };
