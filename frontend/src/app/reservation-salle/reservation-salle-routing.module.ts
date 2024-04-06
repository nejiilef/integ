import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ResSalleComponent } from './res-salle/res-salle.component';
import { guardGuard } from '../auth/guard/guard.guard';
const routes: Routes = [
  { path : '' , component:ResSalleComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ReservationSalleRoutingModule { }
