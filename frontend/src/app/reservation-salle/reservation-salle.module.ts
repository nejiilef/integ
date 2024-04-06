import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ReservationSalleRoutingModule } from './reservation-salle-routing.module';
import { ResSalleComponent } from './res-salle/res-salle.component';


@NgModule({
  declarations: [
    ResSalleComponent
  ],
  imports: [
    CommonModule,
    ReservationSalleRoutingModule
  ]
})
export class ReservationSalleModule { }
