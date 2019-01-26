import { NgModule } from '@angular/core';

import { FlexiflexSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [FlexiflexSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [FlexiflexSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class FlexiflexSharedCommonModule {}
